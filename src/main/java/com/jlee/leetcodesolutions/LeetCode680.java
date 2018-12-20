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
    int left = 0, right = s.length()-1;
    // Find first unmatching char
    while(left < right) {
      if(s.charAt(left) != s.charAt(right)) {
        // We either delete s[left] or s[right]
        return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
      }
      left++;
      right--;
    }
    // The input is already a palindrome
    return true;
  }
  
  private boolean isPalindrome(String s, int left, int right) {
    // Check if remaining string is a palindrome
    while(left < right) {
      if(s.charAt(left++) != s.charAt(right--))
        return false;
    }
    return true;
  }
}
