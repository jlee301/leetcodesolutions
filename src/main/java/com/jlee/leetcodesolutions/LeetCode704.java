package com.jlee.leetcodesolutions;

public class LeetCode704 {
  /*
   * Given a sorted (in ascending order) integer array nums of n elements and a
   * target value, write a function to search target in nums. If target exists,
   * then return its index, otherwise return -1.
   * 
   * https://leetcode.com/problems/binary-search/
   */
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length-1;
    while(left <= right) {
      int mid = left + (right-left) / 2;
      if(nums[mid] == target)
        return mid;
      else if(nums[mid] < target)
        left = mid + 1;
      else
        right = mid - 1;
    }
    return -1;
  }
}
