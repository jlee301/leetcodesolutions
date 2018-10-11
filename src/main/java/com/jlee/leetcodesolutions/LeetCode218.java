package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode218 {
  /*
   * https://leetcode.com/problems/the-skyline-problem/description/
   */
  public List<int[]> getSkyline(int[][] buildings) {
    List<int[]> result = new ArrayList<>();
    List<int[]> points = new ArrayList<>();
    
    // Split up each building as two points (start and end)
    for(int[] build : buildings) {
      points.add(new int[] {build[0], -build[2]});
      points.add(new int[] {build[1], build[2]});
    }
    
    // The order of processing each point is important:
    // 1. If you have two starting points at the same x, you want to process the
    // highest height first (which is why we use the negative value of the height)
    //
    // 2. If you have two end points at the same x, you want to process the lower
    // height first
    //
    // 3. If you have start and end point at the same x, you want to process the
    // start first (this works because start points all use negative value of the
    // height)
    Collections.sort(points, (a,b) -> {
      if(a[0] != b[0])
        return a[0] - b[0];
      else
        return a[1] - b[1];
    });
    
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    pq.add(0);
    int prevMaxHeight = 0;
    for(int[] pt : points) {
      // Reinsert into queue the correct height value if it was a starting point
      // Remove from the queue the height value if it was an end point
      if(pt[1] < 0)
        pq.add(-pt[1]);
      else
        pq.remove(pt[1]);
      
      // If the max height in the queue changes, then we must record the result
      int currMaxHeight = pq.peek();
      if(prevMaxHeight != currMaxHeight) {
        result.add(new int[] {pt[0], currMaxHeight});
        prevMaxHeight = currMaxHeight;
      }
    }
    return result;
  }
}
