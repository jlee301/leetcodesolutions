package com.jlee.leetcodesolutions;

public class LeetCode088 {
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
    int maxIndex = m + n - 1;
    int n1Index = m - 1;
    int n2Index = n - 1;
    
    while(maxIndex >= 0) {
      if(n1Index < 0) {
        // All nums1 processed so just process the rest of nums2
        nums1[maxIndex] = nums2[n2Index];
        n2Index--;
      } else if (n2Index < 0) {
        // All nums2 processed so just process the rest of nums1
        nums1[maxIndex] = nums1[n1Index];
        n1Index--;
      } else if (nums1[n1Index] >= nums2[n2Index]) {
        nums1[maxIndex] = nums1[n1Index];
        n1Index--;
      } else {
        nums1[maxIndex] = nums2[n2Index];
        n2Index--;
      }
      maxIndex--;
    }
  }
}
