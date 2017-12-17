package com.jlee.leetcodesolutions;

public class LeetCode198 {
  /*
   * You are a professional robber planning to rob houses along a street. Each
   * house has a certain amount of money stashed, the only constraint stopping you
   * from robbing each of them is that adjacent houses have security system
   * connected and it will automatically contact the police if two adjacent houses
   * were broken into on the same night.
   * 
   * Given a list of non-negative integers representing the amount of money of
   * each house, determine the maximum amount of money you can rob tonight without
   * alerting the police.
   * 
   * https://leetcode.com/problems/house-robber/description/
   * 
   * Input: [5, 1, 2, 10, 15, 20]
   * Output: 35 (5 --> 10 --> 20)
   */
  public int rob(int[] nums) {
    int result = 0;
    if(nums == null)
      return result;

    int maxRob = 0; // Max money if you rob the previous house
    int maxNotRob = 0; // Max money if you did not rob the previous house.
    for(int i = 0; i < nums.length; i++) {
      // If you rob the current house, it means you cannot rob the previous house.
      int maxCurrRob = nums[i] + maxNotRob;

      // Setting for next house iteration
      // If you do not rob it, take the max value of the previous maxRob/maxNotRob
      maxNotRob = Math.max(maxRob, maxNotRob);
      // If you rob the current house, set maxRob to maxCurrRob
      maxRob = maxCurrRob;
    }
    result = Math.max(maxRob, maxNotRob);
    return result;
  }
}
