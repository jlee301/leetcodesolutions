package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0324 {
  /*
   * Given an unsorted array nums, reorder it such that nums[0] < nums[1] >
   * nums[2] < nums[3]....
   * 
   * Example:
   * Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
   * Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].
   * 
   * Note:
   * You may assume all input has valid answer.
   * 
   * Follow Up: 
   * Can you do it in O(n) time and/or in-place with O(1) extra space?
   * 
   * https://leetcode.com/problems/wiggle-sort-ii/description/
   */
  public void wiggleSort(int[] nums) {
    if(nums == null || nums.length == 0)
      return;
    
    int[] numsClone = nums.clone();
    Arrays.sort(numsClone);    
    int mid = findKthLargest(numsClone, numsClone.length/2 + 1);
    // numbers greater than mid (fill first few odds indexes)
    // numbers less than mid (fill last few evens indexes)
    // numbers equal to mid (fill remaining indexes)
    Arrays.fill(nums, mid);
    int greaterThanMid = 1;
    int lessThanMid = (nums.length-1) % 2 == 0 ? nums.length-1 : nums.length-2;
    
    for(int num : numsClone) {
      if(num < mid) {
        nums[lessThanMid] = num;
        lessThanMid = lessThanMid - 2;
      } else if (num > mid) {
        nums[greaterThanMid] = num;
        greaterThanMid = greaterThanMid + 2;
      }
    }
  }
  
  private int findKthLargest(int[] nums, int k) {
    return nums[nums.length-k];
  }
}
