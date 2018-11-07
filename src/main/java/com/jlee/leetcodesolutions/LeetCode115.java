package com.jlee.leetcodesolutions;

public class LeetCode115 {
  /*
   * Given a string S and a string T, count the number of distinct subsequences of
   * S which equals T.
   * 
   * A subsequence of a string is a new string which is formed from the original
   * string by deleting some (can be none) of the characters without disturbing
   * the relative positions of the remaining characters. (ie, "ACE" is a
   * subsequence of "ABCDE" while "AEC" is not).
   * 
   * https://leetcode.com/problems/distinct-subsequences/
   */
  public int numDistinct(String s, String t) {
    return helper(s, t, 0, 0, new Integer[s.length() + 1][t.length() + 1]);
  }
  
  private int helper(String s, String t, int i, int j, Integer[][] memo) {
    // i = index position of s
    // j = index position of t
    if(j == t.length())
      return 1;
    
    if(i == s.length())
      return 0;
    
    if(memo[i][j] != null)
      return memo[i][j];
    
    int count = 0;
    if(s.charAt(i) == t.charAt(j))
      count += helper(s, t, i+1, j+1, memo);
    
    // check other subsequences or until we find a match
    count += helper(s, t, i+1, j, memo);
    
    memo[i][j] = count;
    return count;
  }
}
