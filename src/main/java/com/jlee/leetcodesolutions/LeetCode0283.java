package com.jlee.leetcodesolutions;

public class LeetCode0283 {
  /*
   * Given an array nums, write a function to move all 0's to the end of it while
   * maintaining the relative order of the non-zero elements.
   * 
   * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
   * should be [1, 3, 12, 0, 0].
   * 
   * Note: You must do this in-place without making a copy of the array. Minimize
   * the total number of operations.
   * 
   * https://leetcode.com/problems/move-zeroes/description/
   */
  public void moveZeroes(int[] nums) {
    boolean swap = true;
    int limit = nums.length-1;
    
    // Like Bubble Sort
    while(swap) {
      swap = false;
      for(int i = 0; i < limit; i++) {
        if(nums[i] == 0 && nums[i+1] != 0) {
          // Swap
          int temp = nums[i+1];
          nums[i+1] = nums[i];
          nums[i] = temp;
          swap = true;
        }
      }
      limit--;
    }
  }
}
