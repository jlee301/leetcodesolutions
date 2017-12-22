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
    if(a == 0)
      return b;
    if(b == 0)
      return a;

    // The XOR operation is like adding but w/o any binary carries:
    //  0010 (2)    0010    
    // +0011 (3)   ^0011
    // =0101 (5)   =0001
    // 
    // So we used the AND operation to determine if there's any carries, but we will
    // need to shift the result to the left to be in the right placement
    //  0010
    // &0011
    // =0010 --> 0100
    //
    // Lastly we XOR the XOR result with the carry result to get the sum. You repeat
    // this process until carry is zero.
    //  0001
    // ^0100
    // =0101 <-- 5
    while(b != 0) {
      int carry = a & b;
      carry = carry << 1;
      a = a ^ b;
      b = carry;
    }
    return a;
  }
}
