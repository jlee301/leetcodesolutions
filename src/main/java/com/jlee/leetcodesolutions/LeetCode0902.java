package com.jlee.leetcodesolutions;

public class LeetCode0902 {
  /*
   * We have a sorted set of digits D, a non-empty subset of
   * {'1','2','3','4','5','6','7','8','9'}. (Note that '0' is not included.)
   * 
   * Now, we write numbers using these digits, using each digit as many times as
   * we want. For example, if D = {'1','3','5'}, we may write numbers such as
   * '13', '551', '1351315'.
   * 
   * Return the number of positive integers that can be written (using the digits
   * of D) that are less than or equal to N.
   * 
   * https://leetcode.com/problems/numbers-at-most-n-given-digit-set/description/
   */
  public int atMostNGivenDigitSet(String[] D, int N) {
    String s = String.valueOf(N);
    int K = s.length();
    int[] dp = new int[K+1];
    dp[K] = 1;
    
    // Calculate all possible valid digits < K lengths (1, 2, 3, ... K-1)
    for(int i = 1; i < K; i++)
      dp[0] += Math.pow(D.length, i);
    
    // Now calculate all possible valid K length digits
    // We must evaluate each digit in N
    for(int i = K-1; i >= 0; i--) {
      int limit = s.charAt(i) - '0';
      for(String str : D) {
        int d = Integer.valueOf(str);
        if(d < limit) {
          // If there is a digit < N value at the Kth placement, then we add all
          // possibilities of the D.length^K-1
          dp[i] += Math.pow(D.length, K-i-1);
        }
        else if(d == limit)
          dp[i] += dp[i+1];
      }
    }    
    return dp[0];
  }
}
