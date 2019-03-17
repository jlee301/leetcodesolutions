package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0493 {
  /*
   * Given an array nums, we call (i, j) an important reverse pair if i < j and
   * nums[i] > 2*nums[j].
   * 
   * You need to return the number of important reverse pairs in the given array.
   * 
   * Note:
   * 1. The length of the given array will not exceed 50,000.
   * 2. All the numbers in the input array are in the range of 32-bit integer.
   * 
   * https://leetcode.com/problems/reverse-pairs/description/
   */
  public int reversePairs(int[] nums) {
    return reversePairs(nums, 0, nums.length-1);
  }
  
  private int reversePairs(int[] nums, int left, int right) {
    if(left >= right)
      return 0;
    
    int mid = left + (right-left)/2;
    // Obtain the number of important reverse pairs on the left and right sides independently
    int count = reversePairs(nums, left, mid) + reversePairs(nums, mid+1, right);
    
    // Now determine how many of the left side create important reverse pairs with the right
    for(int i = left, j = mid+1; i <= mid; i++) {
      // To avoid any possible overflow, we divide nums[i]/2.0 instead of 2*nums[j]
      while(j <= right && nums[i]/2.0 > nums[j]) j++;
      count += j - (mid+1);
    }
    Arrays.sort(nums, left, right+1);
    return count;
  }
}
