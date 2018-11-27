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
    if(x < 0)
      return false;
    
    // Reconstruct x in reverse
    int temp = x;
    int reversedX = 0;
    while(temp != 0) {
      int r = temp % 10;
      temp /= 10;
      reversedX *= 10;
      reversedX += r;
    }
    return x == reversedX;
  }
}
