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
    // Find first island point
    int r = 0, c = 0;
    boolean found = false;
    search: for(r = 0; r < grid.length; r++) {
      for(c = 0; c < grid[r].length; c++) {
        if(grid[r][c] == 1) {
          found = true;
          break search;
        }
      }
    }
    if(found) {
      boolean[][] visited = new boolean[grid.length][grid[0].length];
      visited[r][c] = true;
      return dfs(grid, r, c, visited);
    }
    return 0;
  }
  
  public int dfs(int[][] grid, int r, int c, boolean[][] visited) {
    int count = 0;

    // Up, down, left, right
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };    
    for(int[] move : moves) {
      int nextR = r+move[0];
      int nextC = c+move[1];
      if(nextR < 0 || nextR == grid.length || nextC < 0 || nextC == grid[0].length || grid[nextR][nextC] == 0) {
        // Island surrounded by water, increment perimeter
        count++;
      }
      else {
        if(!visited[nextR][nextC]) {
          visited[nextR][nextC] = true;
          count += dfs(grid, nextR, nextC, visited);
        }
      }
    }    
    return count;
  }
}
