package com.jlee.leetcodesolutions;

public class LeetCode268 {
  /*
   * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
   * the one that is missing from the array.
   * 
   * Input: [3,0,1] 
   * Output: 2 
   * 
   * Input: [9,6,4,2,3,5,7,0,1] 
   * Output: 8
   * 
   * Note: Your algorithm should run in linear runtime complexity. Could you
   * implement it using only constant extra space complexity?
   * 
   * https://leetcode.com/problems/missing-number/description/
   */
  public int missingNumber(int[] nums) {
    // XOR - Same == 0, Different = 1
    // ie 5 ^ 5 = 0, 5 ^ 5 ^ 4 = 4
    int i = 0, result = 0;
    for(; i < nums.length; i++)
      result ^= i ^ nums[i];
    
    return result ^ i;
  }
}
