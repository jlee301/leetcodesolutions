package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode697 {
  /*
   * Given a non-empty array of non-negative integers nums, the degree of this
   * array is defined as the maximum frequency of any one of its elements.
   * 
   * Your task is to find the smallest possible length of a (contiguous) subarray
   * of nums, that has the same degree as nums.
   * 
   * Example 1:
   * Input: [1, 2, 2, 3, 1]
   * Output: 2
   * Explanation: The input array has a degree of 2 because both elements 1 and 2
   * appear twice. Of the subarrays that have the same degree: [1, 2, 2, 3, 1],
   * [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2] The shortest length
   * is 2. So return 2.
   * 
   * Example 2:
   * Input: [1,2,2,3,1,4,2]
   * Output: 6
   * 
   * Note:
   * 1. nums.length will be between 1 and 50,000.
   * 2. nums[i] will be an integer between 0 and 49,999.
   * 
   * https://leetcode.com/problems/degree-of-an-array/description/
   */
  public int findShortestSubArray(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    HashMap<Integer,Integer> startIndex = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> endIndex = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
    int degree = 0;
    
    // Populate the starting point, ending point, and frequency for each number.
    for(int i = 0; i < nums.length; i++) {
      if(startIndex.containsKey(nums[i])) {
        endIndex.put(nums[i], i);
      } else {
        startIndex.put(nums[i], i);
        endIndex.put(nums[i], i);
      }
      freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
      degree = Math.max(degree, freq.get(nums[i]));
    }
    
    int result = Integer.MAX_VALUE;
    for(int key : freq.keySet()) {
      if(freq.get(key) == degree)
        result = Math.min(result, endIndex.get(key) - startIndex.get(key) + 1);
    }
    return result;
  }
}
