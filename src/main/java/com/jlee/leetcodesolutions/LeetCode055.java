package com.jlee.leetcodesolutions;

public class LeetCode055 {
  /*
   * Given an array of non-negative integers, you are initially positioned at the
   * first index of the array.
   * 
   * Each element in the array represents your maximum jump length at that
   * position.
   * 
   * Determine if you are able to reach the last index.
   * 
   * For example: 
   * A = [2,3,1,1,4], return true.
   * A = [3,2,1,0,4], return false.
   * 
   * https://leetcode.com/problems/jump-game/description/
   */
  public boolean canJump(int[] nums) {
    if(nums == null || nums.length == 0)
      return false;
    
    // We are checking to see if the current position can reach the last good
    // position. If it can reach then we update the last position to the current.
    int pos = nums.length-1;
    for(int i = nums.length-1; i >= 0; i--) {
      if(i + nums[i] >= pos)
        pos = i;
    }
    // If the last good position is not zero, then there's no way to reach the end.
    return pos == 0;
  }
}
