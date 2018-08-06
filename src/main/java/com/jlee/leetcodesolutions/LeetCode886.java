package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCode886 {
  /*
   * https://leetcode.com/problems/reachable-nodes-in-subdivided-graph/description/
   */
  public int reachableNodes(int[][] edges, int M, int N) {
    // Create adjacency map of the edges
    HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    for(int i = 0; i < N; i++)
      map.put(i, new HashMap<>());
    for(int[] edge : edges) {
      map.get(edge[0]).put(edge[1], edge[2]);
      map.get(edge[1]).put(edge[0], edge[2]);
    }
    
    // seen is storing node and remaining moves
    HashMap<Integer,Integer> seen = new HashMap<>();
    PriorityQueue<int[]> queue = new PriorityQueue<>(new MoveComparator());
    queue.add(new int[] {M,0});
    while(!queue.isEmpty()) {
      int moves = queue.peek()[0];
      int curr = queue.peek()[1];
      queue.poll();
      
      if(!seen.containsKey(curr)) {
        seen.put(curr, moves);
        // Check if I can advance to neighboring nodes
        for(int nei : map.get(curr).keySet()) {
          int movesRemaining = moves - map.get(curr).get(nei) - 1;
          if(!seen.containsKey(nei) && movesRemaining >= 0)
            queue.add(new int[] {movesRemaining,nei});
        }
      }
    }
    
    // Now since we only have results of the original nodes we can visit
    // We must calculate how many in-between new nodes we can visit
    int result = seen.size();
    for(int[] edge : edges)
      result += Math.min(seen.getOrDefault(edge[0], 0) + seen.getOrDefault(edge[1], 0), edge[2]);
    
    return result;
  }
  
  // By making the PriorityQueue always put the highest number of moves on top, it
  // guarantees we always deal with nodes we have not seen first
  private class MoveComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      return b[0] - a[0];
    }
  }
}
