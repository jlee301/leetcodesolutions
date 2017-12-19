package com.jlee.leetcodesolutions;

public class LeetCode231 {
  /*
   * Given an integer, write a function to determine if it is a power of two.
   * 
   * https://leetcode.com/problems/power-of-two/description/
   */
  public boolean isPowerOfTwo(int n) {
    while(n > 1) {
      if(n % 2 != 0)
        return false;
      else
        n = n / 2;
    }
    return n == 1;
  }
  
  public boolean isPowerOfTwoBit(int n) {
    // 0001 - 1, 0010 - 2, 0100 - 4, 1000 - 8, 0001 0000 - 16
    // 0000 - 0, 0011 - 3, 0101 - 5, 0110 - 6, 0001 0001 - 17
    // The pattern here is that Power of 2's only have one bit.
    return n > 0 && Integer.bitCount(n) == 1;
  }
}
