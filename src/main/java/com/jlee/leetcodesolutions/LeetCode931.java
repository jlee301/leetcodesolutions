package com.jlee.leetcodesolutions;

public class LeetCode931 {
  /*
   * Given a square array of integers A, we want the minimum sum of a falling path
   * through A.
   * 
   * A falling path starts at any element in the first row, and chooses one
   * element from each row. The next row's choice must be in a column that is
   * different from the previous row's column by at most one.
   * 
   * https://leetcode.com/contest/weekly-contest-108/problems/minimum-falling-path-sum/
   */
  public int minFallingPathSum(int[][] A) {
    Integer[][] memo = new Integer[A.length][A[0].length];
    return dfs(A, 0, 0, memo);
  }
  
  private int dfs(int[][] A, int r, int c, Integer[][] memo) {
    // Base case
    if(r == A.length)
      return 0;

    if(memo[r][c] != null)
      return memo[r][c];
    
    int min = Integer.MAX_VALUE;
    for(int C = 0; C < A[r].length; C++) {
      // Must choose next column with a diff <= 1
      if(r == 0 || Math.abs(c - C) <= 1) {
        min = Math.min(min, A[r][C] + dfs(A, r+1, C, memo));
      }
    }
    memo[r][c] = min;
    return min;
  }
}
