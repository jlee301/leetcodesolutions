package com.jlee.leetcodesolutions;

public class LeetCode0741 {
  /*
   * In a N x N grid representing a field of cherries, each cell is one of three
   * possible integers.
   * 1. 0 means the cell is empty, so you can pass through;
   * 2. 1 means the cell contains a cherry, that you can pick up and pass through;
   * 3. -1 means the cell contains a thorn that blocks your way.
   * 
   * Your task is to collect maximum number of cherries possible by following the
   * rules below:
   * 1. Starting at the position (0, 0) and reaching (N-1, N-1) by moving right or
   * down through valid path cells (cells with value 0 or 1);
   * 2. After reaching (N-1, N-1), returning to (0, 0) by moving left or up
   * through valid path cells;
   * 3. When passing through a path cell containing a cherry, you pick it up and
   * the cell becomes an empty cell (0);
   * 4. If there is no valid path between (0, 0) and (N-1, N-1), then no cherries
   * can be collected.
   * 
   * https://leetcode.com/problems/cherry-pickup/description/
   */
  private int N;
  private int[][] grid;
  private int[][][][] memo;
  
  public int cherryPickup(int[][] grid) {
    this.grid = grid;
    N = grid.length;
    memo = new int[N][N][N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        for(int k = 0; k < N; k++) {
          for(int l = 0; l < N; l++)
            memo[i][j][k][l] = Integer.MIN_VALUE;
        }
      }
    }
    return Math.max(0, helper(0, 0, 0, 0));
  }
  
  // Rather than (0,0) --> (N-1,N-1) --> (0,0)
  // We have two people instead, both starting at (0,0) and heading towards (N-1,N-1)
  private int helper(int r1, int c1, int r2, int c2) {
    // This path does not lead to N-1,N-1
    if(r1 == N || c1 == N || r2 == N || c2 == N || grid[r1][c1] == -1 || grid[r2][c2] == -1)
      return -99999;

    if(r1 == N-1 && c1 == N-1)
      return grid[r1][c1];
    
    if(memo[r1][c1][r2][c2] != Integer.MIN_VALUE)
      return memo[r1][c1][r2][c2];

    // Only add grid[r2][c2] if (r1,c1) not same as (r2,c2)
    int ans = grid[r1][c1] + (c1 != c2 ? grid[r2][c2] : 0);
    
    // Add the max of:
    // 1. person1 down, person2 down
    // 2. person1 right, person2 down
    // 3. person1 down, person2 right
    // 4. person1 right, person2 right
    ans += Math.max(helper(r1+1, c1, r2+1, c2), Math.max(helper(r1, c1+1, r2+1, c2), Math.max(helper(r1+1, c1, r2, c2+1), helper(r1, c1+1, r2, c2+1))));
    memo[r1][c1][r2][c2] = ans;
    return ans;
  }
}
