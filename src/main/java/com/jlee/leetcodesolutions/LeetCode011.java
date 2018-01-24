package com.jlee.leetcodesolutions;

public class LeetCode011 {
  /*
   * Given n non-negative integers a1, a2, ..., an, where each represents a point
   * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
   * of line i is at (i, ai) and (i, 0). Find two lines, which together with
   * x-axis forms a container, such that the container contains the most water.
   * 
   * Note: You may not slant the container and n is at least 2.
   * 
   * https://leetcode.com/problems/container-with-most-water/description/
   */
  public int maxArea(int[] height) {
    if(height == null || height.length < 2)
      return 0;
    
    int result = 0, start = 0, end = height.length-1;
    while(start < end) {
      result = Math.max(result, Math.min(height[start], height[end]) * (end - start));
      if(height[start] < height[end])
        start++;
      else
        end--;
    }
    return result;
  }
}
