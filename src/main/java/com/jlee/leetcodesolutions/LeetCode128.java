package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode128 {
  /*
   * Given an unsorted array of integers, find the length of the longest
   * consecutive elements sequence.
   * 
   * Your algorithm should run in O(n) complexity.
   * 
   * https://leetcode.com/problems/longest-consecutive-sequence/
   */
  public int longestConsecutive(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    Arrays.sort(nums);
    // [1, 2, 3, 4, 100, 200]
    int result = 1, count = 1;
    for(int i = 0; i < nums.length-1; i++) {
      if(nums[i] == nums[i+1]) {
        // nums[i] and nums[i+1] are the same, move on to next iteration
        result = Math.max(result, count);
        continue;
      }
      else if(nums[i]+1 == nums[i+1]) {
        // nums[i+1] is the next consecutive number of nums[i]
        count++;
        result = Math.max(result, count);
      }
      else {
        // nums[i+1] is not the next consecutive number of nums[i]
        // reset count for next iteration
        count = 1;
      }
    }
    return result;
  }
}
