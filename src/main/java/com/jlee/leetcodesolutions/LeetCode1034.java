package com.jlee.leetcodesolutions;

public class LeetCode1034 {
  /*
   * https://leetcode.com/problems/coloring-a-border/
   */
  private int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
  
  public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
    
    boolean[][] connected = new boolean[grid.length][grid[0].length];
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    // Identify the connected component
    dfs(grid, r0, c0, grid[r0][c0], connected, visited);
    
    int[][] result = new int[grid.length][grid[0].length];
    for(int r = 0; r < grid.length; r++) {
      for(int c = 0; c < grid[0].length; c++) {
        if(connected[r][c]) {
          // if on the boundary (first or last row / column)
          if(r == 0 || r == grid.length-1 || c == 0 || c == grid[0].length-1) {
            result[r][c] = color;
            continue;
          }
          
          // is it adjacent to a non-connected component
          for(int[] move : moves) {
            int nextR = r+move[0];
            int nextC = c+move[1];
            
            // color if connected component is adjacent to a non-connected component
            if(!connected[nextR][nextC]) {
              result[r][c] = color;
              break;
            }
          }
          
          if(result[r][c] == 0)
            result[r][c] = grid[r][c];
        }
        else
          result[r][c] = grid[r][c];
      }
    }
    return result;
  }
  
  private void dfs(int[][] grid, int r, int c, int match, boolean[][] connected, boolean[][] visited) {
    if(r < 0 || r == grid.length || c < 0 || c == grid[0].length || visited[r][c] || grid[r][c] != match)
      return;
    
    visited[r][c] = true;
    connected[r][c] = true;
    
    // Check adjacent squares
    for(int[] move : moves)
      dfs(grid, r+move[0], c+move[1], match, connected, visited);
  }
}
