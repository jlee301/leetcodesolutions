package com.jlee.leetcodesolutions;

public class LeetCode075 {
  /*
   * Given an array with n objects colored red, white or blue, sort them so that
   * objects of the same color are adjacent, with the colors in the order red,
   * white and blue.
   * 
   * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
   * and blue respectively.
   * 
   * Note: You are not suppose to use the library's sort function for this
   * problem.
   * 
   * https://leetcode.com/problems/sort-colors/description/
   */
  public void sortColors(int[] nums) {
    if(nums == null || nums.length <= 1)
      return;
    
    int red = 0, white = 0;
    for(int num : nums) {
      if(num == 0) red++;
      else if (num == 1) white++;
      else continue;
    }
    
    for(int i = 0; i < nums.length; i++) {
      if(i < red) nums[i] = 0;
      else if(i < red + white) nums[i] = 1;
      else nums[i] = 2;
    }
  }
}
