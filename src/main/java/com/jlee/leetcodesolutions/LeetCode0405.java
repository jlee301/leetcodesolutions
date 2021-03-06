package com.jlee.leetcodesolutions;

public class LeetCode0405 {
  /*
   * Given an integer, write an algorithm to convert it to hexadecimal. For
   * negative integer, two’s complement method is used.
   * 
   * Note: 1. All letters in hexadecimal (a-f) must be in lowercase.
   * 
   * 2.The hexadecimal string must not contain extra leading 0s. If the number is
   * zero, it is represented by a single zero character '0'; otherwise, the first
   * character in the hexadecimal string will not be the zero character.
   * 
   * 3.The given number is guaranteed to fit within the range of a 32-bit signed
   * integer.
   * 
   * 4. You must not use any method provided by the library which converts/formats
   * the number to hex directly.
   * 
   * https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/
   */
  public String toHex(int num) {
    if(num == 0)
      return "0";
    
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    String result = "";
    // 26
    // 0001 1010
    while(num != 0) {
      // Get the next four bits
      int hex = num & 15;
      result = map[hex] + result;
      // Shift num four bits to right
      num >>>= 4;
    }
    return result;
  }
}
