package com.jlee.leetcodesolutions;

import java.util.HashMap;

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
  
  public boolean containsNearbyDuplicateHash(int[] nums, int k) {
    if(nums == null || nums.length <= 1 || k <= 0)
      return false;
    
    // HashMap stored as nums[i], i
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++) {
      // [ 1, 2, 3, 1, 4, 1 ], k = 2, i=0, i=3, i=5
      if(hashMap.containsKey(nums[i])) {
        if(k >= i - hashMap.get(nums[i]))
          return true;
        else {
          // Update existing entry with new index because it is out of range
          hashMap.put(nums[i], i);
        }
      } else {
        hashMap.put(nums[i], i);
      }
    }
    return false;
  }
}
