package com.jlee.leetcodesolutions;

public class LeetCode485 {
  /*
   * Given a binary array, find the maximum number of consecutive 1s in this
   * array.
   * 
   * Example 1: 
   * Input: [1,1,0,1,1,1] 
   * Output: 3
   * 
   * Explanation: The first two digits or the last three digits are consecutive
   * 1s. The maximum number of consecutive 1s is 3.
   * 
   * Note:
   * 1. The input array will only contain 0 and 1.
   * 2. The length of input array is a positive integer and will not exceed 10,000
   * 
   * https://leetcode.com/problems/max-consecutive-ones/description/
   */
  public int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    if(nums == null || nums.length == 0)
      return result;
    
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 1)
        count++;
      
      if(nums[i] == 0 || i == nums.length - 1) {
        if(count > result)
          result = count;
        
        count = 0;
      }
    }
    return result;
  }
}
