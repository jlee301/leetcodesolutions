package com.jlee.leetcodesolutions;

public class LeetCode0088 {
  /*
   * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
   * one sorted array.
   * 
   * Note:
   * 
   * You may assume that nums1 has enough space (size that is greater or equal to
   * m + n) to hold additional elements from nums2.  The number of elements
   * initialized in nums1 and nums2 are m and n respectively.
   * 
   * https://leetcode.com/problems/merge-sorted-array/description/
   * 
   * nums1: [1, 2, 3, 4, 0, 0], m=4
   * nums2: [2, 5], n=2
   * 
   * nums1: [1, 2, 2, 3, 4, 5]
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;      // pointer for nums1
    int j = n - 1;      // pointer for nums2
    int k = m + n - 1;  // writer pointer
    while(j >= 0) {
      if(i < 0 || nums2[j] >= nums1[i]) {
        nums1[k--] = nums2[j--];
      }
      else {
        swap(nums1, i, k);
        i--;
        k--;
      }
    }
  }
  
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
