package com.jlee.leetcodesolutions;

public class LeetCode810 {
  /*
   * We are given non-negative integers nums[i] which are written on a chalkboard.
   * Alice and Bob take turns erasing exactly one number from the chalkboard, with
   * Alice starting first. If erasing a number causes the bitwise XOR of all the
   * elements of the chalkboard to become 0, then that player loses. (Also, we'll
   * say the bitwise XOR of one element is that element itself, and the bitwise
   * XOR of no elements is 0.)
   * 
   * Also, if any player starts their turn with the bitwise XOR of all the
   * elements of the chalkboard equal to 0, then that player wins.
   * 
   * Return True if and only if Alice wins the game, assuming both players play
   * optimally.
   * 
   * https://leetcode.com/problems/chalkboard-xor-game/description/
   */
  public boolean xorGame(int[] nums) {
    int xorSum = 0;
    for(int num : nums)
      xorSum ^= num;
    
    // 1. If the game starts off with xorSum == 0, Alice wins
    // 2. If the xorSum != 0, it means there at least two elements that are different
    // 3. Optimally the user suppose to erase an element != xorSum
    return xorSum == 0 || nums.length % 2 == 0;
  }
}
