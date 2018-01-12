package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode628 {
  /*
   * Given an integer array, find three numbers whose product is maximum and
   * output the maximum product.
   * 
   * Example 1:
   * Input: [1,2,3]
   * Output: 6
   * 
   * Example 2:
   * Input: [1,2,3,4]
   * Output: 24
   * 
   * Note:
   * 1. The length of the given array will be in range [3,104] and all elements
   * are in the range [-1000, 1000].
   * 2. Multiplication of any three numbers in the input won't exceed the range of
   * 32-bit signed integer.
   * 
   * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
   */
  public int maximumProduct(int[] nums) {
    if(nums == null || nums.length < 3)
      return 0;
    
    Arrays.sort(nums);
    // If the product of the first two numbers is >= the product of the last two
    // numbers then the first two numbers are negative numbers.
    //
    // The second check is seeing if the last two numbers are negative, it means all
    // the numbers are negative in the array.
    if(nums[0] * nums[1] >= nums[nums.length-1] * nums[nums.length-2] 
        && !(nums[nums.length-1] < 0) && !(nums[nums.length-2] < 0))
      return nums[0] * nums[1] * nums[nums.length-1];
    else
      return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

    /*
    return Math.max(nums[0] * nums[1] * nums[nums.length-1], 
        nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);
    */
  }
}
