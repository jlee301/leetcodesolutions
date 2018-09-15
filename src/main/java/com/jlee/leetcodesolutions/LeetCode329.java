package com.jlee.leetcodesolutions;

public class LeetCode329 {
  /*
   * Given an integer matrix, find the length of the longest increasing path.
   * 
   * From each cell, you can either move to four directions: left, right, up or
   * down. You may NOT move diagonally or move outside of the boundary (i.e.
   * wrap-around is not allowed).
   * 
   * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/
   */
  public int longestIncreasingPath(int[][] matrix) {
    if(matrix == null || matrix.length == 0)
      return 0;
    
    int R = matrix.length;
    int C = matrix[0].length;
    int[][] memo = new int[R][C];
    
    int max = 0;
    // Check every point in the matrix as the starting point
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++) {
        max = Math.max(max, 1 + dfs(matrix, r, c, R, C, memo));
      }
    }
    return max;
  }
  
  private int dfs(int[][] matrix, int r, int c, int R, int C, int[][] memo) {
    if(memo[r][c] != 0)
      return memo[r][c];
    
    // moves[0] = up     moves[2] = left
    // moves[1] = down   moves[3] = right
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    int max = 0;
    // Check adjacent cells to see if possible to move
    for(int[] move : moves) {
      int nextR = r + move[0];
      int nextC = c + move[1];
      
      // If next cell is out of bounds or less than the current cell, then we cannot proceed
      if(nextR < 0 || nextR == R || nextC < 0 || nextC == C || matrix[r][c] >= matrix[nextR][nextC])
        continue;
      
      max = Math.max(max, 1 + dfs(matrix, nextR, nextC, R, C, memo));
    }
    memo[r][c] = max;
    return max;
  }
}
