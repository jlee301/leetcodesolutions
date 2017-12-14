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
    if (strs.length == 0)
      return "";
    // Start with first word
    // Set the commonLength to the length of the first word
    String result = strs[0];
    int commonLength = result.length();

    for (int i = 1; i < strs.length; i++) {
      // System.out.println("i: " + i);
      // If the other words in the array are shorter, set
      // as the commonLength. This is to avoid going out
      // of bounds on character comparison.
      if (strs[i].length() < commonLength) {
        commonLength = strs[i].length();
      }

      int match = 0;
      while (match < commonLength) {
        if (result.charAt(match) == strs[i].charAt(match)) {
          // System.out.println(result.charAt(match));
          match++;
        } else {
          // Set the commonLength to the index of the last
          // character match. Break out of the while loop
          // as there's no reason to keep comparing.
          commonLength = match;
          // System.out.println("commonLength: " + commonLength);
          break;
        }
      }
    }
    result = result.substring(0, commonLength);
    // System.out.println("common prefix: " + result);
    return result;
  }
}
