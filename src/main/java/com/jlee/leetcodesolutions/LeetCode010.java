package com.jlee.leetcodesolutions;

public class LeetCode010 {
  /*
   * Given an input string (s) and a pattern (p), implement regular expression
   * matching with support for '.' and '*'.
   * '.' Matches any single character.
   * '*' Matches zero or more of the preceding element.
   * The matching should cover the entire input string (not partial).
   * 
   * Note:
   * s could be empty and contains only lowercase letters a-z.
   * p could be empty and contains only lowercase letters a-z, and characters like
   * . or *.
   * 
   * https://leetcode.com/problems/regular-expression-matching/
   */
  public boolean isMatch(String s, String p) {
    return helper(s, p, 0, 0);
  }
  
  private boolean helper(String s, String p, int i, int j) {
    if(i == s.length() && j == p.length())
      return true;
    
    if(j == p.length())
      return false;
    
    // p[j] is associated to asterisk
    if(j < p.length()-1 && p.charAt(j+1) == '*') {
      if(p.charAt(j) == '.') {
        // Check zero matches to all
        for(int k = i; k <= s.length(); k++) {
          if(helper(s, p, k, j+2))
            return true;
        }
      }
      else {
        // Asterisk matches 0 times
        if(helper(s, p, i, j+2))
          return true;
        
        // Keep extending while s[k] == p[j]
        for(int k = i+1; k <= s.length() && s.charAt(k-1) == p.charAt(j); k++) {
          if(helper(s, p, k, j+2))
            return true;
        }
      }
    }
    else if(i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
      if(helper(s, p, i+1, j+1))
        return true;
    }
    return false;
  }
}
