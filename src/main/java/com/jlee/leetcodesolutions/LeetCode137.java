package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode137 {
  /*
   * Given an array of integers, every element appears three times except for one,
   * which appears exactly once. Find that single one.
   * 
   * Note: Your algorithm should have a linear runtime complexity. Could you
   * implement it without using extra memory?
   * 
   * https://leetcode.com/problems/single-number-ii/description/
   */
  public int singleNumber(int[] nums) {
    if(nums == null || nums.length == 0)
      return Integer.MIN_VALUE;
    
    Arrays.sort(nums);
    int compare = 0, count = 0;
    for(int num : nums) {
      if(count == 0 || count == 3) {
        compare = num;
        count = 1;
      } else {
        if(compare == num)
          count++;
        else
          return compare;
      }
    }
    return compare;
  }
}
