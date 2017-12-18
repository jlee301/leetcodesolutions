package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode217 {
  /*
   * Given an array of integers, find if the array contains any duplicates. Your
   * function should return true if any value appears at least twice in the array,
   * and it should return false if every element is distinct.
   * 
   * https://leetcode.com/problems/contains-duplicate/description/
   */
  public boolean containsDuplicate(int[] nums) {
    if(nums == null || nums.length <= 1)
      return false;
    
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < nums.length; i++) {
      int currInt = nums[i];
      if(set.contains(currInt)) {
        return true;
      } else {
        set.add(currInt);
      }
    }
    return false;
  }
}
