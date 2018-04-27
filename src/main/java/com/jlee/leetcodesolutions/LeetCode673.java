package com.jlee.leetcodesolutions;

public class LeetCode673 {
  /*
   * Given an unsorted array of integers, find the number of longest increasing
   * subsequence.
   * 
   * Example 1:
   * Input: [1,3,5,4,7]
   * Output: 2
   * Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1,
   * 3, 5, 7].
   * 
   * Example 2:
   * Input: [2,2,2,2,2]
   * Output: 5
   * Explanation: The length of longest continuous increasing subsequence is 1,
   * and there are 5 subsequences' length is 1, so output 5.
   * 
   * Note: Length of the given array will be not exceed 2000 and the answer is
   * guaranteed to be fit in 32-bit signed int.
   * 
   * https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/
   */
  public int findNumberOfLIS(int[] nums) {
    int len = nums.length, max = 0;
    int[] lengths = new int[len], counts = new int[len];
    
    for(int i = 0; i < len; i++) {
      lengths[i] = counts[i] = 1;
      for(int j = 0; j < i; j++) {
        if(nums[i] > nums[j]) {
          if(lengths[i] == lengths[j] + 1)
            counts[i] += counts[j];
          
          if(lengths[i] < lengths[j] + 1) {
            lengths[i] = lengths[j] + 1;
            counts[i] = counts[j];
          }
        }
      }
      max = Math.max(max, lengths[i]);
    }

    int result = 0;
    for(int i = 0; i < len; i++) {
      if(lengths[i] == max)
        result += counts[i];
    }
    return result;
  }
}
