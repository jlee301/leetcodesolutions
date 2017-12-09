package com.jlee.leetcodesolutions;

public class LeetCode053 {
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
    if (nums == null || nums.length == 0)
      return 0;

    int maxSoFar = nums[0];
    int maxEndingHere = nums[0];

    for (int i = 1; i < nums.length; i++) {
      // Current sum + nums[i] or nums[i] greater
      maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);

      // Highest sum seen so far or new max found
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
  }
}
