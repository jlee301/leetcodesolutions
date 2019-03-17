package com.jlee.leetcodesolutions;

public class LeetCode0075 {
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
  
  public void sortColorsOnePass(int[] nums) {
    if(nums == null || nums.length <= 1)
      return;
    
    int curr = 0, redW = 0, blueW = nums.length-1;
    while(curr <= blueW) {
      if(nums[curr] == 0) {
        nums[curr] = nums[redW];
        nums[redW] = 0;
        redW++;
      } else if(nums[curr] == 2) {
        nums[curr] = nums[blueW];
        nums[blueW] = 2;
        blueW--;
        // We do a continue here to skip the curr increment because we moved a new
        // number in that place that requires checking.
        continue;
      }
      curr++;
    }
  }
}
