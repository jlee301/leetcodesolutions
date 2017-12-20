package com.jlee.leetcodesolutions;

public class LeetCode283 {
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
    if(nums == null || nums.length == 0)
      return;
    
    // i=0 [0, 1, 0, 3, 12]
    // i=1 [1, 1, 0, 3, 12]
    // i=2 [1, 1, 0, 3, 12]
    // i=3 [1, 3, 0, 3, 12]
    // i=4 [1, 3, 12, 3, 12]
    int lastNonZeroIndex = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        nums[lastNonZeroIndex] = nums[i];
        lastNonZeroIndex++;
      }
    }
    // Now that we moved everything non-zero to the front of the array, we can fill
    // in the rest of the array from the lastNonZeroIndex with zeroes
    for(int i = lastNonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
