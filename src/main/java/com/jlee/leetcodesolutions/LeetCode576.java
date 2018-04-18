package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode576 {
  /*
   * There is an m by n grid with a ball. Given the start coordinate (i,j) of the
   * ball, you can move the ball to adjacent cell or cross the grid boundary in
   * four directions (up, down, left, right). However, you can at most move N
   * times. Find out the number of paths to move the ball out of grid boundary.
   * The answer may be very large, return it after mod 10^9 + 7.
   * 
   * Note:
   * 1. Once you move the ball out of boundary, you cannot move it back.
   * 2. The length and height of the grid is in range [1,50].
   * 3. N is in range [0,50].
   * 
   * https://leetcode.com/problems/out-of-boundary-paths/description/
   */
  private static final int MOD = 1000000007;
  
  public int findPaths(int m, int n, int N, int i, int j) {
    int[][][] memo = new int[m][n][N+1];
    for(int[][] row : memo)
      for(int[] col : row)
        Arrays.fill(col, -1);
    return findPaths(m, n, N, i, j, memo);
  }
  
  private int findPaths(int m, int n, int N, int i, int j, int[][][] memo) {
    if(i < 0 || i == m || j < 0 || j == n) // Reached out of bounds
      return 1;
    if(N == 0) // No more steps available
      return 0;
    if(memo[i][j][N] != -1)
      return memo[i][j][N];
    
    int temp = 0;
    temp += findPaths(m, n, N-1, i-1, j, memo);
    temp %= MOD;
    temp += findPaths(m, n, N-1, i+1, j, memo);
    temp %= MOD; 
    temp += findPaths(m, n, N-1, i, j-1, memo);
    temp %= MOD;
    temp += findPaths(m, n, N-1, i, j+1, memo);
    temp %= MOD;
    
    memo[i][j][N] = temp;
    return memo[i][j][N];
  }
}
