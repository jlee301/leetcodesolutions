package com.jlee.leetcodesolutions;

public class LeetCode0713 {
  /*
   * Your are given an array of positive integers nums.
   * 
   * Count and print the number of (contiguous) subarrays where the product of all
   * the elements in the subarray is less than k.
   * 
   * Example 1:
   * 
   * Input: nums = [10, 5, 2, 6], k = 100
   * 
   * Output: 8
   * 
   * Explanation: The 8 subarrays that have product less than 100 are: [10], [5],
   * [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]. Note that [10, 5, 2] is not
   * included as the product of 100 is not strictly less than k.
   * 
   * Note:
   * 1. 0 < nums.length <= 50000.
   * 2. 0 < nums[i] < 1000.
   * 3. 0 <= k < 10^6.
   * 
   * https://leetcode.com/problems/subarray-product-less-than-k/description/
   */
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if(k <= 1)
      return 0;
    
    int count = 0, left = 0, product = 1;
    for(int right = 0; right < nums.length; right++) {
      product *= nums[right];
      
      // If product >= k, adjust left until it is no longer (sliding window)
      while(product >= k) {
        product /= nums[left];
        left++;
      }
      
      // The length of the window is the number of contiguous subarrays < k
      count += right - left + 1;
    }
    return count;
  }
}
