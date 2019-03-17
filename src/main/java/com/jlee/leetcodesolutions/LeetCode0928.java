package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0928 {
  /*
   * https://leetcode.com/problems/minimize-malware-spread-ii/
   */
  public int minMalwareSpread(int[][] graph, int[] initial) {
    int min = Integer.MAX_VALUE;
    int node = 0;
    Arrays.sort(initial);
    for(int i = 0; i < initial.length; i++) {
      // traverse thru initial as the node that is completely removed
      boolean[] visited = new boolean[graph.length];
      visited[initial[i]] = true;

      // now sum up the spread for the remaining active initial nodes
      int spread = 0;
      for(int j = 0; j < initial.length; j++) {
        if(visited[initial[j]]) continue;
        visited[initial[j]] = true;
        spread += 1 + dfs(graph, visited, initial[j]);
      }
      // System.out.println("node: " + initial[i] + " spread: " + spread);
      if(spread < min) {
        min = spread;
        node = initial[i];
      }
    }
    return node;
  }
  
  private int dfs(int[][] graph, boolean[] visited, int node) {
    int spread = 0;
    
    for(int j = 0; j < graph[node].length; j++) {
      if(graph[node][j] == 1 && !visited[j]) {
        visited[j] = true;
        spread += 1 + dfs(graph, visited, j);
      }
    }
    return spread;
  }
}
