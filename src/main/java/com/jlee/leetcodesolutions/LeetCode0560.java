package com.jlee.leetcodesolutions;

public class LeetCode0560 {
  /*
   * Given an array of integers and an integer k, you need to find the total
   * number of continuous subarrays whose sum equals to k.
   * 
   * Example 1:
   * Input:nums = [1,1,1], k = 2
   * Output: 2
   * 
   * Note:
   * 1. The length of the array is in range [1, 20,000].
   * 2. The range of numbers in the array is [-1000, 1000] and the range of the
   * integer k is [-1e7, 1e7].
   * 
   * https://leetcode.com/problems/subarray-sum-equals-k/description/
   */
  public int subarraySum(int[] nums, int k) {
    int count = 0;
    if(nums == null || nums.length == 0)
      return count;
    
    // Store the cumulative sum.  sum[i+1] = sum of nums[0] thru nums[i]
    int[] sum = new int[nums.length+1];
    for(int i = 0; i < nums.length; i++)
      sum[i+1] = sum[i] + nums[i];
    
    for(int i = 1; i < sum.length; i++) {
      for(int j = i; j < sum.length; j++) {
        if(sum[j] - sum[i-1] == k)
          count++;
      }
    }
    return count;
  }
}
