package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0581 {
  /*
   * Given an integer array, you need to find one continuous subarray that if you
   * only sort this subarray in ascending order, then the whole array will be
   * sorted in ascending order, too.
   * 
   * You need to find the shortest such subarray and output its length.
   * 
   * Example 1:
   * Input: [2, 6, 4, 8, 10, 9, 15]
   * Output: 5
   * 
   * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the
   * whole array sorted in ascending order.
   * 
   * Note:
   * 1. Then length of the input array is in range [1, 10,000].
   * 2. The input array may contain duplicates, so ascending order here means <=.
   * 
   * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
   */
  public int findUnsortedSubarray(int[] nums) {
    int[] clone = nums.clone();
    Arrays.sort(clone);
    int i = 0;
    while(i < clone.length && clone[i] == nums[i])
      i++;
    
    int j = clone.length-1;
    while(j >= i+1 && clone[j] == nums[j])
      j--;
    
    return i == clone.length ? 0 : j - i + 1;
  }
}
