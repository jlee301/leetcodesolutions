package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode442 {
  /*
   * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
   * appear twice and others appear once.
   * 
   * Find all the elements that appear twice in this array.
   * 
   * Could you do it without extra space and in O(n) runtime?
   * 
   * Example: 
   * Input: [4,3,2,7,8,2,3,1]
   * Output: [2,3]
   * 
   * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
   */
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> list = new ArrayList<>();
    if(nums == null)
      return list;
    
    Arrays.sort(nums);
    for(int i = 0; i < nums.length-1; i++) {
      if(nums[i] == nums[i+1]) {
        list.add(nums[i]);
        i++;
      }
    }
    return list;
  }
}
