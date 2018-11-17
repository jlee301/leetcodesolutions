package com.jlee.leetcodesolutions;

public class LeetCode042 {
  /*
   * Given n non-negative integers representing an elevation map where the width
   * of each bar is 1, compute how much water it is able to trap after raining.
   * 
   * https://leetcode.com/problems/trapping-rain-water/
   */
  public int trap(int[] height) {
    int maxLeft = 0, maxRight = 0, left = 0, right = height.length-1, trap = 0;
    while(left <= right) {
      maxLeft = Math.max(maxLeft, height[left]);
      maxRight = Math.max(maxRight, height[right]);

      if(maxLeft < maxRight)
        trap += maxLeft - height[left++];
      else
        trap += maxRight - height[right--];
    }
    return trap;
  }
}
