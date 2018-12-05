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
  private int[] sum;
  private int[] nums;
  
  public LeetCode303(int[] nums) {
    if(nums == null || nums.length == 0)
      return;
    
    this.nums = nums;
    
    // sum[i] == sum(nums[0] : nums[i])
    sum = new int[nums.length];
    sum[0] = nums[0];
    for(int i = 1; i < nums.length; i++)
      sum[i] = sum[i-1] + nums[i];
  }
    
  public int sumRange(int i, int j) {
    if(nums == null)
      return 0;
    
    return sum[j] - sum[i] + nums[i];       
  }
}
