package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0886 {
  /*
   * https://leetcode.com/contest/weekly-contest-97/problems/possible-bipartition/
   */
  public boolean possibleBipartition(int N, int[][] dislikes) {
    // Create adjacency map
    HashMap<Integer,HashSet<Integer>> adjMap = new HashMap<>();
    for(int i = 1; i <= N; i++)
      adjMap.put(i, new HashSet<>());
    
    for(int[] data : dislikes) {
      adjMap.get(data[0]).add(data[1]);
      adjMap.get(data[1]).add(data[0]);
    }
    
    // Assign each N to group 0 or 1
    HashMap<Integer,Integer> group = new HashMap<>();
    for(int i = 1; i <= N; i++) {
      if(!group.containsKey(i) && !dfs(adjMap, group, i, 0))
        return false;
    }
    return true;
  }
  
  private boolean dfs(HashMap<Integer,HashSet<Integer>> adjMap, HashMap<Integer,Integer> group, int pos, int g) {
    if(group.containsKey(pos))
      return group.get(pos) == g;
    group.put(pos, g);
    
    // Assign each neighbor the opposite group
    for(int nei : adjMap.get(pos)) {
      if(!dfs(adjMap, group, nei, g == 0 ? 1 : 0))
        return false;
    }
    return true;
  }
}
