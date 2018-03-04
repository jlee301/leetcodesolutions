package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode220 {
  /*
   * Given an array of integers, find out whether there are two distinct indices i
   * and j in the array such that the absolute difference between nums[i] and
   * nums[j] is at most t and the absolute difference between i and j is at most
   * k.
   * 
   * https://leetcode.com/problems/contains-duplicate-iii/description/
   */
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    if(nums == null || nums.length == 0 || k <= 0 || t < 0)
      return false;
    
    // If t == 0, it means we are essentially looking for another duplicate value to
    // zero the difference
    if(t == 0) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int j = 0; j < nums.length; j++) {
        if(map.containsKey(nums[j])) {
          int i = map.get(nums[j]);
          if(j-i <= k)
            return true;
        }
        // If the previous duplicate didn't meet the <= k requirement, then this will
        // update the index value to be used
        map.put(nums[j], j);
      }
      return false;
    }
    for(int i = 0; i < nums.length; i++) {
      for(int j = i+1; j <= i+k && j < nums.length; j++) {
        if(Math.abs((long) nums[j] - nums[i]) <= t)
          return true;
      }
    }
    return false;
  }
}
