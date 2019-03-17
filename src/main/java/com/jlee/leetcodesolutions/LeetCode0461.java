package com.jlee.leetcodesolutions;

public class LeetCode0461 {
  /*
   * The Hamming distance between two integers is the number of positions at which
   * the corresponding bits are different.
   * 
   * Given two integers x and y, calculate the Hamming distance.
   * 
   * Note: 0 ≤ x, y < 2^31.
   * 
   * Example:
   * Input: x = 1, y = 4
   * Output: 2
   * 
   * Explanation: 
   * 1 (0 0 0 1) 
   * 4 (0 1 0 0) 
   *      ↑   ↑
   * 
   * The above arrows point to positions where the corresponding bits are
   * different.
   * 
   * https://leetcode.com/problems/hamming-distance/description/
   */
  public int hammingDistance(int x, int y) {
    int count = 0;
    for(int i = 0; i < 31; i++) {
      int a = x & 1;
      int b = y & 1;
      count += a ^ b;
      x >>= 1;
      y >>= 1;
    }
    return count;
  }
}
