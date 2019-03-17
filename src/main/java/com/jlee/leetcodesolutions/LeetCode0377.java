package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0377 {
  /*
   * Given an integer array with all positive numbers and no duplicates, find the
   * number of possible combinations that add up to a positive integer target.
   * 
   * Example:
   * nums = [1, 2, 3] target = 4
   * 
   * The possible combination ways are: 
   * (1, 1, 1, 1)
   * (1, 1, 2)
   * (1, 2, 1)
   * (1, 3)
   * (2, 1, 1)
   * (2, 2)
   * (3, 1)
   * 
   * Therefore the output is 7.
   * 
   * https://leetcode.com/problems/combination-sum-iv/description/
   */
  public int combinationSum4(int[] nums, int target) {
    if(nums == null || nums.length == 0)
      return 0;
    int[] memo = new int[target+1];
    Arrays.fill(memo, -1);
    memo[0] = 1;
    return csHelper(nums, target, memo);
  }
  
  /*
   * f(target) = sum of f(target - nums[i]), 
   * where 0 <= i < nums.length && target >= nums[i]
   * 
   * Ex. nums = [1,2,3], target = 4
   * f(4) = f(4-1) + f(4-2) + f(4-3)
   *      = f(3)   + f(2)   + f(1)
   * 
   * This is the memoization solution for the commented out function below
   */
  private int csHelper(int[] nums, int target, int[] memo) {
    if(memo[target] != -1)
      return memo[target];
    int result = 0;
    for(int num : nums) {
      if(target >= num)
        result += csHelper(nums, target-num, memo);
    }
    memo[target] = result;
    return memo[target];
  }
  
  /*public int combinationSum4(int[] nums, int target) {
    if(nums == null || nums.length == 0)
      return 0;
    if(target == 0)
      return 1;
    int result = 0;
    for(int num : nums) {
      if(target >= num)
        result += combinationSum4(nums, target-num);
    }
    return result;
  }*/
}
