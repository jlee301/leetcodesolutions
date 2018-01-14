package com.jlee.leetcodesolutions;

public class LeetCode643 {
  /*
   * Given an array consisting of n integers, find the contiguous subarray of
   * given length k that has the maximum average value. And you need to output the
   * maximum average value.
   * 
   * Example 1:
   * Input: [1,12,-5,-6,50,3], k = 4
   * Output: 12.75
   * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
   * 
   * Note:
   * 1. 1 <= k <= n <= 30,000.
   * 2. Elements of the given array will be in the range [-10,000, 10,000].
   * 
   * https://leetcode.com/problems/maximum-average-subarray-i/description/
   */
  public double findMaxAverage(int[] nums, int k) {
    if(nums == null || nums.length == 0 || k < 1 || k > nums.length)
      return (double) 0;
    
    int sum = 0;
    // Get the first sum of k
    for(int i = 0; i < k; i++)
      sum += nums[i];
    
    int result = sum;
    // After first run, the sum is subtracting least previous and adding the
    // new.  This will avoid k-2 computations per iteration.
    for(int i = k; i < nums.length; i++) {
      sum = sum - nums[i-k] + nums[i];
      result = Math.max(result, sum);
    }
    return (double) result / k;
  }
}
