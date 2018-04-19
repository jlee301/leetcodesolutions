package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode611 {
  /*
   * Given an array consists of non-negative integers, your task is to count the
   * number of triplets chosen from the array that can make triangles if we take
   * them as side lengths of a triangle.
   * 
   * Example 1:
   * Input: [2,2,3,4]
   * Output: 3
   * Explanation:
   * Valid combinations are:
   * 2,3,4 (using the first 2)
   * 2,3,4 (using the second 2)
   * 2,2,3
   * 
   * Note:
   * 1. The length of the given array won't exceed 1000.
   * 2. The integers in the given array are in the range of [0, 1000].
   * 
   * https://leetcode.com/problems/valid-triangle-number/description/
   */
  public int triangleNumber(int[] nums) {
    if(nums == null)
      return 0;
    // To determine if any given three lengths [a,b,c] can form a triangle then the
    // following conditions must be met: a+b > c, a+c > b, b+c > a
    // By sorting the array, then it shortens to check only for a+b > c
    Arrays.sort(nums);
    int count = 0;
    
    for(int i = 0; i < nums.length-2; i++) {
      // A side cannot be length 0
      if(nums[i] == 0) continue;
      int k = i+2;
      for(int j = i+1; j < nums.length-1; j++) {
        // Advance k if triangle conditions are met
        while(k < nums.length && nums[i]+nums[j] > nums[k]) k++;
        // Once we are not in a triangle condition the distance between j and k is the
        // number of valid triangles that could be formed for that given nums[i] and
        // nums[j] combination.
        count += k - j - 1;
      }
    }
    return count;
  }
}
