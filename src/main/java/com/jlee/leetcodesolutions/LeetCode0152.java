package com.jlee.leetcodesolutions;

public class LeetCode0152 {
  /*
   * Find the contiguous subarray within an array (containing at least one number)
   * which has the largest product.
   * 
   * For example, given the array [2,3,-2,4],
   * the contiguous subarray [2,3] has the largest product = 6.
   * 
   * https://leetcode.com/problems/maximum-product-subarray/description/
   */
  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE, maxHere = 1, minHere = 1;
    if(nums == null)
      return max;
    
    // We need to keep track of the max and min value at each nums[i]. The reason
    // why we need to track min is because in case it is negative and another
    // negative appears to turn it positive.
    for(int num : nums) {
      int prod1 = maxHere * num;
      int prod2 = minHere * num;
      maxHere = Math.max(num, Math.max(prod1, prod2));
      minHere = Math.min(num, Math.min(prod1, prod2));
      max = Math.max(max, maxHere);
    }
    return max;
  }
}
