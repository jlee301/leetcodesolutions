package com.jlee.leetcodesolutions;

public class LeetCode0043 {
  /*
   * Given two non-negative integers num1 and num2 represented as strings, return
   * the product of num1 and num2.
   * 
   * Note:
   * 1. The length of both num1 and num2 is < 110.
   * 2. Both num1 and num2 contains only digits 0-9.
   * 3. Both num1 and num2 does not contain any leading zero.
   * 4. You must not use any built-in BigInteger library or convert the inputs to
   * integer directly.
   * 
   * https://leetcode.com/problems/multiply-strings/description/
   */
  public String multiply(String num1, String num2) {
    if(num1 == null || num2 == null)
      return "0";
    
    int[] ans = new int[num1.length() + num2.length()];
    for(int i = num1.length()-1; i >= 0; i--) {
      for(int j = num2.length()-1; j >= 0; j--) {
        int left = i + j, right = i + j + 1;
        int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int sum = product + ans[right];
        ans[right] = sum % 10;
        ans[left] += sum / 10;
      }
    }
    
    StringBuilder sb = new StringBuilder();
    for(int num : ans) {
      if(!(sb.length() == 0 && num == 0))
        sb.append(num);
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }
}
