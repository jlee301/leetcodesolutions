package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode503 {
  /*
   * Given a circular array (the next element of the last element is the first
   * element of the array), print the Next Greater Number for every element. The
   * Next Greater Number of a number x is the first greater number to its
   * traversing-order next in the array, which means you could search circularly
   * to find its next greater number. If it doesn't exist, output -1 for this
   * number.
   * 
   * Example 1:
   * Input: [1,2,1]
   * Output: [2,-1,2]
   * Explanation: The first 1's next greater number is 2;
   * The number 2 can't find next greater number;
   * The second 1's next greater number needs to search circularly, which is also
   * 2.
   * 
   * Note: The length of given array won't exceed 10000.
   * 
   * https://leetcode.com/problems/next-greater-element-ii/description/
   */
  public int[] nextGreaterElements(int[] nums) {
    if(nums == null || nums.length == 0)
      return new int[] {};
    
    int[] result = new int[nums.length];
    Arrays.fill(result, -1);
    int j = 0, len = nums.length;
    for(int i = 0; i < len; i++) {
      // Set index j to next element. If last element, set to zero.
      j = i+1 == len ? 0 : i+1;
      while(i != j) {
        // If loop comes back full circle, then it stops
        if(nums[i] < nums[j]) {
          result[i] = nums[j];
          break;
        }
        // Set index j to next element. If last element, set to zero.
        j = j+1 == len ? 0 : j+1;
      }
    }
    return result;
  }
}
