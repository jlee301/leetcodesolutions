package com.jlee.leetcodesolutions;

public class LeetCode044 {
  /*
   * Given an input string (s) and a pattern (p), implement wildcard pattern
   * matching with support for '?' and '*'.
   * 
   * '?' Matches any single character.
   * '*' Matches any sequence of characters (including the empty sequence).
   * 
   * The matching should cover the entire input string (not partial).
   * 
   * Note:
   * 1. s could be empty and contains only lowercase letters a-z.
   * 2. p could be empty and contains only lowercase letters a-z, and characters
   * like ? or *.
   * 
   * https://leetcode.com/problems/wildcard-matching/
   */
  public boolean isMatch(String s, String p) {
    return helper(s, p, 0, 0, new Boolean[s.length()+1][p.length()+1]);
  }
  
  private boolean helper(String s, String p, int i, int j, Boolean[][] memo) {
    if(memo[i][j] != null)
      return memo[i][j];
    
    if(i == s.length() && j == p.length())
      return true;
    
    // Scenario at end of s[len] and p[j] == '*': 
    // "", "*"
    // "a", "a*"
    if(i == s.length() && p.charAt(j) == '*') {
      // check to see if there are consecutive wildcards (*)
      // this should result in j being the index of the last * that is consecutive
      while(j+1 < p.length() && p.charAt(j+1) == '*') 
        j++;
      
      memo[i][j] = helper(s, p, i, j+1, memo);
      return memo[i][j];
    }
    
    if(i == s.length() || j == p.length())
      return false;
    
    if(p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
      memo[i][j] = helper(s, p, i+1, j+1, memo);
      return memo[i][j];
    }
    
    if(p.charAt(j) == '*') {
      // check to see if there are consecutive wildcards (*)
      // this should result in j being the index of the last * that is consecutive
      while(j+1 < p.length() && p.charAt(j+1) == '*') 
        j++;
      
      // now try every possible starting point from s[i] : s[len]
      for(int k = i; k <= s.length(); k++) {
        if(helper(s, p, k, j+1, memo)) {
          memo[i][j] = true;
          return true;
        }
      }
    }
    memo[i][j] = false;
    return false;
  }
}
