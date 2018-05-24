package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode834 {
  /*
   * An undirected, connected tree with N nodes labelled 0...N-1 and N-1 edges are
   * given.
   * 
   * The ith edge connects nodes edges[i][0] and edges[i][1] together.
   * 
   * Return a list ans, where ans[i] is the sum of the distances between node i
   * and all other nodes.
   * 
   * https://leetcode.com/problems/sum-of-distances-in-tree/description/
   */
  public int[] sumOfDistancesInTree(int N, int[][] edges) {
    // Create adjacency graph
    List<HashSet<Integer>> adj = new ArrayList<>();
    for(int i = 0; i < N; i++)
      adj.add(new HashSet<>());
    
    for(int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }
    
    // Determine distance of each node to all other nodes
    // count[i] = Number of nodes in the subtree if i was root
    // ans[i] = Sum of distances between node i and all other nodes
    int[] count = new int[N];
    int[] ans = new int[N];
    dfs(adj, ans, 0, count, new boolean[N]);
    // Need to calculate the rest of ans from ans[0]
    dfsDist(adj, ans, 0, count, new boolean[N], N);
    return ans;
  }
  
  private void dfs(List<HashSet<Integer>> adj, int[] ans, int node, int[] count, boolean[] visited) {
    visited[node] = true;
    count[node]++;
    for(int next : adj.get(node)) {
      if(visited[next]) continue;
      dfs(adj, ans, next, count, visited);
      count[node] += count[next];
      // This will accurately calculate the sum of distances between node 0 and all other nodes
      // ie ans[0] is correct, but the rest are not.
      ans[node] += ans[next] + count[next];
    }
  }
  
  private void dfsDist(List<HashSet<Integer>> adj, int[] ans, int node, int[] count, boolean[] visited, int N) {
    visited[node] = true;
    for(int next : adj.get(node)) {
      if(visited[next]) continue;
      // When moving root from node to adjacent neighbor (next)
      // 1. count[next] moves 1 closer to root
      // 2. N - count[next] moves 1 further to root
      ans[next] = ans[node] - count[next] + N - count[next];
      dfsDist(adj, ans, next, count, visited, N);
    }
  }
}
