package com.jlee.leetcodesolutions;

public class LeetCode405 {
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
    
    String result = "";
    char[] hexMap = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    
    // Treat as unsigned because of negative support. To access 4 bits at a time
    //   0000 0000 0000 0000 0000 0000 0000 0001 (1) 
    // & 0000 0000 0000 0000 0000 0000 0000 1111 (15)
    // = 0000 0000 0000 0000 0000 0000 0000 0001 (1)
    //
    //   1111 1111 1111 1111 1111 1111 1111 1111 (-1)
    // & 0000 0000 0000 0000 0000 0000 0000 1111 (15)
    // = 0000 0000 0000 0000 0000 0000 0000 1111 (15)
    while(num != 0) {
      result = hexMap[num & 15] + result;
      System.out.println(Integer.bitCount(num & 15));
      // This will treat as unsigned and insert four zeroes at the left position.
      num = num >>> 4;
    }
    return result;
  }
}
