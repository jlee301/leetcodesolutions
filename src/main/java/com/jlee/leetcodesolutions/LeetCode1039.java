package com.jlee.leetcodesolutions;

public class LeetCode1039 {
  /*
   * https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
   */
  public int minScoreTriangulation(int[] A) {
    return dfs(A, 0, A.length-1, new Integer[A.length][A.length]);
  }
  
  private int dfs(int[] A, int i, int j, Integer[][] memo) {
    // Base case, you cannot create a triangle without three points
    if(i + 2 > j)
      return 0;
    
    if(memo[i][j] != null)
      return memo[i][j];
    
    int min = Integer.MAX_VALUE;
    for(int k = i + 1; k < j; k++) {
      int score = A[i] * A[j] * A[k];
      int leftPoly = dfs(A, i, k, memo);
      int rightPoly = dfs(A, k, j, memo);
      min = Math.min(min, score + leftPoly + rightPoly);
    }    
    memo[i][j] = min;
    return min;
  }
}
