package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode169 {
  /*
   * Given an array of size n, find the majority element. The majority element is
   * the element that appears more than n/2 times.
   * 
   * You may assume that the array is non-empty and the majority element always
   * exist in the array.
   * 
   * Credits: Special thanks to @ts for adding this problem and creating all test
   * cases.
   * 
   * https://leetcode.com/problems/majority-element/description/
   */
  public int majorityElement(int[] nums) {
    int result = 0;
    if(nums == null || nums.length == 0)
      return result;
    
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    
    for(int key : map.keySet()) {
      if(map.get(key) >= nums.length / 2) {
        result = key;
        break;
      }
    }
    return result;
  }
}
