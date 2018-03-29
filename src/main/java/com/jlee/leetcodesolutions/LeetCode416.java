package com.jlee.leetcodesolutions;

public class LeetCode416 {
  /*
   * Given a non-empty array containing only positive integers, find if the array
   * can be partitioned into two subsets such that the sum of elements in both
   * subsets is equal.
   * 
   * Note:
   * Each of the array element will not exceed 100.
   * The array size will not exceed 200.
   * 
   * Example 1:
   * Input: [1, 5, 11, 5]
   * Output: true
   * Explanation: The array can be partitioned as [1, 5, 5] and [11]. 
   * 
   * Example 2:
   * Input: [1, 2, 3, 5]
   * Output: false
   * Explanation: The array cannot be partitioned into equal sum subsets.
   * 
   * https://leetcode.com/problems/partition-equal-subset-sum/description/
   */
  public boolean canPartition(int[] nums) {
    if(nums == null)
      return false;
    int sum = 0;
    for(int num : nums)
      sum += num;
    if(sum % 2 != 0)
      return false;
    sum /= 2;
    int[][] memo = new int[nums.length+1][sum + 1];
    return canPartitionHelper(nums, 0, sum, memo);
  }
  
  private boolean canPartitionHelper(int[] nums, int pos, int target, int[][] memo) {
    if(target < 0) return false;
    if(target == 0) return true;
    if(pos == nums.length) return false;
    // if(memo[pos][target] == 1) return true;
    if(memo[pos][target] == 2) return false;
    
    boolean result = false;
    // Return taking nums[pos] or not taking nums[pos]
    result = canPartitionHelper(nums, pos+1, target-nums[pos], memo) || canPartitionHelper(nums, pos+1, target, memo);
    memo[pos][target] = result ? 1 : 2;
    return result;
  }
}
