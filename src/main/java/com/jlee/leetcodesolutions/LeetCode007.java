package com.jlee.leetcodesolutions;

public class LeetCode007 {
  /*
   * Assume we are dealing with an environment which could only hold integers
   * within the 32-bit signed integer range. For the purpose of this problem,
   * assume that your function returns 0 when the reversed integer overflows.
   * 
   * Input: 123 
   * Output: 321
   * 
   * Input: -123 
   * Output: -321
   * 
   * Input: 120 
   * Output: 21
   * 
   * https://leetcode.com/problems/reverse-integer/description/
   */
  public int reverse(int x) {
    // Use long here to compensate for 32-bit overflow
    long result = 0;
    while (x != 0) {
      int remainder = x % 10;
      // System.out.println("Remainder: " + remainder);
      result = (result * 10) + remainder;
      // System.out.println("Result: " + result);
      x = x / 10;
      // System.out.println("x: " + x);
    }
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      // Integer.MAX_VALUE = 2147483647
      // Integer.MIN_VALUE = -2147483648
      return 0;
    } else {
      return (int) result;
    }
  }
}