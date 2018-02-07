package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode077 {
  /*
   * Given two integers n and k, return all possible combinations of k numbers out
   * of 1 ... n.
   * 
   * For example, If n = 4 and k = 2, a solution is:
   * [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4] ]
   * 
   * https://leetcode.com/problems/combinations/description/
   */
  private List<List<Integer>> result;

  public List<List<Integer>> combine(int n, int k) {
    result = new ArrayList<>();
    if(n < 1 || k < 1 || n < k)
      return result;
    
    int[] nums = new int[n];
    for(int i = 0; i < n; i++)
      nums[i] = i + 1;
    
    helper(new ArrayList<>(), nums, 0, k);
    return result;
  }
  
  private void helper(List<Integer> temp, int[] nums, int pos, int k) {
    if(temp.size() == k)
      result.add(new ArrayList<>(temp));
    else {
      for(int i = pos; i < nums.length; i++) {
        temp.add(nums[i]);
        helper(temp, nums, i+1, k);
        temp.remove((Integer) nums[i]);
      }
    }
  }
}
