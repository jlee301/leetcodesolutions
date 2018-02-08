package com.jlee.leetcodesolutions;

public class LeetCode081 {
  /*
   * Suppose an array sorted in ascending order is rotated at some pivot unknown
   * to you beforehand.
   * 
   * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
   * 
   * Write a function to determine if a given target is in the array.
   * 
   * The array may contain duplicates.
   * 
   * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
   */
  public boolean search(int[] nums, int target) {
    if(nums == null || nums.length == 0)
      return false;
    
    if(target >= nums[0]) {
      int index = 0, prev = Integer.MIN_VALUE;
      while(index < nums.length && prev <= nums[index]) {
        if(target == nums[index])
          return true;
        prev = nums[index++];
      }
    } else {
      int index = nums.length-1, prev = Integer.MAX_VALUE;
      while(index >= 0 && prev >= nums[index]) {
        if(target == nums[index])
          return true;
        prev = nums[index--];
      }
    }
    return false;
  }
}
