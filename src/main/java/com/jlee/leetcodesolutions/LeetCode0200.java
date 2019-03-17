package com.jlee.leetcodesolutions;

public class LeetCode0200 {
  /*
   * Given a 2d grid map of '1's (land) and '0's (water), count the number of
   * islands. An island is surrounded by water and is formed by connecting
   * adjacent lands horizontally or vertically. You may assume all four edges of
   * the grid are all surrounded by water.
   * 
   * Example 1:     Example 2:
   * 11110          11000 
   * 11010          11000 
   * 11000          00100 
   * 00000          00011
   * 
   * Answer: 1      Answer: 3
   * 
   * https://leetcode.com/problems/number-of-islands/description/
   */
  public int numIslands(char[][] grid) {
    int count = 0;
    if(grid == null || grid.length == 0 || grid[0].length == 0)
      return count;
    boolean[][] seen = new boolean[grid.length][grid[0].length];
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(!seen[i][j] && grid[i][j] == '1') {
          count++;
          numIslandsHelper(grid, seen, i, j);          
        }
      }
    }
    return count;
  }
  
  /*
   * helper function is to mark connected islands as seen to avoid rechecking.
   */
  private void numIslandsHelper(char[][] grid, boolean[][] seen, int i, int j) {
    if(i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1 || seen[i][j] || grid[i][j] == '0')
      return;
    seen[i][j] = true;
    numIslandsHelper(grid, seen, i-1, j); // up
    numIslandsHelper(grid, seen, i+1, j); // down
    numIslandsHelper(grid, seen, i, j-1); // left
    numIslandsHelper(grid, seen, i, j+1); // right  
  }
}
