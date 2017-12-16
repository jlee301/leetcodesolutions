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
    if(nums == null || nums.length <= 1)
      return;

    // Take the k % nums.length so you only need to do a single round of rotations.
    // k(6) % length(4) = 2 --> You don't need to do all 6, you only need rotate 2
    // times.
    // If k = 0, then there's no rotation required.
    k = k % nums.length;
    if(k == 0)
      return;
    
    while(k > 0) {
      int last = nums[nums.length-1];
      for(int i = nums.length-1; i > 0; i--) {
        nums[i] = nums[i-1];
      }
      nums[0] = last;
      k--;
    }
  }
}
