package com.jlee.leetcodesolutions;

public class LeetCode097 {
  /*
   * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
   * 
   * https://leetcode.com/problems/interleaving-string/
   */
  public boolean isInterleave(String s1, String s2, String s3) {
    if(s1.length() + s2.length() != s3.length())
      return false;
    
    return helper(s1, s2, s3, 0, 0, 0, new Boolean[s1.length()+1][s2.length()+1][s3.length()+1]);
  }
  
  private boolean helper(String s1, String s2, String s3, int i, int j, int k, Boolean memo[][][]) {
    // Base case
    if(i == s1.length() && j == s2.length())
      return true;
    
    if(memo[i][j][k] != null)
      return memo[i][j][k];
    
    boolean path1 = false;
    if(i < s1.length() && s1.charAt(i) == s3.charAt(k))
      path1 = helper(s1, s2, s3, i+1, j, k+1, memo);
    
    boolean path2 = false;
    if(j < s2.length() && s2.charAt(j) == s3.charAt(k))
      path2 = helper(s1, s2, s3, i, j+1, k+1, memo);
    
    memo[i][j][k] = path1 || path2;
    return memo[i][j][k];
  }
}
