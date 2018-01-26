package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode015 {
  /*
   * Given an array S of n integers, are there elements a, b, c in S such that a +
   * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
   * 
   * Note: The solution set must not contain duplicate triplets.
   * 
   * For example, given array S = [-1, 0, 1, 2, -1, -4],
   * 
   * A solution set is: [[-1, 0, 1], [-1, -1, 2]]
   * 
   * https://leetcode.com/problems/3sum/description/
   */
  public List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(nums == null || nums.length < 3)
      return result;
    
    Arrays.sort(nums);
    for(int i = 0; i < nums.length-2; i++) {
      // If nums[i] == nums[i-1] then skip ahead because we already checked
      if(i == 0 || nums[i] != nums[i-1]) {
        int low = i+1, high = nums.length-1, sum = 0 - nums[i];
        while(low < high) {
          if(nums[low] + nums[high] == sum) {
            result.add(Arrays.asList(nums[i], nums[low], nums[high]));
            // If nums[low] == nums[low+1] then skip ahead because we already checked
            while(low < high && nums[low] == nums[low+1]) low++;
            // If nums[high] == nums[high-1] then skip ahead because we already checked
            while(low < high && nums[high] == nums[high-1]) high--;
            // These increments is so we move to the next element that is not the same
            low++;
            high--;
          } else if(nums[low] + nums[high] < sum) {
            low++;
          } else {
            high--;
          }
        }
      }
    }
    return result;
  }  
}
