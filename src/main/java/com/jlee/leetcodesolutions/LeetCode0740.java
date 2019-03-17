package com.jlee.leetcodesolutions;

public class LeetCode0740 {
  /*
   * Given an array nums of integers, you can perform operations on the array.
   * 
   * In each operation, you pick any nums[i] and delete it to earn nums[i] points.
   * After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
   * 
   * You start with 0 points. Return the maximum number of points you can earn by
   * applying such operations.
   * 
   * Note: 1. The length of nums is at most 20000. 2. Each element nums[i] is an
   * integer in the range [1, 10000].
   * 
   * https://leetcode.com/problems/delete-and-earn/description/
   */
  public int deleteAndEarn(int[] nums) {
    // Sum based off the number
    int[] count = new int[10001];    
    for(int num : nums)
      count[num] += num;
    
    int skip = 0, take = 0;
    for(int i = 0; i < count.length; i++) {
      // skip : is the value for not taking current ith value
      // take : is the max of taking ith value or if the previous take was larger
      // skip + count[i] = taking ith value
      int temp = Math.max(skip + count[i], take);
      skip = take;
      take = temp;
    }
    return take;
  }
}
