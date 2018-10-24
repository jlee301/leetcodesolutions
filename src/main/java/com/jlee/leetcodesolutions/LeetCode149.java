package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Point;
import java.util.HashMap;

public class LeetCode149 {
  /*
   * Given n points on a 2D plane, find the maximum number of points that lie on
   * the same straight line.
   * 
   * https://leetcode.com/problems/max-points-on-a-line/
   */
  public int maxPoints(Point[] points) {
    int result = 0;
    if(points == null || points.length == 0)
      return result;
    
    for(int i = 0; i < points.length; i++) {
      // Store the count of how many times a slope occurs with points[i] and points[j]
      HashMap<Double,Integer> map = new HashMap<>();
      
      // Compare points[i] with points[j] to find its slope
      int dupPoint = 1;
      for(int j = i + 1; j < points.length; j++) {
        if(points[i].x == points[j].x && points[i].y == points[j].y) {
          // points[i] == points[j]
          dupPoint++;
        }
        else if(points[i].y == points[j].y) {
          // denominator of the slope is zero
          map.put(Double.MAX_VALUE, map.getOrDefault(Double.MAX_VALUE, 0) + 1);
        }
        else {
          // calculate the slope
          double slope = (double) (points[j].x - points[i].x) / (double) (points[j].y - points[i].y);
          map.put(slope, map.getOrDefault(slope, 0) + 1);
        }
      }
      // Which slope has max count
      int max = 0;
      for(int next : map.values()) {
        max = Math.max(max, next);
      }
      // Now add all of the duplicate points as part of the line
      max += dupPoint;
      result = Math.max(result, max);
    }
    return result;
  }
}
