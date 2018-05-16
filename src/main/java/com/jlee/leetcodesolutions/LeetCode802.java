package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode802 {
  /*
   * In a directed graph, we start at some node and every turn, walk along a
   * directed edge of the graph. If we reach a node that is terminal (that is, it
   * has no outgoing directed edges), we stop.
   * 
   * Now, say our starting node is eventually safe if and only if we must
   * eventually walk to a terminal node. More specifically, there exists a natural
   * number K so that for any choice of where to walk, we must have stopped at a
   * terminal node in less than K steps.
   * 
   * Which nodes are eventually safe? Return them as an array in sorted order.
   * 
   * The directed graph has N nodes with labels 0, 1, ..., N-1, where N is the
   * length of graph. The graph is given in the following form: graph[i] is a list
   * of labels j such that (i, j) is a directed edge of the graph.
   * 
   * Example:
   * Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
   * Output: [2,4,5,6]
   * 
   * Note:
   * 1. graph will have length at most 10000.
   * 2. The number of edges in the graph will not exceed 32000.
   * 3. Each graph[i] will be a sorted list of different integers, chosen within
   * the range [0, graph.length - 1].
   */
  public List<Integer> eventualSafeNodes(int[][] graph) {
    // safe[i] == 0 node has not been visited yet
    // safe[i] == 1 node has been visited but leads to cycle
    // safe[i] == 2 node is safe, can reach terminal
    int[] safe = new int[graph.length];
    
    // Go through each node as a possible starting position
    List<Integer> result = new ArrayList<>();    
    for(int i = 0; i < graph.length; i++) {
      if(dfs(graph, safe, i))
        result.add(i);
    }

    return result;
  }
  
  private boolean dfs(int[][] graph, int[] safe, int pos) {
    if(safe[pos] > 0)
      return safe[pos] == 2;
    
    // mark node as visited, if does not change to 2, a cycle was detected
    safe[pos] = 1;
    
    // now visit adjacent nodes
    for(int next : graph[pos]) {
      // node is already marked safe, check next
      if(safe[next] == 2) continue;
      
      // Cycle detected
      if(safe[next] == 1 || !dfs(graph, safe, next))
        return false;
    }

    // None of the adjacent nodes leads into a cycle, mark safe
    safe[pos] = 2;
    return true;
  }
}
