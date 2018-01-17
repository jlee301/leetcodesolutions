package com.jlee.leetcodesolutions;

public class LeetCode680 {
  /*
   * Given a non-empty string s, you may delete at most one character. Judge
   * whether you can make it a palindrome.
   * 
   * Example 1:
   * Input: "aba"
   * Output: True
   * 
   * Example 2:
   * Input: "abca"
   * Output: True
   * 
   * Explanation: You could delete the character 'c'.
   * 
   * Note:
   * 1. The string will only contain lowercase characters a-z.
   * 2. The maximum length of the string is 50000.
   * 
   * https://leetcode.com/problems/valid-palindrome-ii/description/
   */
  public boolean validPalindrome(String s) {
    if(s == null || s.length() == 0)
      return false;
    
    int start = 0, end = s.length()-1, remove = 0;
    while(start < end) {
      if(s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        remove++;
        if(remove > 1)
          return false;
        
        if(s.charAt(start) == s.charAt(end - 1)) {
          // Remove character at end pointer
          end = end - 2;
          start++;
        } else if(s.charAt(start + 1) == s.charAt(end)) {
          // Remove character at start pointer
          start = start + 2;
          end--;
        } else {
          // Removing character at start/end pointer still does not match
          return false;
        }
      }
    }
    return true;
  }
}
