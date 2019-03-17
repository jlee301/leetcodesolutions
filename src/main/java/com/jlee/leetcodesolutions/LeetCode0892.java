package com.jlee.leetcodesolutions;

public class LeetCode0892 {
  /*
   * On a N * N grid, we place some 1 * 1 * 1 cubes.
   * 
   * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid
   * cell (i, j).
   * 
   * Return the total surface area of the resulting shapes.
   * 
   * https://leetcode.com/contest/weekly-contest-99/problems/surface-area-of-3d-shapes/
   */
  public int surfaceArea(int[][] grid) {
    int area = 0;
    int R = grid.length;
    int C = grid[0].length;
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++) {
        if(grid[r][c] != 0) {
          // Surface area top and bottom
          area += 2;
        }
        
        // Check surrounding adjacent
        // check left
        if(c-1 < 0)
          area += grid[r][c];
        
        // check up
        if(r-1 < 0)
          area += grid[r][c];
        
        // We only check the difference of curr --> right and curr --> down to avoid
        // double counting the area with curr --> left and curr --> up
        // check right
        if(c+1 == C)
          area += grid[r][c];
        else
          area += Math.abs(grid[r][c] - grid[r][c+1]);
        
        // check down
        if(r+1 == R)
          area += grid[r][c];
        else
          area += Math.abs(grid[r][c] - grid[r+1][c]);
      }
    }
    return area;
  }
}
