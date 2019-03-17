package com.jlee.leetcodesolutions;

public class LeetCode0330 {
  /*
   * Given a sorted positive integer array nums and an integer n, add/patch
   * elements to the array such that any number in range [1, n] inclusive can be
   * formed by the sum of some elements in the array. Return the minimum number of
   * patches required.
   * 
   * https://leetcode.com/problems/patching-array/description/
   */
  public int minPatches(int[] nums, int n) {
    int i = 0, patches = 0;
    // Assume we start at [0,0], the min number (nextN) to patch to get to [0,1] is
    // nextN = 1
    long nextN = 1;
    while(nextN <= n) {
      if(i < nums.length && nums[i] <= nextN) {
        nextN += nums[i];
        i++;
      }
      else {
        // If nums[i] is greater than the nextN, then we must patch nextN, creating
        // [0, nextN) range
        nextN += nextN;
        patches++;
      }
    }
    return patches;
  }
}
