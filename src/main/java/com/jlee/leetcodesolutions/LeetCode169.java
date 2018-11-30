package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode169 {
  /*
   * Given an array of size n, find the majority element. The majority element is
   * the element that appears more than n/2 times.
   * 
   * You may assume that the array is non-empty and the majority element always
   * exist in the array.
   * 
   * Credits: Special thanks to @ts for adding this problem and creating all test
   * cases.
   * 
   * https://leetcode.com/problems/majority-element/description/
   */
  public int majorityElement(int[] nums) {
    int target = nums.length / 2;
    Arrays.sort(nums);
    int i = 0;
    while(i < nums.length) {
      // How many times does nums[i] repeat consecutively
      int j = i + 1;
      while(j < nums.length && nums[j] == nums[i])
        j++;
      
      if(j - i > target)
        return nums[i];
      
      i = j;
    }
    return Integer.MAX_VALUE;
  }
}
