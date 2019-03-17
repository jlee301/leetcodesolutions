package com.jlee.leetcodesolutions;

public class LeetCode0685 {
  /*
   * In this problem, a rooted tree is a directed graph such that, there is
   * exactly one node (the root) for which all other nodes are descendants of this
   * node, plus every node has exactly one parent, except for the root node which
   * has no parents.
   * 
   * The given input is a directed graph that started as a rooted tree with N
   * nodes (with distinct values 1, 2, ..., N), with one additional directed edge
   * added. The added edge has two different vertices chosen from 1 to N, and was
   * not an edge that already existed.
   * 
   * The resulting graph is given as a 2D-array of edges. Each element of edges is
   * a pair [u, v] that represents a directed edge connecting nodes u and v, where
   * u is a parent of child v.
   * 
   * Return an edge that can be removed so that the resulting graph is a rooted
   * tree of N nodes. If there are multiple answers, return the answer that occurs
   * last in the given 2D-array.
   * 
   * https://leetcode.com/problems/redundant-connection-ii/description/
   */
  public int[] findRedundantDirectedConnection(int[][] edges) {
    // Check to see if there is a node with two parents
    int N = edges.length;
    int[] candA = {-1,-1};
    int[] candB = {-1,-1};
    int[] parentMap = new int[N+1];
    for(int[] edge : edges) {
      if(parentMap[edge[1]] == 0)
        parentMap[edge[1]] = edge[0];
      else {
        // Two parents detected
        candA = new int[] { parentMap[edge[1]], edge[1] };
        candB = new int[] { edge[0], edge[1] };
        edge[1] = 0;
      }
    }
    
    // Union find with path compression
    for(int i = 0; i <= N; i++)
      parentMap[i] = i;
    
    for(int i = 0; i < N; i++) {
      int parent = edges[i][0];
      int child = edges[i][1];
      if(child == 0)
        continue;
      
      // Cycle found
      if(find(parentMap, parent) == child) {
        if(candA[0] == -1)
          return edges[i];
        else
          return candA;
      }
      parentMap[child] = parent;
    }
    return candB;
  }
  
  private int find(int[] parentMap, int i) {
    while(i != parentMap[i]) {
      parentMap[i] = parentMap[parentMap[i]];
      i = parentMap[i];
    }
    return i;
  }
}
