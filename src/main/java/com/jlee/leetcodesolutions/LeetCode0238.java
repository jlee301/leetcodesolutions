package com.jlee.leetcodesolutions;

public class LeetCode0238 {
  /*
   * Given an array of n integers where n > 1, nums, return an array output such
   * that output[i] is equal to the product of all the elements of nums except
   * nums[i].
   * 
   * Solve it without division and in O(n).
   * 
   * For example, given [1,2,3,4], return [24,12,8,6].
   * 
   * https://leetcode.com/problems/product-of-array-except-self/description/
   */
  public int[] productExceptSelf(int[] nums) {
    if(nums == null || nums.length == 0)
      return new int[] {};
    
    /* 
     * nums = {1,2,3,4}
     * When this is done:       When done in reverse:
     * result[0] = 1            result[0] = 2 * 3 * 4
     * result[1] = 1            result[1] = 3 * 4
     * result[2] = 1 * 2        result[2] = 4
     * result[3] = 1 * 2 * 3    result[3] = 1
     * 
     * When the results are combined, you get the product without itself.
     */
    int[] result = new int[nums.length];
    // Get product left of i
    for(int i = 0, prd = 1; i < nums.length; i++) {
      result[i] = prd;
      prd *= nums[i];
    }
    // Get the product right of i
    for(int i = nums.length-1, prd = 1; i >= 0; i--) {
      result[i] *= prd;
      prd *= nums[i];
    }
    return result;
  }
}
