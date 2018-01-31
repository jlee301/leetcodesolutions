package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode046 {
  /*
   * Given a collection of distinct numbers, return all possible permutations.
   * 
   * For example, [1,2,3] have the following permutations: [ [1,2,3], [1,3,2],
   * [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
   * 
   * https://leetcode.com/problems/permutations/description/
   */
  private List<List<Integer>> result;
  private int[] nums;
  
  public List<List<Integer>> permute(int[] nums){
    result = new ArrayList<List<Integer>>();
    if(nums == null || nums.length == 0)
      return result;
    
    this.nums = nums;
    helper(new ArrayList<Integer>());
    return result;
  }
  
  private void helper(List<Integer> temp) {
    if(temp.size() == nums.length)
      result.add(new ArrayList<Integer>(temp));
    else {
      for(int i = 0; i < nums.length; i++) {
        if(temp.contains(nums[i])) continue;
        temp.add(nums[i]);
        helper(temp);
        temp.remove(temp.size()-1);
      }
    }
  }
}
