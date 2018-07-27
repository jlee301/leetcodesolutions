package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode587 {
  /*
   * There are some trees, where each tree is represented by (x,y) coordinate in a
   * two-dimensional garden. Your job is to fence the entire garden using the
   * minimum length of rope as it is expensive. The garden is well fenced only if
   * all the trees are enclosed. Your task is to help find the coordinates of
   * trees which are exactly located on the fence perimeter.
   * 
   * https://leetcode.com/problems/erect-the-fence/description/
   */
  class Point {
    int x;
    int y;
    Point(int a, int b) { x = a; y = b; }
  }
  
  public List<Point> outerTrees(Point[] points) {
    // Find the left most point on x axis
    Point start = points[0];
    for(int i = 1; i < points.length; i++) {
      if(points[i].x < start.x)
        start = points[i];
    }

    List<Point> collinear = new ArrayList<>();    
    HashSet<Point> set = new HashSet<>();
    set.add(start);
    Point curr = start;
    
    while(true) {
      // Find next point furthest left from curr
      Point next = points[0];
      for(int i = 1; i < points.length; i++) {
        if(curr == points[i]) continue;
        
        // Check the cross product to see if points[i] is to the left or right of
        // curr-->next vector
        int value = crossProduct(curr, next, points[i]);
        if(value > 0) {
          // Choose points[i] as next target
          // Clear any previous collinear values
          next = points[i];
          collinear = new ArrayList<>();
        }
        else if(value == 0) {
          // Pick the furthest point as next target
          // Set closer point as collinear
          if(dist(curr, next, points[i]) < 0) {
            collinear.add(next);
            next = points[i];
          }
          else {
            collinear.add(points[i]);
          }
        }
        // Do nothing if value < 0, points[i] is right of curr-->next vector
      }
      
      // Add all collinear points
      set.addAll(collinear);
      
      // We have circled back to the start, stop the loop
      if(next == start)
        break;
      
      set.add(next);
      curr = next;
    }
    return new ArrayList<>(set);
  }
  
  // return > 0, point c is left of ab
  // return = 0, point c is collinear to ab
  // return < 0, point c is right of ab
  private int crossProduct(Point a, Point b, Point c) {
    int x1 = a.x - b.x;
    int y1 = a.y - b.y;
    int x2 = a.x - c.x;
    int y2 = a.y - c.y;
    return y2*x1 - y1*x2;
  }
  
  // return > 0, point c is closer to a
  // return = 0, point c and point b are same distance from a
  // return < 0, point b is closer to a
  private int dist(Point a, Point b, Point c) {
    int x1 = a.x - b.x;
    int y1 = a.y - b.y;
    int x2 = a.x - c.x;
    int y2 = a.y - c.y;
    return Integer.compare(y1*y1 + x1*x1, y2*y2 + x2*x2);
  }
}
