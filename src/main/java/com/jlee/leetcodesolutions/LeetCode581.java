package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode581 {
  /*
   * Given an integer array, you need to find one continuous subarray that if you
   * only sort this subarray in ascending order, then the whole array will be
   * sorted in ascending order, too.
   * 
   * You need to find the shortest such subarray and output its length.
   * 
   * Example 1:
   * Input: [2, 6, 4, 8, 10, 9, 15]
   * Output: 5
   * 
   * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the
   * whole array sorted in ascending order.
   * 
   * Note:
   * 1. Then length of the input array is in range [1, 10,000].
   * 2. The input array may contain duplicates, so ascending order here means <=.
   * 
   * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
   */
  public int findUnsortedSubarray(int[] nums) {
    int result = 0;
    if(nums == null || nums.length <= 1)
      return result;
    
    int[] sorted = nums.clone();
    Arrays.sort(sorted);
    int maxPtr = 0, minPtr = sorted.length;
    
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != sorted[i]) {
        minPtr = Math.min(minPtr, i);
        maxPtr = Math.max(maxPtr, i);
      }
    }
    if(maxPtr - minPtr > 0)
      return maxPtr - minPtr + 1;
    else
      return 0;
  }
}
