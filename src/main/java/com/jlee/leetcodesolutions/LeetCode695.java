package com.jlee.leetcodesolutions;

public class LeetCode695 {
  /*
   * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's
   * (representing land) connected 4-directionally (horizontal or vertical.) You
   * may assume all four edges of the grid are surrounded by water.
   * 
   * Find the maximum area of an island in the given 2D array. (If there is no
   * island, the maximum area is 0.)
   * 
   * Example 1: 
   * [[0,0,1,0,0,0,0,1,0,0,0,0,0], 
   *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
   *  [0,1,1,0,1,0,0,0,0,0,0,0,0], 
   *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
   *  [0,1,0,0,1,1,0,0,1,1,1,0,0], 
   *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
   *  [0,0,0,0,0,0,0,1,1,1,0,0,0], 
   *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
   * 
   * Given the above grid, return 6. Note the answer is not 11, because the island
   * must be connected 4-directionally.
   * 
   * Example 2: 
   * [[0,0,0,0,0,0,0,0]]
   * 
   * Given the above grid, return 0.
   * 
   * Note: The length of each dimension in the given grid does not exceed 50.
   * 
   * https://leetcode.com/problems/max-area-of-island/description/
   */
  private int[][] grid;
  private boolean[][] check;
  
  public int maxAreaOfIsland(int[][] grid) {
    if(grid == null || grid.length == 0 || grid[0].length == 0)
      return 0;
    
    // This is to avoid the object being copied very time it is passed, so just use
    // a global variable.
    this.grid = grid;
    
    // This is to make sure we do not recheck a grid that been checked from before
    check = new boolean[grid.length][grid[0].length];
    
    int maxArea = 0;
    for(int i = 0; i < grid.length; i++)
      for(int j = 0; j < grid[i].length; j++)
        maxArea = Math.max(maxArea, areaAt(i, j));
    
    return maxArea;
  }
  
  private int areaAt(int row, int col) {
    if (row < 0 || row == grid.length || col < 0 || col == grid[0].length || 
        check[row][col] || grid[row][col] == 0)
      return 0;
    
    check[row][col] = true;
    int result = 1;
    // Now check up, down, left, right possible connected islands
    result += areaAt(row-1, col) + areaAt(row+1, col) + areaAt(row, col-1) + areaAt(row, col+1);
    return result;
  }
}
