package com.jlee.leetcodesolutions;

public class LeetCode034 {
  /*
   * Given an array of integers sorted in ascending order, find the starting and
   * ending position of a given target value.
   * 
   * Your algorithm's runtime complexity must be in the order of O(log n).
   * 
   * If the target is not found in the array, return [-1, -1].
   * 
   * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
   * 
   * https://leetcode.com/problems/search-for-a-range/description/
   */
  public int[] searchRange(int[] nums, int target) {
    int[] result = {-1,-1};
    if(nums == null || nums.length == 0 || nums[0] > target || nums[nums.length-1] < target)
      return result;
    
    if(target-nums[0] <= nums[nums.length-1]-target) {
      // Search from left to right
      for(int i = 0; i < nums.length; i++) {
        if(nums[i] == target) {
          int j = i + 1;
          while(j < nums.length && nums[j] == target) j++;
          result[0] = i; result[1] = j - 1;
          return result;
        } else if(nums[i] > target) {
          break;
        }
      }
    } else {
      // Search from right to left
      for(int j = nums.length-1; j >= 0; j--) {
        if(nums[j] == target) {
          int i = j - 1;
          while(i >= 0 && nums[i] == target) i--;
          result[0] = i + 1; result[1] = j;
          return result;
        } else if(nums[j] < target) {
          break;
        }
      }
    }
    return result;
  }
}
