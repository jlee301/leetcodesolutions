package com.jlee.leetcodesolutions;

public class LeetCode213 {
  /*
   * After robbing those houses on that street, the thief has found himself a new
   * place for his thievery so that he will not get too much attention. This time,
   * all houses at this place are arranged in a circle. That means the first house
   * is the neighbor of the last one. Meanwhile, the security system for these
   * houses remain the same as for those in the previous street.
   * 
   * Given a list of non-negative integers representing the amount of money of
   * each house, determine the maximum amount of money you can rob tonight without
   * alerting the police.
   * 
   * https://leetcode.com/problems/house-robber-ii/description/
   */
  public int rob(int[] nums) {
    if(nums == null)
      return 0;
    if(nums.length == 1)
      return nums[0];
    return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length-1));
  }
  
  private int rob(int[] nums, int start, int end) {
    int maxRob = 0; // Max money if you rob the previous house
    int maxNotRob = 0; // Max money if you did not rob the previous house.
    for(int i = start; i <= end; i++) {
      // If you rob the current house, it means you cannot rob the previous house.
      int maxCurrRob = nums[i] + maxNotRob;

      // Setting for next house iteration
      // If you do not rob it, take the max value of the previous maxRob/maxNotRob
      maxNotRob = Math.max(maxRob, maxNotRob);
      // If you rob the current house, set maxRob to maxCurrRob
      maxRob = maxCurrRob;
    }
    return Math.max(maxRob, maxNotRob);
  }
}
