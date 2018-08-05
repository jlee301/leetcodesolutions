package com.jlee.leetcodesolutions;

public class LeetCode887 {
  /*
   * https://leetcode.com/contest/weekly-contest-96/problems/projection-area-of-3d-shapes/
   */
  public int projectionArea(int[][] grid) {
    // Estimated xy area
    int xy = grid.length * grid[0].length;
    
    // find the max of each grid[i]
    int xz = 0;
    int[] yz = new int[grid[0].length];    
    for(int[] g : grid) {
      int max = 0;
      for(int i = 0; i < g.length; i++) {
        // If no cube was dropped (g[i] = 0), we must decrement from the xy estimated area
        if(g[i] == 0)
          xy--;
        max = Math.max(max, g[i]);
        yz[i] = Math.max(yz[i], g[i]);
      }
      xz += max;
    }
    
    int yzArea = 0;
    for(int num : yz) 
      yzArea += num;
    
    return xy + xz + yzArea;
  }
}
