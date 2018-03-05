package com.jlee.leetcodesolutions;

public class LeetCode223 {
  /*
   * Find the total area covered by two rectilinear rectangles in a 2D plane.
   * 
   * Each rectangle is defined by its bottom left corner and top right corner as
   * shown in the figure.
   * 
   * Assume that the total area is never beyond the maximum possible value of int.
   * 
   * https://leetcode.com/problems/rectangle-area/description/
   */
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    // Find area of each rectangle
    int rect1 = (C-A) * (D-B);
    int rect2 = (G-E) * (H-F);
    
    // Find area of intersecting rectangle (if there is one)
    int rectOverlap = 0;
    int left = Math.max(A, E);
    int right = Math.min(C, G);
    int bot = Math.max(B, F);
    int top = Math.min(D, H);
    
    if(right > left && top > bot)
      rectOverlap = (right-left) * (top-bot);
    
    return rect1 + rect2 - rectOverlap;
  }
}
