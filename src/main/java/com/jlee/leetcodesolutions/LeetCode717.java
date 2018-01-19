package com.jlee.leetcodesolutions;

public class LeetCode717 {
  /*
   * We have two special characters. The first character can be represented by one
   * bit 0. The second character can be represented by two bits (10 or 11).
   * 
   * Now given a string represented by several bits. Return whether the last
   * character must be a one-bit character or not. The given string will always
   * end with a zero.
   * 
   * Example 1: 
   * Input: bits = [1, 0, 0] 
   * Output: True
   * 
   * Explanation: The only way to decode it is two-bit character and one-bit
   * character. So the last character is one-bit character.
   * 
   * Example 2: 
   * Input: bits = [1, 1, 1, 0] 
   * Output: False
   * 
   * Explanation: The only way to decode it is two-bit character and two-bit
   * character. So the last character is NOT one-bit character.
   * 
   * Note:
   * 1. 1 <= len(bits) <= 1000.
   * 2. bits[i] is always 0 or 1.
   * 
   * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
   */
  public boolean isOneBitCharacter(int[] bits) {
    if(bits == null || bits.length == 0)
      return false;

    int i = 0;
    while(i < bits.length) {
      if(bits[i] == 1) {
        i = i + 2;
        // If i == bits.length, it means you had a 1 before the last bit, so it would
        // have jumped past the the last index+1 (which is bits.length)
        if(i == bits.length)
          return false;
      } else {
        i++;
      }
    }
    return true;
  }
}
