package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode016 {
  /*
   * Given an array S of n integers, find three integers in S such that the sum is
   * closest to a given number, target. Return the sum of the three integers. You
   * may assume that each input would have exactly one solution.
   * 
   * For example, given array S = {-1 2 1 -4}, and target = 1.
   * 
   * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
   * 
   * https://leetcode.com/problems/3sum-closest/description/
   */
  public int threeSumClosest(int[] nums, int target) {
    int result = Integer.MAX_VALUE;
    if(nums == null || nums.length < 3)
      return result;
    
    Arrays.sort(nums);
    int[] ans = new int[3];
    for(int i = 0; i < nums.length-2; i++) {
      if(i == 0 || nums[i] != nums[i-1]) {
        int low = i+1, high = nums.length-1;
        while(low < high) {
          int sum = nums[i] + nums[low] + nums[high];
          if(sum == target) {
            return sum;
          } else if(sum < target) {
            if(result > target - sum) {
              result = target - sum;
              ans[0] = nums[i]; ans[1] = nums[low]; ans[2] = nums[high];
            }
            low++;
          } else {
            if(result > sum - target) {
              result = sum - target;
              ans[0] = nums[i]; ans[1] = nums[low]; ans[2] = nums[high];
            }
            high--;
          }
        }
      }
    }
    return ans[0] + ans[1] + ans[2];
  }
}
