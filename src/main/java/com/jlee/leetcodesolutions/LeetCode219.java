package com.jlee.leetcodesolutions;

public class LeetCode219 {
  /*
   * Given an array of integers and an integer k, find out whether there are two
   * distinct indices i and j in the array such that nums[i] = nums[j] and the
   * absolute difference between i and j is at most k.
   * 
   * https://leetcode.com/problems/contains-duplicate-ii/description/
   */
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if(nums == null || nums.length <= 1 || k <= 0)
      return false;
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j < nums.length; j++){
        if(nums[i] == nums[j] && k >= j - i)
          return true;
        else 
          continue;
      }
    }
    return false;
  }
}
