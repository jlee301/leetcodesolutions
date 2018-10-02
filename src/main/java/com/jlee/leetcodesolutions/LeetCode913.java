package com.jlee.leetcodesolutions;

public class LeetCode913 {
  /*
   * https://leetcode.com/problems/cat-and-mouse/description/
   */
  public int catMouseGame(int[][] graph) {
    Integer[][][] memo = new Integer[50][50][2];
    return dfs(graph, 1, 2, 0, memo);
  }
  
  private int dfs(int[][] graph, int m, int c, int turn, Integer[][][] memo) {
    if(memo[m][c][turn] != null)
      return memo[m][c][turn];
    
    memo[m][c][turn] = 0;
    int result = 0;
    if(turn == 0) {
      // mouse's turn
      for(int i = 0; i < graph[m].length; i++) {
        if(graph[m][i] == 0) {
          // One of the next moves leads right into node 0
          memo[m][c][turn] = 1;
          return 1;
        }
      }
      
      result = 2;
      // Check all next possible routes for the mouse if it leads to a victory or draw
      for(int i = 0; i < graph[m].length; i++) {
        // Avoid walking directly to where the cat is
        if(graph[m][i] == c)
          continue;
        
        // The priority for the mouse is an outcome that is 1 -> 0 -> 2
        int nextResult = dfs(graph, graph[m][i], c, 1, memo);
        if(nextResult == 1) {
          result = 1;
          break;
        }
        
        if(nextResult == 0)
          result = 0;        
      }
    }
    else {
      // cat's turn
      for(int i = 0; i < graph[c].length; i++) {
        if(graph[c][i] == m) {
          // One of the next moves leads right onto the mouse's position
          memo[m][c][turn] = 2;
          return 2;
        }
      }
      
      result = 1;
      // Check all next possible routes for the cat if it leads to a victory or draw
      for(int i = 0; i < graph[c].length; i++) {
        // The cat cannot go to node 0
        if(graph[c][i] == 0)
          continue;
        
        // The priority for the cat is an outcome that is 2 -> 0 -> 1
        int nextResult = dfs(graph, m, graph[c][i], 0, memo);
        if(nextResult == 2) {
          result = 2;
          break;
        } 
        
        if(nextResult == 0)
          result = 0;        
      }
    }
    memo[m][c][turn] = result;
    return result;
  }
}
