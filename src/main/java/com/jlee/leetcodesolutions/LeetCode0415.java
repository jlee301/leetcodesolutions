package com.jlee.leetcodesolutions;

public class LeetCode0415 {
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
    int i = num1.length()-1;
    int j = num2.length()-1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while(i >= 0 || j >= 0) {
      int add = (i >= 0 ? num1.charAt(i) - '0' : 0) + (j >= 0 ? num2.charAt(j) - '0' : 0) + carry;
      carry = add / 10;
      add %= 10;
      sb.insert(0, add);
      i--;
      j--;
    }
    
    if(carry > 0)
      sb.insert(0, carry);
    
    return sb.toString();
  }
}
