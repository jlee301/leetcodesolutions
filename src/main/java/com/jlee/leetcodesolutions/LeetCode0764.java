package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0764 {
  /*
   * In a 2D grid from (0, 0) to (N-1, N-1), every cell contains a 1, except those
   * cells in the given list mines which are 0. What is the largest axis-aligned
   * plus sign of 1s contained in the grid? Return the order of the plus sign. If
   * there is none, return 0.
   * 
   * An "axis-aligned plus sign of 1s of order k" has some center grid[x][y] = 1
   * along with 4 arms of length k-1 going up, down, left, and right, and made of
   * 1s. This is demonstrated in the diagrams below. Note that there could be 0s
   * or 1s beyond the arms of the plus sign, only the relevant area of the plus
   * sign is checked for 1s.
   * 
   * https://leetcode.com/problems/largest-plus-sign/description/
   */
  public int orderOfLargestPlusSign(int N, int[][] mines) {
    // Create grid
    int[][] grid = new int[N][N];
    for(int[] row : grid)
      Arrays.fill(row, Integer.MAX_VALUE);
    
    // Fill grid with mines
    for(int[] mine : mines)
      grid[mine[0]][mine[1]] = 0;
    
    // Determine the order at grid[i][j]
    for(int i = 0; i < N; i++) {
      // How far left can we extend
      for(int j = 0, left = 0; j < N; j++) {
        left = grid[i][j] == 0 ? 0 : left+1;
        grid[i][j] = Math.min(grid[i][j], left);
      }
      // How far right can we extend
      for(int j = N-1, right = 0; j >= 0; j--) {
        right = grid[i][j] == 0 ? 0 : right+1;
        grid[i][j] = Math.min(grid[i][j], right);
      }
      
      // How far up can we extend
      for(int j = N-1, up = 0; j >= 0; j--) {
        up = grid[j][i] == 0 ? 0 : up+1;
        grid[j][i] = Math.min(grid[j][i], up);        
      }
      
      // How far down can we extend
      for(int j = 0, down = 0; j < N; j++) {
        down = grid[j][i] == 0 ? 0 : down+1;
        grid[j][i] = Math.min(grid[j][i], down);
      }
    }
    
    // Find max order
    int max = 0;
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++)
        max = Math.max(max, grid[i][j]);
    }
    return max;
  }
}
