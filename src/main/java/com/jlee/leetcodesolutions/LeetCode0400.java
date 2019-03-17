package com.jlee.leetcodesolutions;

public class LeetCode0400 {
  /*
   * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8,
   * 9, 10, 11, ...
   * 
   * Note: n is positive and will fit within the range of a 32-bit signed integer
   * (n < 2^31).
   * 
   * Example 1:
   * Input: 3
   * Output: 3 
   * 
   * Example 2:
   * Input: 11
   * Output: 0
   * Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 1[0],
   * 11, ... is a 0, which is part of the number 10.
   * 
   * https://leetcode.com/problems/nth-digit/description/
   */
  public int findNthDigit(int n) {
    // 1-9 len 9
    // 10-99 len 90
    // 100 - 999 len 900
    // 1000 - 9999 len 9000
    
    // find integer that the nth digit appears on
    int d_len = 1;
    long d_cnt = 9;
    int init = 1;
    while(n > d_cnt * d_len) {
      n -= d_cnt * d_len;
      d_len++;
      d_cnt *= 10;
      init *= 10;
    }
    // now n-1 / d_len == how many times a digit of length d_len repeats
    init += (n - 1) / d_len;
    String str = "" + init;
    return Character.getNumericValue(str.charAt((n - 1) % d_len));
  }
}
