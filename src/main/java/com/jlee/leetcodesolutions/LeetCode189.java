package com.jlee.leetcodesolutions;

public class LeetCode189 {
  /*
   * Rotate an array of n elements to the right by k steps.
   * 
   * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
   * [5,6,7,1,2,3,4].
   * 
   * https://leetcode.com/problems/rotate-array/description/
   */
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    if(k == 0)
      return;
    
    int[] temp = nums.clone();
    int i = k, j = 0;
    while(j < temp.length) {
      nums[i++] = temp[j++];
      
      if(i == nums.length)
        i = 0;
    }
  }
}
