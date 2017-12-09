package com.jlee.leetcodesolutions;

public class LeetCode009 {
  /*
   * Determine whether an integer is a palindrome. Do this without extra space.
   * Assume negative numbers are not palindromes.
   * 
   * Input: 1221 
   * Output: true
   * 
   * Input: 1234 
   * Output: false
   * 
   * Input: 12210 
   * Output: false
   * 
   * Input: -1 
   * Output: false
   * 
   * https://leetcode.com/problems/palindrome-number/description/
   */
  public boolean isPalindrome(int x) {
    if (x < 0) {
      // Negative numbers are not palindromes.
      return false;
    } else {
      int copyOriginal = x;
      // Use long here to compensate for 32-bit overflow
      long result = 0;
      while (copyOriginal != 0) {
        int remainder = copyOriginal % 10;
        result = (result * 10) + remainder;
        copyOriginal = copyOriginal / 10;
      }
      if (result == x)
        return true;
      else
        return false;
    }
  }
}