package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode645 {
  /*
   * The set S originally contains numbers from 1 to n. But unfortunately, due to
   * the data error, one of the numbers in the set got duplicated to another
   * number in the set, which results in repetition of one number and loss of
   * another number.
   * 
   * Given an array nums representing the data status of this set after the error.
   * Your task is to firstly find the number occurs twice and then find the number
   * that is missing. Return them in the form of an array.
   * 
   * Example 1:
   * Input: nums = [1,2,2,4]
   * Output: [2,3]
   * 
   * Note:
   * 1. The given array size will in the range [2, 10000].
   * 2. The given array's numbers won't have any order.
   * 
   * https://leetcode.com/problems/set-mismatch/description/
   */
  public int[] findErrorNums(int[] nums) {
    if(nums == null || nums.length < 2)
      return new int[] {0,0};
    
    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++) {
      if(i+1 != nums[i])
        return new int[] {nums[i], i+1};
    }
    return new int[] {0,0};
  }
}
