package com.jlee.leetcodesolutions;

public class LeetCode279 {
  /*
   * Given a positive integer n, find the least number of perfect square numbers
   * (for example, 1, 4, 9, 16, ...) which sum to n.
   * 
   * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13,
   * return 2 because 13 = 4 + 9.
   * 
   * https://leetcode.com/problems/perfect-squares/description/
   */
  public int numSquares(int n) {
    if(n < 1)
      return 0;
    
    /*
     * memo[n] = least count of perfect square numbers that sum to n
     * 
     * memo[13] --> memo[13 - 1*1] + memo[1*1] --> memo[12] + 1
     *              memo[13 - 2*2] + memo[2*2] --> memo[9] + 1
     *              memo[13 - 3*3] + memo[3*3] --> memo[4] + 1
     * 
     * The min value of these three computations would equal memo[13].
     * 
     * This leads to a formula to use memo[i] = 1 + min( memo[i - j*j] ) 
     * for j*j <= i
     */
    int[] memo = new int[n+1];
    memo[0] = 0;
    for(int i = 1; i <= n; i++) {
      int min = Integer.MAX_VALUE;
      for(int j = 1; j*j <= i; j++)
        min = Math.min(min, memo[i - j*j] + 1);
      memo[i] = min;
    }
    return memo[n];
  }
}
