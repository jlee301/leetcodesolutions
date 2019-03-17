package com.jlee.leetcodesolutions;

public class LeetCode0067 {
  /*
   * Given two binary strings, return their sum (also a binary string).
   * 
   * Input: a = "11", b = "1" 
   * Output: "100"
   * 
   * https://leetcode.com/problems/add-binary/description/
   */
  public String addBinary(String a, String b) {
    // 1 1
    //  1010
    //  1011
    // 10101     
    // XOR = different 1, same 0
    String result = "";
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    while(i >= 0 || j >= 0) {
      int num1 = i >= 0 ? Character.getNumericValue(a.charAt(i--)) : 0;
      int num2 = j >= 0 ? Character.getNumericValue(b.charAt(j--)) : 0;
      result = (num1 ^ num2 ^ carry) + result;
      carry = (num1 + num2 + carry > 1) ? 1 : 0; 
    }    
    return carry > 0 ? carry + result : result;
  }
}
