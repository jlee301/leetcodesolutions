package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode042 {
  /*
   * Given n non-negative integers representing an elevation map where the width
   * of each bar is 1, compute how much water it is able to trap after raining.
   * 
   * https://leetcode.com/problems/trapping-rain-water/
   */
  public int trap(int[] height) {
    int trap = 0;
    int maxLeft = 0;
    
    // pq keeps track of the maxRight
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    for(int i = 0; i < height.length; i++)
      pq.add(height[i]);

    for(int i = 0; i < height.length; i++) {
      maxLeft = Math.max(maxLeft, height[i]);
      
      if(i > 0)
        pq.remove(height[i-1]);
      
      trap += Math.min(maxLeft, pq.peek()) - height[i];
    }
    
    return trap;
  }
}
