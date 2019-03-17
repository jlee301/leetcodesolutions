package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0847 {
  /*
   * An undirected, connected graph of N nodes (labeled 0, 1, 2, ..., N-1) is
   * given as graph.
   * 
   * graph.length = N, and j != i is in the list graph[i] exactly once, if and
   * only if nodes i and j are connected.
   * 
   * Return the length of the shortest path that visits every node. You may start
   * and stop at any node, you may revisit nodes multiple times, and you may reuse
   * edges.
   * 
   * Note:
   * 1. 1 <= graph.length <= 12
   * 2. 0 <= graph[i].length < graph.length
   * 
   * https://leetcode.com/problems/shortest-path-visiting-all-nodes/description/
   */
  public int shortestPathLength(int[][] graph) {
    Queue<int[]> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    
    // path = length of path
    // target = bit mask of visiting all nodes, ie if there are 4 nodes, 1111 -> 15
    int path = 0, target = 0;

    // Using BFS, we create an entry to start at every node
    for(int i = 0; i < graph.length; i++) {
      int mask = 1 << (i+1);
      target = target | (1 << (i+1));
      // Storing current mask, next node to evaluate
      queue.add(new int[] {mask, i});
      visited.add(mask + ":" + i);
    }
    
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        int[] curr = queue.poll();
        if(curr[0] == target) return path;
        
        // Check all connected nodes
        for(int j = 0; j < graph[curr[1]].length; j++) {
          int nextNode = graph[curr[1]][j];
          int nextMask = curr[0] | (1 << (nextNode+1));
          if(!visited.contains(nextMask + ":" + nextNode)) {
            queue.add(new int[] {nextMask, nextNode});
            visited.add(nextMask + ":" + nextNode);
          }
        }
      }
      path++;
    }
    return -1;
  }
}
