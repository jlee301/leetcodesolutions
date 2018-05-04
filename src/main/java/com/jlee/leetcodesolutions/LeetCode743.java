package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode743 {
  /*
   * There are N network nodes, labelled 1 to N.
   * 
   * Given times, a list of travel times as directed edges times[i] = (u, v, w),
   * where u is the source node, v is the target node, and w is the time it takes
   * for a signal to travel from source to target.
   * 
   * Now, we send a signal from a certain node K. How long will it take for all
   * nodes to receive the signal? If it is impossible, return -1.
   * 
   * Note:
   * 1. N will be in the range [1, 100].
   * 2. K will be in the range [1, N].
   * 3. The length of times will be in the range [1, 6000].
   * 4. All edges times[i] = (u, v, w) will have 1 <= u, v <= N and 1 <= w <= 100.
   * 
   * https://leetcode.com/problems/network-delay-time/description/
   */
  public int networkDelayTime(int[][] times, int N, int K) {
    // Build a easier accessible graph
    HashMap<Integer, List<int[]>> map = new HashMap<>();
    for(int[] edge : times) {
      if(!map.containsKey(edge[0]))
        map.put(edge[0], new ArrayList<>());
      map.get(edge[0]).add(new int[] {edge[1],edge[2]});
    }
    
    // Track the time it takes to reach each node
    int[] track = new int[N+1];
    for(int i = 1; i < track.length; i++)
      track[i] = Integer.MAX_VALUE;
    
    // From starting point K, see how many nodes it connects to
    dfs(map, K, 0, track);
    
    int max = 0;
    for(int time : track) {
      // A node was not reached
      if(time == Integer.MAX_VALUE) return -1;
      max = Math.max(max, time);
    }
    return max;
  }
  
  private void dfs(HashMap<Integer,List<int[]>> map, int node, int time, int[] track) {
    // The data already arrived at node. This would occur if the data arrives again
    // at a later time to the same node.
    if(time >= track[node]) return;
    
    // Store the time it took to reach node
    track[node] = time;
    
    // Through recursion store the time it takes to reach connected nodes
    if(map.containsKey(node)) {
      for(int[] next : map.get(node))
        dfs(map, next[0], time+next[1], track);
    }
  }
}
