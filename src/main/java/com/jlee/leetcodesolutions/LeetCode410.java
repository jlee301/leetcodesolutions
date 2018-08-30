package com.jlee.leetcodesolutions;

public class LeetCode410 {
  /*
   * Given an array which consists of non-negative integers and an integer m, you
   * can split the array into m non-empty continuous subarrays. Write an algorithm
   * to minimize the largest sum among these m subarrays.
   * 
   * Note:
   * If n is the length of array, assume the following constraints are satisfied:
   * 1. 1 ≤ n ≤ 1000 
   * 2. 1 ≤ m ≤ min(50, n)
   * 
   * https://leetcode.com/problems/split-array-largest-sum/description/
   */
  public int splitArray(int[] nums, int m) {
    // ie [1,2,3,4,5]
    //
    // 1. If every integer was its own subarray, then the left most value would be the
    // max integer of the array
    // [{1},{2},{3},{4},{5}] --> max subarray sum = 5
    //
    // 2. If the entire array was the subarray, then the right most value would be the
    // sum of the integers of the array    
    // [{1,2,3,4,5}] --> max subarray sum = 15
    long left = 0;
    long right = 0;
    for(int num : nums) {
      left = Math.max(left, num);
      right += num;
    }
    
    // Binary search every possible sum [left:right] looking for first instance that
    // is valid. All greater instances after will always be valid as well.
    while(left < right) {
      long mid = left + (right-left) / 2;
      if(isValid(nums, mid, m))
        right = mid;
      else
        left = mid+1;
    }
    return (int) left;
  }
  
  /*
   * This function is used to determine if you can create m non-empty continuous
   * subarrays that are <= max
   */
  private boolean isValid(int[] nums, long max, int m) {
    long sum = 0;
    int count = 1;
    for(int num : nums) {
      if(sum + num <= max) {
        sum += num;
      }
      else {
        // New subarray
        sum = num;
        count++;
        if(count > m)
          return false;
      }
    }
    return true;
  }
}
