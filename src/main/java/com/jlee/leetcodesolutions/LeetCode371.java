package com.jlee.leetcodesolutions;

public class LeetCode371 {
  /*
   * Calculate the sum of two integers a and b, but you are not allowed to use the
   * operator + and -.
   * 
   * Example: 
   * Given a = 1 and b = 2, return 3.
   * 
   * https://leetcode.com/problems/sum-of-two-integers/description/
   */
  public int getSum(int a, int b) {
    // XOR simulates addition w/o the carry
    // AND simulates the carry results, but needs to be shifted 1 bit to the right
    while(b != 0) {
      int carry = a & b;
      carry <<= 1;
      a ^= b;
      b = carry;
    }
    return a;
  }
}
