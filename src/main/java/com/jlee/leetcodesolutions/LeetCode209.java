package com.jlee.leetcodesolutions;

public class LeetCode209 {
  /*
   * Given an array of n positive integers and a positive integer s, find the
   * minimal length of a contiguous subarray of which the sum ≥ s. If there isn't
   * one, return 0 instead.
   * 
   * For example, given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has
   * the minimal length under the problem constraint.
   * 
   * https://leetcode.com/problems/minimum-size-subarray-sum/description/
   */
  public int minSubArrayLen(int s, int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    int min = Integer.MAX_VALUE;
    int[] memo = new int[nums.length];
    memo[0] = nums[0];
    // memo[i] is the sum from [0, i]
    for(int i = 1; i < nums.length; i++)
      memo[i] = memo[i-1] + nums[i];
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = i; j < nums.length; j++) {
        // sum represents the sum from [i, j] using the precalculated memo data.
        int sum = memo[j] - memo[i] + nums[i];
        if(sum >= s) {
          min = Math.min(min, j-i+1);
          break;
        }
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
