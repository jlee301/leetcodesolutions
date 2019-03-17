package com.jlee.leetcodesolutions;

public class LeetCode0643 {
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
    double avg = -300_000_000;
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if(i >= k) 
        sum -= nums[i-k];
      
      if(i >= k-1)
        avg = Math.max(avg, sum / (double) k);
      
    }
    return avg;
  }
}
