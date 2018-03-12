package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode310 {
  /*
   * For a undirected graph with tree characteristics, we can choose any node as
   * the root. The result graph is then a rooted tree. Among all possible rooted
   * trees, those with minimum height are called minimum height trees (MHTs).
   * Given such a graph, write a function to find all the MHTs and return a list
   * of their root labels.
   * 
   * Format The graph contains n nodes which are labeled from 0 to n - 1. You will
   * be given the number n and a list of undirected edges (each edge is a pair of
   * labels).
   * 
   * You can assume that no duplicate edges will appear in edges. Since all edges
   * are undirected, [0, 1] is the same as [1, 0] and thus will not appear
   * together in edges.
   * 
   * Example 1:
   * Given n = 4, edges = [[1, 0], [1, 2], [1, 3]]
   *    0 
   *    | 
   *    1 
   *   / \ 
   *  2   3 
   * return [1]
   * 
   * Example 2:
   * Given n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]
   *  0  1  2 
   *   \ | / 
   *     3 
   *     | 
   *     4 
   *     | 
   *     5 
   * return [3, 4]
   * 
   * Note:
   * 1. According to the definition of tree on Wikipedia: “a tree is an
   * undirected graph in which any two vertices are connected by exactly one path.
   * In other words, any connected graph without simple cycles is a tree.”
   * 2. The height of a rooted tree is the number of edges on the longest
   * downward path between the root and a leaf.
   * 
   * https://leetcode.com/problems/minimum-height-trees/description/
   */
  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    List<Integer> leafs = new ArrayList<>();
    if(edges == null || n < 1)
      return leafs;
    
    if(n == 1) {
      leafs.add(0);
      return leafs;
    }
    
    // Convert edges into an adjacency list
    List<Set<Integer>> adjList = new ArrayList<>();
    for(int i = 0; i < n; i++)
      adjList.add(new HashSet<>());
    for(int[] edge : edges) {
      adjList.get(edge[0]).add(edge[1]);
      adjList.get(edge[1]).add(edge[0]);
    }
    
    // Find all leafs
    for(int i = 0; i < n; i++) {
      if(adjList.get(i).size() == 1)
        leafs.add(i);
    }
    
    // Remove all leafs until at least 2 nodes remain
    while(n > 2) {
      n = n - leafs.size();
      List<Integer> temp = new ArrayList<>();
      for(int leaf : leafs) {
        // Obtain node connected to the leaf to remove the leaf from its set
        int node = adjList.get(leaf).iterator().next();
        adjList.get(node).remove(leaf);
        if(adjList.get(node).size() == 1)
          temp.add(node);
      }
      leafs = temp;
    }
    return leafs;
  }
}
