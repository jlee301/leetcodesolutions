package com.jlee.leetcodesolutions;

public class LeetCode409 {
  /*
   * Given a string which consists of lowercase or uppercase letters, find the
   * length of the longest palindromes that can be built with those letters.
   * 
   * This is case sensitive, for example "Aa" is not considered a palindrome here.
   * 
   * Note: 
   * Assume the length of given string will not exceed 1,010.
   * 
   * Example:
   * Input: "abccccdd"
   * Output: 7
   * Explanation: One longest palindrome that can be built is "dccaccd", whose
   * length is 7.
   * 
   * https://leetcode.com/problems/longest-palindrome/description/
   */
  public int longestPalindrome(String s) {
    int[] count = new int[58];
    for(int i = 0; i < s.length(); i++)
      count[s.charAt(i) - 'A']++;
    
    int result = 0;
    // Get all pairs of characters
    for(int i = 0; i < 58; i++) {
      int pairs = count[i] / 2;
      result += pairs * 2;
      count[i] -= pairs * 2;
    }
    
    // Now if there's one character left, we can use it
    for(int i = 0; i < 58; i++) {
      if(count[i] > 0) {
        result++;
        break;
      }
    }
    return result;
  }
}
