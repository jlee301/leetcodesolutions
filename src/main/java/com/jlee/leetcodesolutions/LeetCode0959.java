package com.jlee.leetcodesolutions;

public class LeetCode0959 {
  /*
   * https://leetcode.com/problems/regions-cut-by-slashes/
   */
  private int[][] forward = {{0,0,1},{0,1,0},{1,0,0}};
  private int[][] backward = {{1,0,0},{0,1,0},{0,0,1}};
  private int[][] moves = {{-1,0},{1,0},{0,-1},{0,1}};
  
  public int regionsBySlashes(String[] grid) {
    // Convert grid into a usable 0,1 valued 3N*3N grid
    int[][] newGrid = new int[3*grid.length][3*grid[0].length()];
    for(int r = 0; r < grid.length; r++) {
      for(int c = 0; c < grid[r].length(); c++) {
        char ch = grid[r].charAt(c);
        if(ch == '/')
          buildGrid(newGrid, forward, r*3, c*3);
        
        else if(ch == '\\')
          buildGrid(newGrid, backward, r*3, c*3);
      }
    }
    
    // Count how many islands of just 0's
    boolean[][] visited = new boolean[newGrid.length][newGrid[0].length];
    int count = 0;
    for(int r = 0; r < newGrid.length; r++) {
      for(int c = 0; c < newGrid[r].length; c++) {
        if(visited[r][c])
          continue;
        
        if(newGrid[r][c] == 0) {
          visited[r][c] = true;
          count++;          
          // mark all connected 0's as visited
          dfs(newGrid, visited, r, c);
        }
      }
    }
    return count;
  }
  
  private void dfs(int[][] newGrid, boolean[][] visited, int r, int c) {
    // check adjacent neighbors: up, down, left, right
    for(int[] move : moves) {
      int nextR = r+move[0];
      int nextC = c+move[1];
      
      if(nextR < 0 || nextR == newGrid.length || nextC < 0 || nextC == newGrid[0].length || newGrid[nextR][nextC] == 1)
        continue;

      if(!visited[nextR][nextC]) {
        visited[nextR][nextC] = true;
        dfs(newGrid, visited, nextR, nextC);
      }
    }
  }
  
  private void buildGrid(int[][] newGrid, int[][] slash, int i, int j) {
    for(int r = 0; r < slash.length; r++) {
      for(int c = 0; c < slash[r].length; c++)
        newGrid[i+r][j+c] = slash[r][c];
    }
  }
}
