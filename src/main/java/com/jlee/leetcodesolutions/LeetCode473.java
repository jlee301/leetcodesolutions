package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode473 {
  /*
   * Remember the story of Little Match Girl? By now, you know exactly what
   * matchsticks the little match girl has, please find out a way you can make one
   * square by using up all those matchsticks. You should not break any stick, but
   * you can link them up, and each matchstick must be used exactly one time.
   * 
   * Your input will be several matchsticks the girl has, represented with their
   * stick length. Your output will either be true or false, to represent whether
   * you could make one square using all the matchsticks the little match girl
   * has.
   * 
   * Example 1:
   * Input: [1,1,2,2,2]
   * Output: true
   * Explanation: You can form a square with length 2, one side of the square came
   * two sticks with length 1.
   * 
   * Example 2:
   * Input: [3,3,3,3,4]
   * Output: false
   * Explanation: You cannot find a way to form a square with all the matchsticks.
   * 
   * Note:
   * 1. The length sum of the given matchsticks is in the range of 0 to 10^9.
   * 2. The length of the given matchstick array will not exceed 15.
   * 
   * https://leetcode.com/problems/matchsticks-to-square/description/
   */
  public boolean makesquare(int[] nums) {
    if(nums == null || nums.length < 4)
      return false;
    
    int sum = 0;
    for(int num : nums)
      sum += num;
    if(sum % 4 != 0)
      return false;

    // By sorting the array and traversing in descending order, you deduced finding
    // longer matchsticks going over the target sooner
    Arrays.sort(nums);
    return makesquare(nums, nums.length-1, sum/4, new int[4]);
  }
  
  private boolean makesquare(int[] nums, int pos, int target, int[] buckets) {
    if(pos == -1)
      return true;
    
    // Try all combinations until all buckets equal target
    for(int i = 0; i < 4; i++) {
      buckets[i] += nums[pos];
      if(buckets[i] <= target) {
        if(makesquare(nums, pos-1, target, buckets))
          return true;
      }
      buckets[i] -= nums[pos];
    }
    return false;
  }
}
