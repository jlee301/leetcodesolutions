package com.jlee.leetcodesolutions;

public class LeetCode0474 {
  /*
   * In the computer world, use restricted resource you have to generate maximum
   * benefit is what we always want to pursue.
   * 
   * For now, suppose you are a dominator of m 0s and n 1s respectively. On the
   * other hand, there is an array with strings consisting of only 0s and 1s.
   * 
   * Now your task is to find the maximum number of strings that you can form with
   * given m 0s and n 1s. Each 0 and 1 can be used at most once.
   * 
   * Note:
   * 1. The given numbers of 0s and 1s will both not exceed 100
   * 2. The size of given string array won't exceed 600.
   * 
   * https://leetcode.com/problems/ones-and-zeroes/description/
   */
  public int findMaxForm(String[] strs, int m, int n) {
    if(strs == null || strs.length == 0)
      return 0;
    int[][] memo = new int[m+1][n+1];
    for(String str : strs) {
      int[] count = new int[2];
      // count[0] = # of 0's, count[1] = # of 1's
      for(int i = 0; i < str.length(); i++)
        count[str.charAt(i)-'0']++;
      
      for(int j = m; j >= count[0]; j--) {
        for(int k = n; k >= count[1]; k--)
          memo[j][k] = Math.max(memo[j][k], memo[j-count[0]][k-count[1]] + 1);
      }
    }
    return memo[m][n];
  }
}
