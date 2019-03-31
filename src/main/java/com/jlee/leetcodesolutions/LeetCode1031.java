package com.jlee.leetcodesolutions;

public class LeetCode1031 {
  /*
   * https://leetcode.com/problems/number-of-enclaves/
   */
  private boolean canReachBorder;
  private int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
  
  public int numEnclaves(int[][] A) {
    int count = 0;
    // Traverse every element of A to look for a land spot
    for(int i = 0; i < A.length; i++) {
      for(int j = 0; j < A[i].length; j++) {
        canReachBorder = false;
        int currCount = 0;
        if(A[i][j] == 1)
          currCount = dfs(A, i, j);
          
        count += canReachBorder ? 0 : currCount;        
      }
    }    
    return count;
  }
  
  private int dfs(int[][] A, int i, int j) {
    if(i < 0 || i == A.length || j < 0 || j == A[0].length) {
      // If you reach the border, then all of the connected land will not count
      canReachBorder = true;
      return 0;
    }
    
    if(A[i][j] < 1)
      return 0;
    
    // A[i][j] == -1 == visited
    A[i][j] = -1;
    // Check four-directional adjacent nodes
    int count = 1;
    for(int[] move : moves) {
      int nextI = i + move[0];
      int nextJ = j + move[1];
      count += dfs(A, nextI, nextJ);
    }
    return count;
  }
}
