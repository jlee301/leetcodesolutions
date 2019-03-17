package com.jlee.leetcodesolutions;

public class LeetCode0231 {
  /*
   * Given an integer, write a function to determine if it is a power of two.
   * 
   * https://leetcode.com/problems/power-of-two/description/
   */
  public boolean isPowerOfTwo(int n) {
    int x = 1;
    // Check every possible Power of 2 value
    for(int i = 0; i < 31 && x <= n; i++) {
      if(x == n)
        return true;
      x <<= 1;
    }
    return false;
  }
}
