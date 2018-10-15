package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode924 {
  /*
   * https://leetcode.com/problems/minimize-malware-spread/description/
   */
  public int minMalwareSpread(int[][] graph, int[] initial) {
    // Keep track of two separate arrays:
    // initCounts[i][j] keeps track of each individual spread from initial
    // totalCounts[i] is the sum of the individual spreads together
    int[][] initCounts = new int[initial.length][graph.length];
    int[] totalCounts = new int[graph.length];
    
    // We sort the initial so that the smallest index node is first
    Arrays.sort(initial);
    for(int i = 0; i < initial.length; i++) {
      boolean[] visited = new boolean[graph.length];
      dfs(graph, visited, initCounts, totalCounts, i, initial[i]);
    }
    
    int node = 0;
    int minSpread = Integer.MAX_VALUE;
    for(int i = 0; i < initCounts.length; i++) {
      int[] currCounts = initCounts[i];
      int currSpread = 0;
      // Assuming we are removing initial[i], what is the spread like
      for(int j = 0; j < currCounts.length; j++) {
        // if we subtract from the total the individual and it is > 0, the spread still
        // exist
        if(totalCounts[j] - currCounts[j] > 0)
          currSpread++;
      }
      if(currSpread < minSpread) {
        minSpread = currSpread;
        node = initial[i];
      }
    }
    return node;
  }
  
  private void dfs(int[][] graph, boolean[] visited, int[][] initCounts, int[] totalCounts, int node, int nei) {
    for(int i = 0; i < graph[nei].length; i++) {
      if(graph[nei][i] == 1 && !visited[i]) {
        visited[i] = true;
        initCounts[node][i]++;
        totalCounts[i]++;
        dfs(graph, visited, initCounts, totalCounts, node, i);
      }
    }
  }
}
