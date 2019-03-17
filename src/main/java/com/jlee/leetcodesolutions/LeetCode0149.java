package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Point;
import java.util.HashMap;

public class LeetCode0149 {
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
      // dupPoint stores how many times we see points[i]
      int dupPoint = 1, max = 0;
      HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
      for(int j = i + 1; j < points.length; j++) {
        int x = points[j].x - points[i].x;
        int y = points[j].y - points[i].y;
        if(x == 0 && y == 0) {
          dupPoint++;
          continue;
        }
        
        // reduce x / y to its lowest fractional form
        int gcd = gcd(x, y);
        x /= gcd;
        y /= gcd;
        map.computeIfAbsent(x, k -> new HashMap<>());
        map.get(x).put(y, map.get(x).getOrDefault(y, 0) + 1);

        // Keep track of the most repeated x / y
        max = Math.max(max, map.get(x).get(y));
      }
      // most repeated x / y + duplicate points[i]
      result = Math.max(result, max + dupPoint);
    }
    return result;
  }
  
  private int gcd(int a, int b) {
    if(b == 0)
      return a;
    else return gcd(b, a % b);
  }
}
