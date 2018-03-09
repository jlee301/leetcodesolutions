package com.jlee.leetcodesolutions;

public class LeetCode300 {
  /*
   * Given an unsorted array of integers, find the length of longest increasing
   * subsequence.
   * 
   * For example, Given [10, 9, 2, 5, 3, 7, 101, 18],
   * 
   * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is
   * 4. Note that there may be more than one LIS combination, it is only necessary
   * for you to return the length.
   * 
   * https://leetcode.com/problems/longest-increasing-subsequence/description/
   */
  public int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    int[] memo = new int[nums.length];
    memo[0] = 1;
    int result = 1;

    // memo[i] represents the LIS up to i
    // Formula memo[i] = max(memo[j]) + 1, for j < i
    // Where the +1 is to include nums[i]
    for(int i = 1; i < nums.length; i++) {
      int maxLIS = 0;
      for(int j = 0; j < i; j++) {
        if(nums[j] < nums[i])
          maxLIS = Math.max(maxLIS, memo[j]);
      }
      memo[i] = maxLIS + 1;
      result = Math.max(result, memo[i]);
    }
    return result;
  }
  
  public int lengthOfLISBruteForce(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    return lengthOfLISHelper(nums, Integer.MIN_VALUE, 0);
  }
  
  private int lengthOfLISHelper(int[] nums, int prev, int pos) {
    if(pos == nums.length)
      return 0;
    
    int maxInclude = 0, maxExclude = 0;
    if(prev < nums[pos])
      maxInclude = 1 + lengthOfLISHelper(nums, nums[pos], pos+1);
    
    maxExclude = lengthOfLISHelper(nums, prev, pos+1);
    return Math.max(maxInclude, maxExclude);
  }
}
