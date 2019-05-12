package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1042 {
  /*
   * https://leetcode.com/problems/flower-planting-with-no-adjacent/
   */
  public int[] gardenNoAdj(int N, int[][] paths) {
    int[] result = new int[N];
    
    // Create adjacency map for all paths
    HashMap<Integer,HashSet<Integer>> adjMap = new HashMap<>();
    for(int i = 0; i < N; i++)
      adjMap.put(i, new HashSet<>());
    
    for(int[] path : paths) {
      adjMap.get(path[0]-1).add(path[1]-1);
      adjMap.get(path[1]-1).add(path[0]-1);
    }
    
    for(int i = 0; i < N; i++) {
      HashSet<Integer> set = adjMap.get(i);
      HashSet<Integer> used = new HashSet<>();
      
      // Obtain all unavailable plants (ones already set in adjacent beds)
      for(Integer next : set)
        used.add(result[next]);
      
      // Determine which flower type to plant
      for(int j = 1; j <= 4; j++) {
        if(!used.contains(j)) {
          result[i] = j;
          break;
        }
      }
    }
    return result;
  }
}
