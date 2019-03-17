package com.jlee.leetcodesolutions;

public class LeetCode0004 {
  /*
   * There are two sorted arrays nums1 and nums2 of size m and n respectively.
   * 
   * Find the median of the two sorted arrays. The overall run time complexity
   * should be O(log (m+n)).
   * 
   * You may assume nums1 and nums2 cannot be both empty.
   * 
   * https://leetcode.com/problems/median-of-two-sorted-arrays/
   */
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if(nums2.length < nums1.length)
      return findMedianSortedArrays(nums2, nums1);
    
    int N = nums1.length, M = nums2.length;
    int low = 0, high = nums1.length;
    while(low <= high) {
      int nums1Mid = low + (high - low) / 2;
      int nums1LeftMax = nums1Mid == 0 ? Integer.MIN_VALUE : nums1[nums1Mid - 1];
      int nums1RightMin = nums1Mid == N ? Integer.MAX_VALUE-1 : nums1[nums1Mid];
      
      int nums2Mid = (N + M + 1) / 2 - nums1Mid;
      int nums2LeftMax = nums2Mid == 0 ? Integer.MIN_VALUE : nums2[nums2Mid - 1];
      int nums2RightMin = nums2Mid == M ? Integer.MAX_VALUE-1 : nums2[nums2Mid];
      
      if(nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
        return (N + M) % 2 == 0 ? (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0 : Math.max(nums1LeftMax, nums2LeftMax);
      }
      else if(nums1LeftMax > nums2RightMin) {
        high = nums1Mid - 1;
      }
      else {
        low = nums1Mid + 1;
      }
    }
    return Double.MIN_VALUE;
  }
}
