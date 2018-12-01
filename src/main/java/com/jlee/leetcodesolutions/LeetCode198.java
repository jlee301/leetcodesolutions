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
    if(nums == null || nums.length == 0)
      return 0;
      
    int[] rob = new int[nums.length];
    int[] notRob = new int[nums.length];
    rob[0] = nums[0];
    for(int i = 1; i < nums.length; i++) {
      // If you rob nums[i], you cannot rob nums[i-1]
      // rob[i] = max money if you rob nums[i]
      // notRob[i] = max money if you do not rob nums[i]
      rob[i] = nums[i] + notRob[i-1];
      notRob[i] = Math.max(notRob[i-1], rob[i-1]);
    }
    return Math.max(rob[nums.length-1], notRob[nums.length-1]);
  }
}
