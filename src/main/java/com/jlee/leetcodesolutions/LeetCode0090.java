package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0090 {
  /*
   * Given a collection of integers that might contain duplicates, nums, return
   * all possible subsets (the power set).
   * 
   * Note: The solution set must not contain duplicate subsets.
   * 
   * For example, If nums = [1,2,2], a solution is:
   * [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
   * 
   * https://leetcode.com/problems/subsets-ii/description/
   */
  private List<List<Integer>> result;
  
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    result = new ArrayList<>();
    if(nums == null)
      return result;
    
    Arrays.sort(nums);
    helper(new ArrayList<>(), nums, 0);
    return result;
  }
  
  private void helper(List<Integer> temp, int[] nums, int pos) {
    result.add(new ArrayList<>(temp));
    for(int i = pos; i < nums.length; i++) {
      if(i > pos && nums[i] == nums[i-1]) continue;
      temp.add(nums[i]);
      helper(temp, nums, i+1);
      temp.remove(temp.size()-1);
    }
  }
}
