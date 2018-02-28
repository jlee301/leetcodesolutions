package com.jlee.leetcodesolutions;

public class LeetCode201 {
  /*
   * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND
   * of all numbers in this range, inclusive.
   * 
   * For example, given the range [5, 7], you should return 4.
   * 
   * https://leetcode.com/problems/bitwise-and-of-numbers-range/description/
   */
  public int rangeBitwiseAnd(int m, int n) {
    if(m == 0)
      return 0;
    
    int noOfBitsBeforeSame = 0;
    while(m != n) {
      // This loop will stop once a common prefix is found. If none is found, it will
      // stop when both m and n are zero.
      m >>= 1;
      n >>= 1;
      noOfBitsBeforeSame++;
    }
    return n << noOfBitsBeforeSame;
  }
}
