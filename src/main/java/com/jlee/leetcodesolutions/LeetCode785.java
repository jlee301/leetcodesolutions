package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode785 {
  /*
   * Given an undirected graph, return true if and only if it is bipartite.
   * 
   * Recall that a graph is bipartite if we can split it's set of nodes into two
   * independent subsets A and B such that every edge in the graph has one node in
   * A and another node in B.
   * 
   * The graph is given in the following form: graph[i] is a list of indexes j for
   * which the edge between nodes i and j exists. Each node is an integer between
   * 0 and graph.length - 1. There are no self edges or parallel edges: graph[i]
   * does not contain i, and it doesn't contain any element twice.
   * 
   * Note:
   * 1. graph will have length in range [1, 100].
   * 2. graph[i] will contain integers in range [0, graph.length - 1].
   * 3. graph[i] will not contain i or duplicate values.
   * 4. The graph is undirected: if any element j is in graph[i], then i will be
   * in graph[j].
   * 
   * https://leetcode.com/problems/is-graph-bipartite/description/
   */
  public boolean isBipartite(int[][] graph) {
    int[] set = new int[graph.length];
    // set[i] = 0, has not been given a set
    // set[i] = 1, belongs to set 1
    // set[i] = -1, belongs to set -1
    Queue<Integer> queue = new LinkedList<>();
    for(int i = 0; i < graph.length; i++) {
      // Already visited
      if(set[i] != 0) continue;

      queue.add(i);
      set[i] = 1;

      // BFS
      while(!queue.isEmpty()) {
        int node = queue.poll();
        for(int adj : graph[node]) {
          // Any given node should not belong to the same set as any of its adjacent nodes
          if(set[node] == set[adj])
            return false;
          
          if(set[adj] == 0) {
            queue.add(adj);
            set[adj] = -set[node];
          }
        }
      }
    }
    return true;
  }  
}
