package com.jlee.leetcodesolutions;

public class LeetCode035 {
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
    int result = 0;
    if (nums == null || nums.length == 0)
      return result;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < target) {
        continue;
      } else {
        // nums[i] >= target
        result = i;
        return result;
      }
    }
    // If you exited the loop, it means the target is the
    // last value -- so return the length of the array.
    result = nums.length;
    return result;
  }
}
