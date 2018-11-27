package com.jlee.leetcodesolutions;

public class LeetCode014 {
  /*
   * Write a function to find the longest common prefix string amongst an array of
   * strings.
   * 
   * Input: { leets, leetcode, leet, leeds } 
   * Output: lee
   * 
   * I assume to return empty string when there's no common prefix
   * 
   * https://leetcode.com/problems/longest-common-prefix/description/
   */
  public String longestCommonPrefix(String[] strs) {
    String result = "";
    if(strs == null || strs.length == 0)
      return result;
    
    for(int i = 0; i < strs[0].length(); i++) {
      // We use strs[0] as reference to the other words
      boolean allIncluded = true;
      char ch = strs[0].charAt(i);
      for(int j = 1; j < strs.length; j++) {
        // Check remaining words if char is the same
        if(i == strs[j].length() || ch != strs[j].charAt(i)) {
          allIncluded = false;
          break;
        }
      }
      if(allIncluded)
        result += ch;
      else
        break;
    }
    return result;
  }
}
