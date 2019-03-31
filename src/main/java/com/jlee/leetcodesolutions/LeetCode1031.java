package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode1031 {
  /*
   * https://leetcode.com/problems/number-of-enclaves/
   */
  private boolean canReachBorder;
  private boolean[][] visited;
  private int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
  
  public int numEnclaves(int[][] A) {
    int count = 0;
    visited = new boolean[A.length][A[0].length];
    // Traverse every element of A to look for a land spot
    for(int i = 0; i < A.length; i++) {
      for(int j = 0; j < A[i].length; j++) {
        canReachBorder = false;
        HashSet<String> set = new HashSet<>();
        if(!visited[i][j] && A[i][j] == 1)
          dfs(A, i, j, set);
        
        count += canReachBorder ? 0 : set.size(); 
      }
    }    
    return count;
  }
  
  private void dfs(int[][] A, int i, int j, HashSet<String> set) {
    if(i < 0 || i == A.length || j < 0 || j == A[0].length) {
      // If you reach the border, then all of the connected land will not count
      canReachBorder = true;
      return;
    }
    
    if(A[i][j] == 0 || visited[i][j])
      return;
    
    set.add(i + "_" + j);
    visited[i][j] = true;
    // Check four-directional adjacent nodes
    for(int[] move : moves) {
      int nextI = i + move[0];
      int nextJ = j + move[1];
      dfs(A, nextI, nextJ, set);
    }
  }
}
