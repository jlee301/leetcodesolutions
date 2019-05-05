package com.jlee.leetcodesolutions;

public class LeetCode0035 {
  /*
   * Given a sorted array and a target value, return the index if the target is
   * found. If not, return the index where it would be if it were inserted in
   * order.
   * 
   * You may assume no duplicates in the array.
   * 
   * Input: [1,3,5,6], 5 
   * Output: 2
   * 
   * Input: [1,3,5,6], 2 
   * Output: 1
   * 
   * Input: [1,3,5,6], 7 
   * Output: 4
   * 
   * Input: [1,3,5,6], 0 
   * Output: 0
   * 
   * https://leetcode.com/problems/search-insert-position/description/
   */
  public int searchInsert(int[] nums, int target) {
    int low = 0, high = nums.length-1;
    while(low <= high) {
      int mid = low + (high-low) / 2;
      if(nums[mid] == target)
        return mid;
      else if(nums[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return low;
  }
}