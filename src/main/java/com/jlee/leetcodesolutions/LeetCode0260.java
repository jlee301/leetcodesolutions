package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0260 {
  /*
   * Given an array of numbers nums, in which exactly two elements appear only
   * once and all the other elements appear exactly twice. Find the two elements
   * that appear only once.
   * 
   * For example:
   * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
   * 
   * Note:
   * 1. The order of the result is not important. So in the above example, [5, 3] is
   * also correct.
   * 2. Your algorithm should run in linear runtime complexity. Could you implement
   * it using only constant space complexity?
   * 
   * https://leetcode.com/problems/single-number-iii/description/
   */
  public int[] singleNumber(int[] nums) {
    int[] result = new int[2];
    if(nums == null || nums.length == 0)
      return result;
    
    Arrays.sort(nums);
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i], count = 1;
      
      // Skip repeats
      while(i < nums.length-1 && num == nums[i+1]) {
        i++;
        count++;
      }
      if(count == 1) {
        result[index++] = num;
        if(index == 2)
          return result;
      }
    }
    return result;    
  }
}
