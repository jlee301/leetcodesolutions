package com.jlee.leetcodesolutions;

public class LeetCode312 {
  /*
   * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a
   * number on it represented by array nums. You are asked to burst all the
   * balloons. If the you burst balloon i you will get nums[left] * nums[i] *
   * nums[right] coins. Here left and right are adjacent indices of i. After the
   * burst, the left and right then becomes adjacent.
   * 
   * Find the maximum coins you can collect by bursting the balloons wisely.
   * 
   * https://leetcode.com/problems/burst-balloons/description/
   */
  public int maxCoins(int[] nums) {
    // Rebuild array to include borders
    int n = 1;
    int[] updated = new int[nums.length+2];
    for(int num : nums) {
      // Skip any zero balloons as it will not result into any additional coins
      if(num == 0) 
        continue;
      updated[n++] = num;
    }

    // Add borders to the array
    updated[0] = 1;
    updated[n] = 1;
    
    return helper(updated, 0, n, new int[n+1][n+1]);
  }
  
  private int helper(int[] nums, int left, int right, int[][] memo) {
    if(left+1 == right)
      return 0;
    
    if(memo[left][right] > 0)
      return memo[left][right];
    
    int maxCoins = 0;
    // Attempt to pop every balloon as last to see which gives highest return
    for(int i = left+1; i < right; i++) {
      maxCoins = Math.max(maxCoins,
          helper(nums, left, i, memo) + (nums[left] * nums[i] * nums[right]) + helper(nums, i, right, memo));
    }
    memo[left][right] = maxCoins;
    return maxCoins;
  }
}
