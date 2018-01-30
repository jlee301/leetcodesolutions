package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode040 {
  /*
   * Given a collection of candidate numbers (C) and a target number (T), find all
   * unique combinations in C where the candidate numbers sums to T.
   * 
   * Each number in C may only be used once in the combination.
   * 
   * Note:
   * 1. All numbers (including target) will be positive integers.
   * 2. The solution set must not contain duplicate combinations.
   * 
   * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
   * A solution set is: [ [1, 7], [1, 2, 5], [2, 6], [1, 1, 6] ]
   * 
   * https://leetcode.com/problems/combination-sum-ii/description/
   */
  private List<List<Integer>> result;
  private int[] candidates;
  
  public List<List<Integer>> combinationSum2(int[] candidates, int target){
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
        if(i > start && candidates[i] == candidates[i-1]) continue;
        temp.add(candidates[i]);
        helper(temp, target - candidates[i], i + 1);
        temp.remove(temp.size()-1);
      }
    }
  }
}
