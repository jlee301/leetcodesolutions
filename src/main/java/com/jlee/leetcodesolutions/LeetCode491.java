package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode491 {
  /*
   * Given an integer array, your task is to find all the different possible
   * increasing subsequences of the given array, and the length of an increasing
   * subsequence should be at least 2 .
   * 
   * Example:
   * Input: [4, 6, 7, 7]
   * Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7],
   * [4,7,7]]
   * 
   * Note:
   * 1. The length of the given array will not exceed 15.
   * 2. The range of integer in the given array is [-100,100].
   * 3. The given array may contain duplicates, and two equal integers should also
   * be considered as a special case of increasing sequence.
   * 
   * https://leetcode.com/problems/increasing-subsequences/description/
   */
  public List<List<Integer>> findSubsequences(int[] nums) {
    if(nums == null || nums.length < 1)
      return new ArrayList<>();
    
    // We are using HashSet to avoid duplicate subsequences
    HashSet<List<Integer>> set = new HashSet<>();
    findSubsequences(nums, 0, new ArrayList<>(), set);
    return new ArrayList<>(set);
  }
  
  private void findSubsequences(int[] nums, int pos, List<Integer> temp, HashSet<List<Integer>> set) {
    if(temp.size() > 1)
      set.add(new ArrayList<>(temp));
    
    for(int i = pos; i < nums.length; i++) {
      if(temp.size() == 0 || temp.get(temp.size()-1) <= nums[i]) {
        temp.add(nums[i]);
        findSubsequences(nums, i+1, temp, set);
        temp.remove(temp.size()-1);
      }
    }
  }
}
