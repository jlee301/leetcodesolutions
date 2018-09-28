package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode239 {
  /*
   * Given an array nums, there is a sliding window of size k which is moving from
   * the very left of the array to the very right. You can only see the k numbers
   * in the window. Each time the sliding window moves right by one position.
   * Return the max sliding window.
   * 
   * https://leetcode.com/problems/sliding-window-maximum/description/
   */
  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || nums.length == 0)
      return new int[] {};
    
    if(k == 1)
      return nums;
    
    if(k == nums.length) {
      Arrays.sort(nums);
      return new int[] { nums[nums.length-1] };
    }
    
    // Sort queue by ascending
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    int[] result = new int[nums.length-k+1];
    
    for(int i = 0, j = 0; i < nums.length; i++) {
      // Add next value
      pq.add(nums[i]); 
      
      if(i >= k) {
        // remove former left window value
        // i == 3, k = 3
        pq.remove(nums[i-k]);
      }
      
      if(i >= k-1) {
        // max value in the window
        result[j++] = pq.peek();
      }
    }
    return result;
  }
}
