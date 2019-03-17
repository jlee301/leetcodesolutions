package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0963 {
  public double minAreaFreeRect(int[][] points) {
    double min = Double.MAX_VALUE;
    HashMap<Integer,HashSet<Integer>> xmap = new HashMap<>();
    for(int[] pt : points)
      xmap.computeIfAbsent(pt[0], l -> new HashSet<>()).add(pt[1]);
    
    for(int i = 0; i < points.length; i++) {
      int[] pt1 = points[i];
      for(int j = 0; j < points.length; j++) {
        if(i == j) continue;
        int[] pt2 = points[j];
        for(int k = 0; k < points.length; k++) {
          if(k == i || k == j) continue;
          int[] pt3 = points[k];
          
          // Find the correct 90 degree orientation of three points: a^2 + b^2 = c^2
          //    (pt2)
          //      |\
          //      | \
          //      |  \
          //      |_  \
          //      |_|__\
          //  (pt3)   (pt1)
          if(distance(pt1, pt3) + distance(pt2, pt3) != distance(pt1, pt2))
            continue;
          
          // pt4
          int x = pt1[0] + pt2[0] - pt3[0];
          int y = pt1[1] + pt2[1] - pt3[1];
          if(xmap.containsKey(x) && xmap.get(x).contains(y))
            min = Math.min(min, Math.sqrt(distance(pt1, pt3)) * Math.sqrt(distance(pt2, pt3)));
        }
      }
    }
    return min == Double.MAX_VALUE ? 0 : min;
  }
  
  private int distance(int[] pt1, int[] pt2) {
    int a = pt1[0] - pt2[0];
    int b = pt1[1] - pt2[1];
    return a*a + b*b;
  }
}
