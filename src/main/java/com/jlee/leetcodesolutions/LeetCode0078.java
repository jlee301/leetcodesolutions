package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0078 {
  /*
   * Given a set of distinct integers, nums, return all possible subsets (the
   * power set).
   * 
   * Note: The solution set must not contain duplicate subsets.
   * 
   * For example, If nums = [1,2,3], a solution is:
   * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
   * 
   * https://leetcode.com/problems/subsets/description/
   */
  private List<List<Integer>> result;
  
  public List<List<Integer>> subsets(int[] nums){
    result = new ArrayList<>();
    if(nums == null)
      return result;
    
    helper(new ArrayList<>(), nums, 0);
    return result;
  }
  
  private void helper(List<Integer> temp, int[] nums, int pos) {
    result.add(new ArrayList<>(temp));
    for(int i = pos; i < nums.length; i++) {
      temp.add(nums[i]);
      helper(temp, nums, i+1);
      temp.remove((Integer) nums[i]);
    }
  }
}
