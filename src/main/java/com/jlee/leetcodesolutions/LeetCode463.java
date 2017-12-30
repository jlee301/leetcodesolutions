package com.jlee.leetcodesolutions;

public class LeetCode463 {
  /*
   * You are given a map in form of a two-dimensional integer grid where 1
   * represents land and 0 represents water. Grid cells are connected
   * horizontally/vertically (not diagonally). The grid is completely surrounded
   * by water, and there is exactly one island (i.e., one or more connected land
   * cells). The island doesn't have "lakes" (water inside that isn't connected to
   * the water around the island). One cell is a square with side length 1. The
   * grid is rectangular, width and height don't exceed 100. Determine the
   * perimeter of the island.
   * 
   * Example:
   * [[0,1,0,0], 
   *  [1,1,1,0], 
   *  [0,1,0,0], 
   *  [1,1,0,0]]
   * 
   * Answer: 16
   * 
   * https://leetcode.com/problems/island-perimeter/description/
   */
  public int islandPerimeter(int[][] grid) {
    if(grid == null)
      return 0;
    
    // Assume every island has 4 sides.
    // If the island has a right neighbor, subtract 2
    // If the island has a below neighbor, subtract 2
    int islands = 0;
    int neighborIsland = 0;
    
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(grid[i][j] == 1) {
          // Counting all islands
          islands++;
          
          // Does it have a right neighbor?
          if(j < grid[i].length - 1 && grid[i][j + 1] == 1)
            neighborIsland++;
          
          // Does it have a below neighbor?
          if(i < grid.length - 1 && grid[i + 1][j] == 1)
            neighborIsland++;          
        }
      }      
    }
    return(4*islands - 2*neighborIsland);
  }
}
