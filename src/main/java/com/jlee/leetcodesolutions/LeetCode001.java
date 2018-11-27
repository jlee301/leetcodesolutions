package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode001 {
  /*
   * Given an array of integers, return indices of the two numbers such that they
   * add up to a specific target. You may assume that each input would have
   * exactly one solution, and you may not use the same element twice.
   * 
   * Given nums = [2, 7, 11, 15], target = 9 
   * Because nums[0] + nums[1] = 2 + 7 = 9
   * return [0, 1]
   * 
   * https://leetcode.com/problems/two-sum/description/
   */
  public int[] twoSum(int[] nums, int target) {
    // Map each element to its index position(s)
    HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++)
      map.computeIfAbsent(nums[i], k -> new TreeSet<>()).add(i);
    
    for(int i = 0; i < nums.length; i++) {
      int need = target - nums[i];
      if(need == nums[i]) {
        // If the need is the same as nums[i], there must be more than one
        if(map.get(need).size() > 1)
          return new int[] {i, map.get(need).higher(i)};
      }
      else if(map.containsKey(need))
        return new int[] {i, map.get(need).higher(i)};
    }
    return new int[] {-1,-1};
  }
}
