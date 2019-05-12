package com.jlee.leetcodesolutions;

public class LeetCode1043 {
  /*
   * https://leetcode.com/problems/partition-array-for-maximum-sum/ 
   */
  public int maxSumAfterPartitioning(int[] A, int K) {
    return dfs(A, K, 0, new Integer[A.length]);
  }
  
  private int dfs(int[] A, int K, int pos, Integer[] memo) {
    if(pos == A.length)
      return 0;
    
    if(memo[pos] != null)
      return memo[pos];
    
    // We want the max element from A[pos : pos+k]
    int maxElement = 0, maxSum = 0;
    for(int i = 0; i < K && pos+i < A.length; i++) {
      maxElement = Math.max(maxElement, A[pos+i]);
      maxSum = Math.max(maxSum, maxElement * (i+1) + dfs(A, K, pos+i+1, memo));
    }
    memo[pos] = maxSum;
    return maxSum;
  }
}
