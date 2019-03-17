package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0136 {
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
    Arrays.sort(nums);
    int i = 0;
    while(i < nums.length) {
      // How many times does nums[i] repeat
      int j = i + 1;
      while(j < nums.length && nums[j] == nums[i])
        j++;
      
      if(j - i == 1)
        return nums[i];
      
      i = j;
    }
    return Integer.MIN_VALUE;
  }
}
