package com.jlee.leetcodesolutions;

public class LeetCode0005 {
  /*
   * Given a string s, find the longest palindromic substring in s. You may assume
   * that the maximum length of s is 1000.
   * 
   * Example:
   * Input: "babad"
   * Output: "bab"
   * Note: "aba" is also a valid answer.
   * 
   * Example:
   * Input: "cbbd"
   * Output: "bb"
   * 
   * https://leetcode.com/problems/longest-palindromic-substring/description/
   */
  private String result;
  
  public String longestPalindrome(String s) {
    result = "";
    if(s == null || s.length() == 0)
      return result;
    
    for(int i = 0; i < s.length(); i++) {
      for(int j = s.length()-1; j >= i && j-i+1 > result.length(); j--) {
        isPalindrome(s, i, j);
      }
    }
    return result;
  }
  
  private void isPalindrome(String s, int i, int j) {
    int start = i, end = j;
    while(start < end) {
      if(s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        return;
      }
    }
    result = s.substring(i, j+1);
  }
}
