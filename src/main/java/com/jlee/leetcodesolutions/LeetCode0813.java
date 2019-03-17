package com.jlee.leetcodesolutions;

public class LeetCode0813 {
  /*
   * We partition a row of numbers A into at most K adjacent (non-empty) groups,
   * then our score is the sum of the average of each group. What is the largest
   * score we can achieve?
   * 
   * Note that our partition must use every number in A, and that scores are not
   * necessarily integers.
   * 
   * Note:
   * 1. 1 <= A.length <= 100.
   * 2. 1 <= A[i] <= 10000.
   * 3. 1 <= K <= A.length.
   * 4. Answers within 10^-6 of the correct answer will be accepted as correct.
   * 
   * https://leetcode.com/problems/largest-sum-of-averages/description/
   */
  public double largestSumOfAverages(int[] A, int K) {
    // sum[i] = sum of A[0] thru A[i]
    int[] sum = new int[A.length];
    sum[0] = A[0];
    for(int i = 1; i < A.length; i++)
      sum[i] = sum[i-1] + A[i];
    
    return largestSumOfAverages(A, K, sum, 0, A.length, new double[A.length][K+1]);
  }
  
  private double largestSumOfAverages(int[] A, int K, int[] sum, int pos, int N, double[][] memo) {
    if(K == 1)
      return ((double) (sum[N-1] - sum[pos] + A[pos]) / (N - pos)); 
    
    if(memo[pos][K] != 0.0)
      return memo[pos][K];
    
    for(int i = pos; i <= N-K; i++)
      memo[pos][K] = Math.max(memo[pos][K], ((double) (sum[i] - sum[pos] + A[pos]) / (i - pos + 1)) + largestSumOfAverages(A, K-1, sum, i+1, N, memo)); 
    return memo[pos][K];
  }
}
