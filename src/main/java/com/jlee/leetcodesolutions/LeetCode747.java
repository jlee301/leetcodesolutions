package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode747 {
  /*
   * In a given integer array nums, there is always exactly one largest element.
   * 
   * Find whether the largest element in the array is at least twice as much as
   * every other number in the array.
   * 
   * If it is, return the index of the largest element, otherwise return -1.
   * 
   * Example 1: 
   * Input: nums = [3, 6, 1, 0] 
   * Output: 1
   * 
   * Explanation: 6 is the largest integer, and for every other number in the
   * array x, 6 is more than twice as big as x. The index of value 6 is 1, so we
   * return 1.
   * 
   * Example 2: 
   * Input: nums = [1, 2, 3, 4] 
   * Output: -1
   * 
   * Explanation: 4 isn't at least as big as twice the value of 3, so we return
   * -1.
   * 
   * Note:
   * 1. nums will have a length in the range [1, 50].
   * 2. Every nums[i] will be an integer in the range [0, 99].
   * 
   * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
   */
  public int dominantIndex(int[] nums) {
    if(nums == null || nums.length == 0)
      return -1;

    // This map removes duplicates and associates with index position of first
    // occurrence of the element
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    int max = -1;
    for(int i = nums.length-1; i >= 0; i--) {
      max = Math.max(max, nums[i]);
      map.put(nums[i],i);
    }

    // If size == 1, it means the array only has one of the same element
    if(map.size() == 1)
      return 0;
    
    for(int key : map.keySet()) {
      if(key < max && key * 2 > max)
        return -1;
    }
    return map.get(max);
  }
}
