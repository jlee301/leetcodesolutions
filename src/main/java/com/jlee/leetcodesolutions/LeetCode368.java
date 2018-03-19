package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode368 {
  /*
   * Given a set of distinct positive integers, find the largest subset such that
   * every pair (Si, Sj) of elements in this subset satisfies: Si % Sj = 0 or Sj %
   * Si = 0.
   * 
   * If there are multiple solutions, return any subset is fine.
   * 
   * Example 1:
   * nums: [1,2,3]
   * Result: [1,2] (of course, [1,3] will also be ok)
   * 
   * Example 2:
   * nums: [1,2,4,8]
   * Result: [1,2,4,8]
   * 
   * https://leetcode.com/problems/largest-divisible-subset/description/
   */
  public List<Integer> largestDivisibleSubset(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if(nums == null || nums.length == 0)
      return result;
    
    Arrays.sort(nums);
    // Determine the longest divisible subset for each number
    // memo[i] is the length of longest subset for nums[i]
    // The min case if none of the numbers are divisible to each other is 1
    int[] memo = new int[nums.length];
    Arrays.fill(memo, 1);
    int maxLength = 1, maxIndex = 0;
    for(int i = 1; i < nums.length; i++) {
      for(int j = i-1; j >= 0; j--) {
        if(nums[i] % nums[j] == 0)
          memo[i] = Math.max(memo[i], memo[j]+1);
      }
      if(maxLength < memo[i]) {
        // Keep track of the longest divisible subset and its index so we do not have to
        // search for it later.
        maxLength = memo[i];
        maxIndex = i;
      }
    }
    // Now collect the numbers belonging subset from nums[maxIndex] to nums[0]
    for(int i = maxIndex, temp = nums[maxIndex]; i >= 0; i--) {
      if(temp % nums[i] == 0 && maxLength == memo[i]) {
        // If the memo[i] does not match maxLength, then it is divisible but not part of
        // the subset that we detected earlier.
        result.add(0, nums[i]);
        temp = nums[i];
        maxLength--;
      }
    }
    return result;
  }  
}
