package com.jlee.leetcodesolutions;

public class LeetCode0053 {
  /*
   * Find the contiguous subarray within an array (containing at least one number)
   * which has the largest sum.
   * 
   * Input: [-2,1,-3,4,-1,2,1,-5,4] 
   * Output: 6, [4,-1,2,1]
   * 
   * https://leetcode.com/problems/maximum-subarray/description/
   */
  public int maxSubArray(int[] nums) {
    int N = nums.length;
    
    // dp[i] == max sum ending with nums[i]
    int[] dp = new int[N];
    dp[0] = nums[0];
    int max = nums[0];
    for(int i = 1; i < N; i++) {
      dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}
