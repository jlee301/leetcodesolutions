package com.jlee.leetcodesolutions;

public class LeetCode836 {
  /*
   * A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the
   * coordinates of its bottom-left corner, and (x2, y2) are the coordinates of
   * its top-right corner.
   * 
   * Two rectangles overlap if the area of their intersection is positive. To be
   * clear, two rectangles that only touch at the corner or edges do not overlap.
   * 
   * Given two rectangles, return whether they overlap.
   * 
   * https://leetcode.com/contest/weekly-contest-85/problems/rectangle-overlap/
   */
  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    // One rec is ahead of the other on x-axis
    if(rec2[0] >= rec1[2] || rec1[0] >= rec2[2])
        return false;
    
    // One rec is ahead of the other on y-axis
    if(rec2[1] >= rec1[3] || rec1[1] >= rec2[3])
        return false;
    
    return true;
  }
}
