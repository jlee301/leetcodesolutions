package com.jlee.leetcodesolutions;

public class LeetCode0807 {
  /*
   * In a 2 dimensional array grid, each value grid[i][j] represents the height of
   * a building located there. We are allowed to increase the height of any number
   * of buildings, by any amount (the amounts can be different for different
   * buildings). Height 0 is considered to be a building as well.
   * 
   * At the end, the "skyline" when viewed from all four directions of the grid,
   * i.e. top, bottom, left, and right, must be the same as the skyline of the
   * original grid. A city's skyline is the outer contour of the rectangles formed
   * by all the buildings when viewed from a distance. See the following example.
   * 
   * What is the maximum total sum that the height of the buildings can be
   * increased?
   * 
   * https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
   */
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int N = grid.length;
    int[] vert = new int[N];
    int[] hori = new int[N];
    int origHeight = 0;
    
    // Determine the max skylines both vertically and horizontally
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        vert[j] = Math.max(vert[j], grid[i][j]);
        hori[i] = Math.max(hori[i], grid[i][j]);
        origHeight += grid[i][j];
      }
    }
    
    int newHeight = 0;
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++)
        newHeight += Math.min(vert[j], hori[i]);
    }
    return newHeight - origHeight;
  }
}
