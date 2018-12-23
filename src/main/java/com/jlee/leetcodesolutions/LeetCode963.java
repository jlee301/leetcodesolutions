package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode963 {
  public double minAreaFreeRect(int[][] points) {
    double min = Double.MAX_VALUE;
    HashMap<Integer,HashSet<Integer>> xmap = new HashMap<>();
    for(int[] pt : points)
      xmap.computeIfAbsent(pt[0], l -> new HashSet<>()).add(pt[1]);
    
    for(int i = 0; i < points.length; i++) {
      for(int j = i+1; j < points.length; j++) {
        for(int k = j+1; k < points.length; k++) {
          int[] pt1 = points[i], pt2 = points[j], pt3 = points[k];
          // Find which point is equally distance from the other two
          if(isValid(pt1, pt2, pt3)) {
            int[] pt4 = genPoint(pt1, pt2, pt3);
            if(xmap.containsKey(pt4[0]) && xmap.get(pt4[0]).contains(pt4[1]))
              min = Math.min(min, getArea(pt1, pt2, pt3));
          }
          
          if(isValid(pt2, pt1, pt3)) {
            int[] pt4 = genPoint(pt2, pt1, pt3);
            if(xmap.containsKey(pt4[0]) && xmap.get(pt4[0]).contains(pt4[1]))
              min = Math.min(min, getArea(pt2, pt1, pt3));            
          }
          
          if(isValid(pt3, pt1, pt2)) {
            int[] pt4 = genPoint(pt3, pt1, pt2);            
            if(xmap.containsKey(pt4[0]) && xmap.get(pt4[0]).contains(pt4[1]))
              min = Math.min(min, getArea(pt3, pt1, pt2));            
          }
        }
      }
    }    
    return min == Double.MAX_VALUE ? 0 : min;
  }
  
  private boolean isValid(int[] pt1, int[] pt2, int[] pt3) {
    double x1 = pt3[0] - pt1[0];
    double y1 = pt3[1] - pt1[1];
    double x2 = pt2[0] - pt1[0];
    double y2 = pt2[1] - pt1[1];
    return x1*x2 + y1*y2 == 0;
  }
  
  private int[] genPoint(int[] pt1, int[] pt2, int[] pt3) {
    return new int[] { pt3[0] - pt1[0] + pt2[0], pt3[1] - pt1[1] + pt2[1] };
  }
  
  private double getArea(int[] pt1, int[] pt2, int[] pt3) {
    double x1 = pt3[0] - pt1[0];
    double y1 = pt3[1] - pt1[1];
    double x2 = pt2[0] - pt1[0];
    double y2 = pt2[1] - pt1[1];
    return Math.sqrt(x1*x1 + y1*y1) * Math.sqrt(x2*x2 + y2*y2);
  }
}
