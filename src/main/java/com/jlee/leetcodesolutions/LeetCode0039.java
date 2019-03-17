package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0039 {
  /*
   * Given a set of candidate numbers (C) (without duplicates) and a target number
   * (T), find all unique combinations in C where the candidate numbers sums to T.
   * 
   * The same repeated number may be chosen from C unlimited number of times.
   * 
   * Note:
   * 1. All numbers (including target) will be positive integers.
   * 2. The solution set must not contain duplicate combinations.
   * 
   * For example, given candidate set [2, 3, 6, 7] and target 7,
   * A solution set is: [ [7], [2, 2, 3] ]
   * 
   * https://leetcode.com/problems/combination-sum/description/
   */
  private List<List<Integer>> result;
  private int[] candidates;
  
  public List<List<Integer>> combinationSum(int[] candidates, int target){
    result = new ArrayList<>();
    if(candidates == null || candidates.length == 0)
      return result;
    
    this.candidates = candidates;
    Arrays.sort(this.candidates);
    helper(new ArrayList<Integer>(), target, 0);
    return result;
  }
  
  private void helper(List<Integer> temp, int target, int start) {
    if(target < 0)
      return;
    else if(target == 0)
      result.add(new ArrayList<>(temp));
    else {
      for(int i = start; i < candidates.length; i++) {
        temp.add(candidates[i]);
        helper(temp, target - candidates[i], i);
        temp.remove(temp.size()-1);
      }
    }
  }
}
