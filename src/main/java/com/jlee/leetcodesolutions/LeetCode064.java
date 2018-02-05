package com.jlee.leetcodesolutions;

public class LeetCode064 {
  /*
   * Given a m x n grid filled with non-negative numbers, find a path from top
   * left to bottom right which minimizes the sum of all numbers along its path.
   * 
   * Note: You can only move either down or right at any point in time.
   * 
   * Example 1: 
   * [ [1,3,1], 
   *   [1,5,1], 
   *   [4,2,1] ]
   * 
   * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the
   * sum.
   * 
   * https://leetcode.com/problems/minimum-path-sum/description/
   */
  public int minPathSum(int[][] grid) {
    if(grid == null || grid.length < 1 || grid[0].length < 1)
      return 0;
    
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(i == 0 && j == 0)
          grid[i][j] = grid[i][j];
        else if(i == 0)
          grid[i][j] = grid[i][j-1] + grid[i][j];
        else if(j == 0)
          grid[i][j] = grid[i-1][j] + grid[i][j];
        else {
          int min = Math.min(grid[i-1][j], grid[i][j-1]);
          grid[i][j] = min + grid[i][j];
        }
      }
    }
    return grid[grid.length-1][grid[0].length-1];
  }
}
