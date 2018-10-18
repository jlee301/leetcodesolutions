package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode164 {
  /*
   * Given an unsorted array, find the maximum difference between the successive
   * elements in its sorted form.
   * 
   * Return 0 if the array contains less than 2 elements.
   * 
   * https://leetcode.com/problems/maximum-gap/
   */
  public int maximumGap(int[] nums) {
    int max = 0;
    if(nums == null || nums.length < 2) {
      return max;
    }
    
    // Sort array in ascending order
    Arrays.sort(nums);
    
    // Now compare every two successive integers for the diff, record the max
    for(int i = 0; i < nums.length-1; i++) {
      max = Math.max(max, nums[i+1] - nums[i]);
    }
    
    return max;
  }
}
