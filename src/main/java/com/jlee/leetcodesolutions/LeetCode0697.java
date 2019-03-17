package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0697 {
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
    HashMap<Integer,int[]> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      if(!map.containsKey(nums[i])) {
        // int[0] = frequency, int[1] = first index, int[2] = last index
        map.put(nums[i], new int[] {1, i, i});
      }
      else {
        int[] data = map.get(nums[i]);
        data[0]++;
        data[2] = i;
        map.put(nums[i], data);
      }      
    }
    
    int maxFreq = 0, minLen = Integer.MAX_VALUE;
    for(int[] data : map.values()) {
      if(data[0] > maxFreq) {
        maxFreq = data[0];
        minLen = data[2] - data[1] + 1;
      }
      else if(data[0] == maxFreq)
        minLen = Math.min(minLen, data[2] - data[1] + 1);
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }
}
