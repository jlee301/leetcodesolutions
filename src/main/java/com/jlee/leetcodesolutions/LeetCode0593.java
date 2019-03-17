package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0593 {
  /*
   * Given the coordinates of four points in 2D space, return whether the four
   * points could construct a square.
   * 
   * The coordinate (x,y) of a point is represented by an integer array with two
   * integers.
   * 
   * Example:
   * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
   * Output: True
   * 
   * Note:
   * 1. All the input integers are in the range [-10000, 10000].
   * 2. A valid square has four equal sides with positive length and four equal
   * angles (90-degree angles).
   * 3. Input points have no order.
   * 
   * https://leetcode.com/problems/valid-square/description/
   */
  public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    int[][] p = {p1, p2, p3, p4};
    Arrays.sort(p, new coordinateComparator());
    // Sorting by x and then y
    // [0,0], [1,1], [1,0], [0,1] --> [0,0], [0,1], [1,0], [1,1]
    //
    // p[1]     p[3]
    //  o--------o
    //  |        |
    //  |        |
    //  |        |
    //  o--------o
    // p[0]     p[2]
    return distance(p[0], p[1]) > 0 
        // Check distance of all four connected points are same distance
        && distance(p[0], p[1]) == distance(p[1], p[3])
        && distance(p[1], p[3]) == distance(p[3], p[2]) 
        && distance(p[3], p[2]) == distance(p[2], p[0])
        // Check diagonal points are same distance
        && distance(p[0], p[3]) == distance(p[1], p[2]);
  }
  
  private int distance(int[] p1, int[] p2) {
    return Math.abs(p2[1] - p1[1]) + Math.abs(p2[0] - p1[0]);
  }
  
  private class coordinateComparator implements Comparator<int[]>{
    @Override
    public int compare(int[] p1, int[] p2) {
      if(p1[0] == p2[0])
        return p1[1] - p2[1];
      else
        return p1[0] - p2[0];
    }
  }
}
