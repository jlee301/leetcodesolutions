package com.jlee.leetcodesolutions;

public class LeetCode033 {
  /*
   * Suppose an array sorted in ascending order is rotated at some pivot unknown
   * to you beforehand.
   * 
   * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
   * 
   * You are given a target value to search. If found in the array return its
   * index, otherwise return -1.
   * 
   * You may assume no duplicate exists in the array.
   */
  public int search(int[] nums, int target) {
    if(nums == null || nums.length == 0)
      return -1;
    
    if(target >= nums[0]) {
      int index = 0, prev = Integer.MIN_VALUE;
      while(index < nums.length && prev < nums[index]) {
        if(target == nums[index])
          return index;
        prev = nums[index++];
      }
    } else {
      int index = nums.length-1, prev = Integer.MAX_VALUE;
      while(index >= 0 && prev > nums[index]) {
        if(target == nums[index])
          return index;
        prev = nums[index--];
      }
    }
    return -1;
  }
}
