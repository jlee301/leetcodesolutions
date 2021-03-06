package com.jlee.leetcodesolutions;

public class LeetCode0342 {
  /*
   * Given an integer (signed 32 bits), write a function to check whether it is a
   * power of 4.
   * 
   * Example: 
   * Given num = 16, return true. Given num = 5, return false.
   * 
   * Follow up: 
   * Could you solve it without loops/recursion?
   * 
   * https://leetcode.com/problems/power-of-four/description/
   */
  public boolean isPowerOfFour(int num) {
    long result = 1;
    while(result < num)
      result *= 4;
    
    return result == num;
  }
}
