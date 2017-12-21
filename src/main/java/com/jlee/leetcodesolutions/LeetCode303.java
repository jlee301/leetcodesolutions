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
  private final int[] data;

  public NumArray(int[] nums) {
    data = nums;
  }

  public int sumRange(int i, int j) {
    int sum = 0;
    if(data == null || i < 0 || j > data.length - 1 || i > j)
      return sum;
    
    for (int start = i; start <= j; start++) {
      sum += data[start];
    }
    return sum;
  }
}
