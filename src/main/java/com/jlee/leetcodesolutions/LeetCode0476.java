package com.jlee.leetcodesolutions;

public class LeetCode0476 {
  /*
   * Given a positive integer, output its complement number. The complement
   * strategy is to flip the bits of its binary representation.
   * 
   * Note:
   * 1. The given integer is guaranteed to fit within the range of a 32-bit signed
   * integer.
   * 2. You could assume no leading zero bit in the integer’s binary
   * representation.
   * 
   * Example 1: 
   * Input: 5 
   * Output: 2
   * 
   * Explanation: The binary representation of 5 is 101 (no leading zero bits),
   * and its complement is 010. So you need to output 2.
   * 
   * Example 2: 
   * Input: 1 
   * Output: 0
   * 
   * Explanation: The binary representation of 1 is 1 (no leading zero bits), and
   * its complement is 0. So you need to output 0.
   * 
   * https://leetcode.com/problems/number-complement/description/
   */
  public int findComplement(int num) {
    // Obtain max number based off num
    // ie num = 5 --> 101
    //      n = 7 --> 111
    // The diff is num inverted
    //   diff = 2 --> 010
    int n = 1;
    while(n < num)
      n = (n << 1) | 1;
    
    return n - num;
  }
}
