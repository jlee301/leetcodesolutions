package com.jlee.leetcodesolutions;

public class LeetCode698 {
  /*
   * Given an array of integers nums and a positive integer k, find whether it's
   * possible to divide this array into k non-empty subsets whose sums are all
   * equal.
   * 
   * Example 1:
   * Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
   * Output: True
   * Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3),
   * (2,3) with equal sums.
   * 
   * Note:
   * 1. 1 <= k <= len(nums) <= 16.
   * 2. 0 < nums[i] < 10000.
   * 
   * https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/
   */
  public boolean canPartitionKSubsets(int[] nums, int k) {
    int target = 0;
    for(int num : nums)
      target += num;
    
    if(target % k != 0) 
      return false;
    
    target /= k;
    return canPartitionKSubsets(nums, k, target, 0, new boolean[nums.length], 0);
  }
  
  private boolean canPartitionKSubsets(int[] nums, int k, int target, int sum, boolean[] used, int count) {
    if(k == 0 && count == nums.length)
        return true;
    if(sum == target)
      return canPartitionKSubsets(nums, k-1, target, 0, used, count);
    
    for(int i = 0; i < nums.length; i++) {
      if(used[i]) continue;
      if(sum + nums[i] > target)
        return false;
      used[i] = true;
      if(canPartitionKSubsets(nums, k, target, sum+nums[i], used, count+1))
        return true;
      used[i] = false;
    }
    return false;
  }
}
