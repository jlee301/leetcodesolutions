package com.jlee.leetcodesolutions;

public class LeetCode461 {
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
    if(x < 0 || y < 0)
      return 0;
    
    // XOR ^ - When the bit is different, it will equal 1.
    return Integer.bitCount(x^y);
  }
}