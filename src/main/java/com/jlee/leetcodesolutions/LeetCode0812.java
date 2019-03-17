package com.jlee.leetcodesolutions;

public class LeetCode0812 {
  /*
   * You have a list of points in the plane. Return the area of the largest
   * triangle that can be formed by any 3 of the points.
   * 
   * Example:
   * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
   * Output: 2
   * 
   * Explanation:
   * The five points are show in the figure below. The red triangle is the
   * largest.
   * 
   * https://leetcode.com/problems/largest-triangle-area/description/
   */
  public double largestTriangleArea(int[][] points) {
    if(points == null || points.length < 3)
      return 0.0;
    double result = 0.0;
    for(int i = 0; i < points.length-2; i++) {
      for(int j = i+1; j < points.length-1; j++) {
        for(int k = j+1; k < points.length; k++) {
          // area = 0.5 * |(x2y3-x3y2)-(x1y3-x3y1)+(x1y2-x2y1)|
          double area = Math.abs((points[j][0] * points[k][1] - points[k][0] * points[j][1])
              - (points[i][0] * points[k][1] - points[k][0] * points[i][1])
              + (points[i][0] * points[j][1] - points[j][0] * points[i][1])) * 0.5;
          result = Math.max(result, area);
        }
      }
    }
    return result;
  }
}
