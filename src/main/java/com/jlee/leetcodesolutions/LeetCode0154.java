package com.jlee.leetcodesolutions;

public class LeetCode0154 {
  /*
   * Suppose an array sorted in ascending order is rotated at some pivot unknown
   * to you beforehand.
   * 
   * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
   * 
   * Find the minimum element.
   * 
   * The array may contain duplicates.
   * 
   * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
   */
  public int findMin(int[] nums) {
    int left = 0, right = nums.length-1;
    while(left < right) {
      int mid = left + (right - left) / 2;
      if(nums[mid] < nums[right]) {
        right = mid;
      }
      else if(nums[mid] > nums[right]) {
        left = mid + 1;
      }
      else {
        right--;
      }
    }
    return nums[left];
  }
}
