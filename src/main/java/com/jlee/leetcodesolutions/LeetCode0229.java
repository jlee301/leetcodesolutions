package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0229 {
  /*
   * Given an integer array of size n, find all elements that appear more than n/3
   * times. The algorithm should run in linear time and in O(1) space.
   * 
   * https://leetcode.com/problems/majority-element-ii/description/
   */
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> list = new ArrayList<>();
    if(nums == null || nums.length == 0)
      return list;
    
    Arrays.sort(nums);
    int n = nums.length / 3;
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int count = 1;
      
      // Skip ahead until the number doesn't match.
      while(i < nums.length-1 && num == nums[i+1]) {
        i++;
        count++;
      }
      if(count > n)
        list.add(num);
    }
    return list;
  }
}
