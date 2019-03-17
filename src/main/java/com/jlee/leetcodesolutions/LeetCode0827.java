package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0827 {
  /*
   * In a 2D grid of 0s and 1s, we change at most one 0 to a 1.
   * 
   * After, what is the size of the largest island? (An island is a
   * 4-directionally connected group of 1s).
   * 
   * Notes:
   * 1. 1 <= grid.length = grid[0].length <= 50.
   * 2. 0 <= grid[i][j] <= 1.
   * 
   * https://leetcode.com/problems/making-a-large-island/description/
   */
  public int largestIsland(int[][] grid) {
    // Determine the area of each current island
    // Mark on the original grid a unique id for the island
    // Associate that id to the area of that island in area[id]
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int maxArea = 0;
    int[] area = new int[50*50+1];
    int id = 1;
    for(int r = 0; r < grid.length; r++) {
      for(int c = 0; c < grid[r].length; c++) {
        if(visited[r][c]) continue;
        if(grid[r][c] != 0) {
          dfs(grid, visited, r, c, area, id);
          maxArea = Math.max(maxArea, area[id]);
          id++;
        }
      }
    }
    
    // Determine the largest area if we change 0 --> 1
    for(int r = 0; r < grid.length; r++) {
      for(int c = 0; c < grid[r].length; c++) {
        if(grid[r][c] == 0) {
          // Check all four sides' ids
          HashSet<Integer> set = new HashSet<>();
          int[][] moves = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
          for(int[] move : moves) {
            int rownew = r+move[0];
            int colnew = c+move[1];
            if(rownew < 0 || rownew == grid.length || colnew < 0 || colnew == grid[0].length || grid[rownew][colnew] == 0) 
              continue;
            // Store id's of islands surrounding this 0 --> 1 terrain
            set.add(grid[rownew][colnew]);
          }
          
          // Add areas of any new connecting islands
          int areanew = 1;
          for(int next : set)
            areanew += area[next];
          
          // Is the new connecting islands bigger?
          maxArea = Math.max(maxArea, areanew);
        }
      }
    }
    return maxArea;
  }
  
  private void dfs(int[][] grid, boolean[][] visited, int r, int c, int[] area, int id) {
    if(r < 0 || r == grid.length || c < 0 || c == grid[0].length || visited[r][c] || grid[r][c] == 0)
      return;
    
    visited[r][c] = true;
    grid[r][c] = id;
    area[id]++;
    
    // Up, down, left, right
    int[][] moves = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    for(int[] move : moves)
      dfs(grid, visited, r+move[0], c+move[1], area, id);    
  }
}
