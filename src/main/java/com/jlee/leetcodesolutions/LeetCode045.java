package com.jlee.leetcodesolutions;

public class LeetCode045 {
  /*
   * Given an array of non-negative integers, you are initially positioned at the
   * first index of the array.
   * 
   * Each element in the array represents your maximum jump length at that
   * position.
   * 
   * Your goal is to reach the last index in the minimum number of jumps.
   * 
   * https://leetcode.com/problems/jump-game-ii/
   */
  public int jump(int[] nums) {
    // Because it is guaranteed that you can reach the last index, we can use a
    // greedy approach

    // currEnd is the farthest you can be at the current jump
    // currMax is the farthest you can be at the next jump
    int jumps = 0, currEnd = 0, currMax = 0;    
    for(int i = 0; i < nums.length - 1; i++) {
      currMax = Math.max(currMax, i + nums[i]);
      if(i == currEnd) {
        // we reached the farthest we can go at the current jump
        jumps++;
        currEnd = currMax;
      }
    }
    return jumps;
  }
}
