package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode939 {
  /*
   * Given a set of points in the xy-plane, determine the minimum area of a
   * rectangle formed from these points, with sides parallel to the x and y axes.
   * 
   * If there isn't any rectangle, return 0.
   * 
   * https://leetcode.com/problems/minimum-area-rectangle
   */
  public int minAreaRect(int[][] points) {
    // Map all y coordinates to its x
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    for(int[] pt : points)
      map.computeIfAbsent(pt[0], k -> new HashSet<>()).add(pt[1]);
    
    int minArea = Integer.MAX_VALUE;
    // Now for each point, find another point that is diagonal
    for(int[] pt1 : points) {
      for(int[] pt2 : points) {
        if(pt1[0] == pt2[0] || pt1[1] == pt2[1]) 
          continue;
        
        // Now we have two points that are diagonal, we must check to see if there are
        // two points adjacent to these
        if(map.get(pt1[0]).contains(pt2[1]) && map.get(pt2[0]).contains(pt1[1])) {
          // Calculate the area
          minArea = Math.min(minArea, Math.abs(pt1[1] - pt2[1]) * Math.abs(pt1[0] - pt2[0]));
        }
      }
    }
    return minArea == Integer.MAX_VALUE ? 0 : minArea;
  }
}
