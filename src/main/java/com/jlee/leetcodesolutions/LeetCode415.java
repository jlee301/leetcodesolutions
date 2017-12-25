package com.jlee.leetcodesolutions;

public class LeetCode415 {
  /*
   * Given two non-negative integers num1 and num2 represented as string, return
   * the sum of num1 and num2.
   * 
   * Note: 
   * The length of both num1 and num2 is < 5100.
   * Both num1 and num2 contains only digits 0-9.
   * Both num1 and num2 does not contain any leading zero.
   * You must not use any built-in BigInteger library or convert the inputs to
   * integer directly.
   *
   * https://leetcode.com/problems/add-strings/description/
   */
  public String addStrings(String num1, String num2) {
    if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
      return "0";
    
    String result = "";
    int carry = 0;
    for(int i=num1.length()-1, j=num2.length()-1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
      int x = 0;
      if(i >= 0)
        x = num1.charAt(i) - '0';
      
      int y = 0;
      if(j >= 0)
        y = num2.charAt(j) - '0';
      
      result = ((x+y+carry) % 10) + result;
      carry = (x+y+carry) / 10;
    }
    return result;
  }
}
