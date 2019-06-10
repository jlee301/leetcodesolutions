package com.jlee.leetcodesolutions;

public class LeetCode1081 {
  /*
   * https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
   */
  public String smallestSubsequence(String text) {
    // Determine frequency of each character
    int[] count = new int[26];
    for(int i = 0; i < text.length(); i++)
      count[text.charAt(i) - 'a']++;
    
    boolean[] used = new boolean[26];
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      count[ch - 'a']--;
      
      if(!used[ch - 'a']) {
        // If the last char appended
        // 1. is lexicographically greater than the current char
        // 2. and another exist after the current char
        // Then we can remove the last character appended and use current
        while(sb.length() > 0 && sb.charAt(sb.length()-1) > ch && count[sb.charAt(sb.length()-1) - 'a'] > 0) {
          used[sb.charAt(sb.length()-1) - 'a'] = false;
          sb.deleteCharAt(sb.length()-1);
        }
        sb.append(ch);
        used[ch - 'a'] = true;
      }
    }
    return sb.toString();
  }  
}
