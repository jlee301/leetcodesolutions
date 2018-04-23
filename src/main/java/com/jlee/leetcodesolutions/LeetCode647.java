package com.jlee.leetcodesolutions;

public class LeetCode647 {
  /*
   * Given a string, your task is to count how many palindromic substrings in this
   * string.
   * 
   * The substrings with different start indexes or end indexes are counted as
   * different substrings even they consist of same characters.
   * 
   * Example 1:
   * Input: "abc"
   * Output: 3
   * Explanation: Three palindromic strings: "a", "b", "c".
   * 
   * Example 2:
   * Input: "aaa"
   * Output: 6
   * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
   * 
   * Note:
   * 1. The input string length won't exceed 1000.
   * 
   * https://leetcode.com/problems/palindromic-substrings/description/
   */
  public int countSubstrings(String s) {
    int count = 0;
    if(s == null || s.isEmpty())
      return count;

    for(int i = 0; i < s.length(); i++) {
      for(int j = i; j < s.length(); j++) {
        if(isPalindrome(s, i, j))
          count++;
      }
    }
    return count;
  }
  
  private boolean isPalindrome(String s, int start, int end) {
    while(start < end) {
      if(s.charAt(start) != s.charAt(end))
        return false;
      start++;
      end--;
    }
    return true;
  }
}
