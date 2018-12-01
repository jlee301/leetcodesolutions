package com.jlee.leetcodesolutions;

public class LeetCode190 {
  /*
   * Reverse bits of a given 32 bits unsigned integer.
   * 
   * For example, given input 43261596 (represented in binary as
   * 00000010100101000001111010011100), return 964176192 (represented in binary as
   * 00111001011110000010100101000000).
   * 
   * https://leetcode.com/problems/reverse-bits/description/
   */
  public int reverseBits(int n) {
    int result = 0;
    for(int i = 0; i < 32; i++) {
      // Shift result to the left 1 bit
      result <<= 1;
      // Add least significant bit of n to result
      result |= n & 1;      
      // Shift n to the right 1 bit
      n >>= 1;
    }
    return result;
  }
}
