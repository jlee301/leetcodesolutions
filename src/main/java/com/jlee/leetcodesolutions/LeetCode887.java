package com.jlee.leetcodesolutions;

public class LeetCode887 {
  /*
   * https://leetcode.com/contest/weekly-contest-96/problems/projection-area-of-3d-shapes/
   */
  public int projectionArea(int[][] grid) {    
    // find the max of each grid[i]
    int xy = 0;
    int xz = 0;
    int[] yzMax = new int[grid[0].length];    
    for(int[] g : grid) {
      int max = 0;
      for(int i = 0; i < g.length; i++) {
        // If no cube was dropped (g[i] == 0), we must not count towards xy area
        if(g[i] != 0)
          xy++;
        max = Math.max(max, g[i]);
        yzMax[i] = Math.max(yzMax[i], g[i]);
      }
      xz += max;
    }
    
    int yz = 0;
    for(int num : yzMax) 
      yz += num;
    
    return xy + xz + yz;
  }
}
