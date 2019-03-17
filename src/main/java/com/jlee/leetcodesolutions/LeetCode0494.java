package com.jlee.leetcodesolutions;

public class LeetCode0494 {
  /*
   * You are given a list of non-negative integers, a1, a2, ..., an, and a target,
   * S. Now you have 2 symbols + and -. For each integer, you should choose one
   * from + and - as its new symbol.
   * 
   * Find out how many ways to assign symbols to make sum of integers equal to
   * target S.
   * 
   * Example 1:
   * Input: nums is [1, 1, 1, 1, 1], S is 3.
   * Output: 5
   * 
   * Explanation:
   * -1+1+1+1+1 = 3
   * +1-1+1+1+1 = 3
   * +1+1-1+1+1 = 3
   * +1+1+1-1+1 = 3
   * +1+1+1+1-1 = 3
   * 
   * There are 5 ways to assign symbols to make the sum of nums be target 3.
   * 
   * Note:
   * 1. The length of the given array is positive and will not exceed 20.
   * 2. The sum of elements in the given array will not exceed 1000.
   * 3. Your output answer is guaranteed to be fitted in a 32-bit integer.
   * 
   * https://leetcode.com/problems/target-sum/description/
   */
  public int findTargetSumWays(int[] nums, int S) {
    if(nums == null) 
      return 0;
    
    Integer[][] memo = new Integer[nums.length][2001];
    // We are using memoization (memo[nums.length][sum variable]) to store
    // repetitive computations. Based on note 2 where the sum will not exceed 1000,
    // the range of the sum variable are [-1000, 1000] (-1000 where you choose "-"
    // for all integers and 1000 when you choose "+"). Since we cannot have negative
    // reference in the array pointer, we will need to compensate by adding 1000 to
    // the reference so the range would be [0, 2000].
    return findTargetSumWays(nums, 0, 0, S, memo);
  }
  
  private int findTargetSumWays(int[] nums, int pos, int sum, int target, Integer[][] memo) {
    if(pos == nums.length)
      return sum == target ? 1 : 0;
    
    if(memo[pos][sum+1000] != null)
      return memo[pos][sum+1000];
    
    memo[pos][sum+1000] = findTargetSumWays(nums, pos+1, sum+nums[pos], target, memo) + findTargetSumWays(nums, pos+1, sum-nums[pos], target, memo);
    return memo[pos][sum+1000];
  }
}
