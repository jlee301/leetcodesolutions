package com.jlee.leetcodesolutions;

public class LeetCode067 {
  /*
   * Given two binary strings, return their sum (also a binary string).
   * 
   * Input: a = "11", b = "1" 
   * Output: "100"
   * 
   * https://leetcode.com/problems/add-binary/description/
   */
  public String addBinary(String a, String b) {
    if (a == null || a.length() == 0)
      a = "0";
    if (b == null || b.length() == 0)
      b = "0";

    /*
     * Adding binary per column guide: 
     * data = 1 + 1 + 1 = 3 --> This should never exceed 3 because binary 
     * col = data % 2 = 1 --> 0 for even or 1 for odd 
     * carry = data / 2 = 1 --> 0 or 1
     */
    int aLen = a.length() - 1;
    int bLen = b.length() - 1;
    int data = 0;
    int col = 0;
    int carry = 0;
    String result = "";

    while (aLen >= 0 || bLen >= 0 || carry == 1) {
      data = carry;
      if (aLen >= 0) {
        // This check is if aLen > bLen to avoid out of bounds
        data = data + Character.getNumericValue(a.charAt(aLen--));
      }
      if (bLen >= 0) {
        // This check is if aLen < bLen to avoid out of bounds
        data = data + Character.getNumericValue(b.charAt(bLen--));
      }
      col = data % 2;
      carry = data / 2;
      // System.out.println("data: " + data);
      // System.out.println("col: " + col);
      // System.out.println("carry: " + carry);
      result = col + result;
    }
    // System.out.println("result: " + result);
    return result;
  }
}
