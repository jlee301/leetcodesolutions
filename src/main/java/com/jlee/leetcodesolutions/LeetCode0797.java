package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0797 {
  /*
   * 
   * Given a directed, acyclic graph of N nodes. Find all possible paths from node
   * 0 to node N-1, and return them in any order.
   * 
   * The graph is given as follows: the nodes are 0, 1, ..., graph.length - 1.
   * graph[i] is a list of all nodes j for which the edge (i, j) exists.
   * 
   * Example:
   * Input: [[1,2], [3], [3], []]
   * Output: [[0,1,3],[0,2,3]]
   * Explanation: The graph looks like this:
   * 0--->1
   * |    |
   * v    v
   * 2--->3
   * 
   * There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
   * 
   * Note:
   * 1. The number of nodes in the graph will be in the range [2, 15].
   * 2. You can print different paths in any order, but you should keep the order
   * of nodes inside one path.
   * 
   * https://leetcode.com/problems/all-paths-from-source-to-target/description/
   */
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(graph, result, new ArrayList<>(), 0);
    return result;
  }
  
  private void dfs(int[][] graph, List<List<Integer>> result, List<Integer> temp, int node) {
    temp.add(node);
    // System.out.println(temp);
    if(node == graph.length-1)
      result.add(new ArrayList<>(temp));
    
    for(int next : graph[node])
      dfs(graph, result, temp, next);
    
    temp.remove(temp.size()-1);
  }
}
