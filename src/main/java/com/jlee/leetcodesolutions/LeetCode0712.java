package com.jlee.leetcodesolutions;

public class LeetCode0712 {
  /*
   * Given two strings s1, s2, find the lowest ASCII sum of deleted characters to
   * make two strings equal.
   * 
   * Note:
   * 1. 0 < s1.length, s2.length <= 1000.
   * 2. All elements of each string will have an ASCII value in [97, 122].
   */
  public int minimumDeleteSum(String s1, String s2) {
    return minimumDeleteSum(s1, s2, s1.length()-1, s2.length()-1, new int[s1.length()][s2.length()]);
  }
  
  private int minimumDeleteSum(String s1, String s2, int i, int j, int[][] memo) {
    if(i < 0 && j < 0)
      return 0;
    if(i < 0)
      // s1 is empty, just advance s2
      return minimumDeleteSum(s1, s2, i, j-1, memo) + s2.charAt(j);
    if(j < 0)
      // s2 is empty, just advance s1
      return minimumDeleteSum(s1, s2, i-1, j, memo) + s1.charAt(i);
    
    if(memo[i][j] != 0)
      return memo[i][j];

    if(s1.charAt(i) == s2.charAt(j))
      // If characters are the same, advance both i and j without increasing sum
      memo[i][j] = minimumDeleteSum(s1, s2, i-1, j-1, memo);
    else
      // Trial and error, which is smaller sum, advancing i or j
      memo[i][j] = Math.min(minimumDeleteSum(s1, s2, i-1, j, memo) + s1.charAt(i), minimumDeleteSum(s1, s2, i, j-1, memo) + s2.charAt(j));
    return memo[i][j];
  }
}
