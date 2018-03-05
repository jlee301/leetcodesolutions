package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
  /*
   * Given a sorted integer array without duplicates, return the summary of its
   * ranges.
   * 
   * Example 1: 
   * Input: [0,1,2,4,5,7] 
   * Output: ["0->2","4->5","7"]
   * 
   * Example 2: 
   * Input: [0,2,3,4,6,8,9] 
   * Output: ["0","2->4","6","8->9"]
   * 
   * https://leetcode.com/problems/summary-ranges/description/
   */
  public List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();
    if(nums == null || nums.length == 0)
      return list;
    
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      // Increment i until the next number is no longer continuous
      while(i < nums.length-1 && nums[i]+1 == nums[i+1]) i++;
      if(num != nums[i])
        list.add(num + "->" + nums[i]);
      else
        list.add("" + num);
    }
    return list;
  }
}
