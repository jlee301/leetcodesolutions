package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode414 {
  /*
   * Given a non-empty array of integers, return the third maximum number in this
   * array. If it does not exist, return the maximum number. The time complexity
   * must be in O(n).
   * 
   * Example 1: 
   * Input: [3, 2, 1]
   * Output: 1
   * Explanation: The third maximum is 1. 
   * 
   * Example 2: 
   * Input: [1, 2]
   * Output: 2
   * Explanation: The third maximum does not exist, so the maximum (2) is returned
   * instead. 
   * 
   * Example 3: 
   * Input: [2, 2, 3, 1]
   * Output: 1
   * Explanation: Note that the third maximum here means the third maximum
   * distinct number. Both numbers with value 2 are both considered as second
   * maximum.
   * 
   * https://leetcode.com/problems/third-maximum-number/description/
   */
  public int thirdMax(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;

    Arrays.sort(nums);
    if(nums.length < 3)
      return nums[nums.length - 1];
    
    // Loop backwards and keep track of distincts
    int distincts = 0;
    //[2,3,4,4,4]
    //[1,2,3,4,4,4]
    //[3,3,4,4,4]
    //[4,4,4,4]
    for(int i = nums.length - 1; i > 0; i--) {
      if(nums[i] != nums[i-1])
        distincts++;
      
      if(distincts == 3)
        return nums[i];
    }
    
    if(distincts <= 1)
      return nums[nums.length - 1];
    else // distincts == 2
      return nums[0];
  }
}
