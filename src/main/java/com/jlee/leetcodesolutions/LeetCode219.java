package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode219 {
  /*
   * Given an array of integers and an integer k, find out whether there are two
   * distinct indices i and j in the array such that nums[i] = nums[j] and the
   * absolute difference between i and j is at most k.
   * 
   * https://leetcode.com/problems/contains-duplicate-ii/description/
   */
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < nums.length; i++) {
      // Remove any elements outside of k range
      if(i > k)
        set.remove(nums[i-k-1]);
        
      if(!set.add(nums[i]))
        return true;
    }
    return false;
  }
}
