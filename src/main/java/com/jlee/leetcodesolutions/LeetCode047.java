package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode047 {
  /*
   * Given a collection of numbers that might contain duplicates, return all
   * possible unique permutations.
   * 
   * For example, [1,1,2] have the following unique permutations: [ [1,1,2],
   * [1,2,1], [2,1,1] ]
   * 
   * https://leetcode.com/problems/permutations-ii/description/
   */
  private List<List<Integer>> result;
  private int[] nums;
  private boolean[] check;
  
  public List<List<Integer>> permuteUnique(int[] nums){
    result = new ArrayList<List<Integer>>();
    if(nums == null || nums.length == 0)
      return result;
    
    this.nums = nums;
    Arrays.sort(this.nums);
    check = new boolean[nums.length];
    helper(new ArrayList<Integer>());
    return result;
  }
  
  private void helper(List<Integer> temp) {
    if(temp.size() == nums.length)
      result.add(new ArrayList<Integer>(temp));
    else {
      for(int i = 0; i < nums.length; i++) {
        // You only want to skip if the element is already in use OR if the previous
        // element is the same and has not been used. This is to prevent duplicates.
        if(check[i] || (i > 0 && nums[i] == nums[i-1] && !check[i-1])) continue;
        temp.add(nums[i]);
        check[i] = true;
        helper(temp);
        temp.remove(temp.size()-1);
        check[i] = false;
      }
    }
  }
}
