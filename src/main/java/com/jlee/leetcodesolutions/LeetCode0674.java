package com.jlee.leetcodesolutions;

public class LeetCode0674 {
  /*
   * Given an unsorted array of integers, find the length of longest continuous
   * increasing subsequence (subarray).
   * 
   * Example 1:
   * Input: [1,3,5,4,7]
   * Output: 3
   * 
   * Explanation: The longest continuous increasing subsequence is [1,3,5], its
   * length is 3. Even though [1,3,5,7] is also an increasing subsequence, it's
   * not a continuous one where 5 and 7 are separated by 4.
   * 
   * Example 2:
   * Input: [2,2,2,2,2]
   * Output: 1
   * 
   * Explanation: The longest continuous increasing subsequence is [2], its length
   * is 1.
   * 
   * Note: Length of the array will not exceed 10,000.
   * 
   * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
   */
  public int findLengthOfLCIS(int[] nums) {
    int max = 0;
    if(nums == null || nums.length == 0)
      return max;
    
    // i == location of starting element of increasing subarray
    // j == starting element of next increasing subarray
    int i = 0, j = 1;
    while(j < nums.length) {
      // advance until j is at the starting element of the next subarray
      if(nums[j-1] >= nums[j]) {
        max = Math.max(max, j - i);
        i = j;
      }
      j++;
    }
    max = Math.max(max, j - i);
    return max;
  }
}
