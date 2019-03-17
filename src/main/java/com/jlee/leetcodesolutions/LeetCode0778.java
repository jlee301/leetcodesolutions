package com.jlee.leetcodesolutions;

public class LeetCode0778 {
  /*
   * On an N x N grid, each square grid[i][j] represents the elevation at that
   * point (i,j).
   * 
   * Now rain starts to fall. At time t, the depth of the water everywhere is t.
   * You can swim from a square to another 4-directionally adjacent square if and
   * only if the elevation of both squares individually are at most t. You can
   * swim infinite distance in zero time. Of course, you must stay within the
   * boundaries of the grid during your swim.
   * 
   * You start at the top left square (0, 0). What is the least time until you can
   * reach the bottom right square (N-1, N-1)?
   * 
   * https://leetcode.com/problems/swim-in-rising-water/description/
   */
  public int swimInWater(int[][] grid) {
    int t = 0, N = grid.length;
    while(grid[N-1][N-1] >= 0) {
      helper(grid, t, 0, 0);
      t++;
    }
    return t-1;
  }
  
  private void helper(int[][] grid, int t, int x, int y) {
    // Coordinates are out of bounds of grid
    if(x < 0 || x == grid.length || y < 0 || y == grid.length || grid[x][y] > t)
      return;
    
    // Mark coordinate value as negative t when visited
    if(t == 0 && grid[x][y] == -1)
      return;
    else if(grid[x][y] != -t || grid[x][y] == 0)
      grid[x][y] = -t == 0 ? -1 : -t;
    else
      return;

    // Check adjacent coordinates
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    for(int[] move : moves)
      helper(grid, t, x+move[0], y+move[1]);
  }
}
