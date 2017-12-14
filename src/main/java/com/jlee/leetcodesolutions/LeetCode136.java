package com.jlee.leetcodesolutions;

public class LeetCode136 {
  /*
   * Given an array of integers, every element appears twice except for one. Find
   * that single one.
   * 
   * Note: Your algorithm should have a linear runtime complexity. Could you
   * implement it without using extra memory?
   * 
   * https://leetcode.com/problems/single-number/description/
   */
  public int singleNumber(int[] nums) {
    int result = 0;
    if(nums == null)
      return result;
    
    // The concept here is n ^ n = 0 and 0 ^ n = n. Because XOR is commutative, you
    // can accomplish this task.
    for(int i = 0; i < nums.length; i++) {
      result = result ^ nums[i];
    }
    return result;
  }
}
