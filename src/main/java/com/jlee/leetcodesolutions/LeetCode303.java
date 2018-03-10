package com.jlee.leetcodesolutions;

public class LeetCode303 {
  /*
   * Given an integer array nums, find the sum of the elements between indices i
   * and j (i ≤ j), inclusive.
   * 
   * Example: Given nums = [-2, 0, 3, -5, 2, -1]
   * 
   * sumRange(0, 2) -> 1
   * sumRange(2, 5) -> -1
   * sumRange(0, 5) -> -3
   * 
   * Note:
   * You may assume that the array does not change. There are many calls to
   * sumRange function.
   * 
   * https://leetcode.com/problems/range-sum-query-immutable/description/
   */
}

class NumArray {
  private int[] nums;
  private int[] memo;

  public NumArray(int[] nums) {
    if(nums == null || nums.length == 0)
      return;
    this.nums = nums;
    memo = new int[nums.length];
    memo[0] = nums[0];
    for(int i = 1; i < nums.length; i++)
      memo[i] = memo[i-1] + nums[i];
  }

  public int sumRange(int i, int j) {
    if(nums == null || i < 0 || j > nums.length-1 || i > j) return 0;
    return memo[j] - memo[i] + nums[i];
  }
}
