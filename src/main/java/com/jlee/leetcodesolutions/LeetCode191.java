package com.jlee.leetcodesolutions;

public class LeetCode191 {
  /*
   * Write a function that takes an unsigned integer and returns the number of '1'
   * bits it has (also known as the Hamming weight).
   * 
   * For example, the 32-bit integer '11' has binary representation 
   * 0000 0000 0000 0000 0000 0000 0000 1011, so the function should return 3.
   * 
   * https://leetcode.com/problems/number-of-1-bits/description/
   */
  public int hammingWeight(int n) {
    int result = 0;
    for(int i = 0; i < 32; i++) {
      result += n & 1;
      n >>= 1;
    }
    return result;
  }
}
