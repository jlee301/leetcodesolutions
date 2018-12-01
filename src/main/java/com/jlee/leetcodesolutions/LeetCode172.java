package com.jlee.leetcodesolutions;

public class LeetCode172 {
  /*
   * Given an integer n, return the number of trailing zeroes in n!.
   * 
   * Note: Your solution should be in logarithmic time complexity.
   * 
   * https://leetcode.com/problems/factorial-trailing-zeroes/description/
   * 
   *  5! = 120 = 1 (5 / 5 = 1)
   * 10! = 3 628 800 = 2 (10 / 5) = 2
   * 20! = 2 432 902 008 176 640 000 = 4 (20 / 5) = 3
   * 25! = 15 511 210 043 330 985 984 000 000 = (25 / 5) = 5 + (5 / 5) = 6
   * 30! = 265 252 859 812 191 058 636 308 480 000 000 = 7 = (30 / 5) = 6 + (6 / 5) = 7
   */
  public int trailingZeroes(int n) {
    // Every multiple of 5 contributes an additional trailing zero.
    // Now if n / 5 is also a multiple of 5, we need to apply recursion
    return n >= 5 ? n / 5 + trailingZeroes(n / 5) : 0;  
  }
}
