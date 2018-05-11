package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode787 {
  /*
   * There are n cities connected by m flights. Each fight starts from city u and
   * arrives at v with a price w.
   * 
   * Now given all the cities and fights, together with starting city src and the
   * destination dst, your task is to find the cheapest price from src to dst with
   * up to k stops. If there is no such route, output -1.
   * 
   * Note:
   * 1. The number of nodes n will be in range [1, 100], with nodes labeled from 0
   * to n - 1.
   * 2. The size of flights will be in range [0, n * (n - 1) / 2].
   * 3. The format of each flight will be (src, dst, price).
   * 4. The price of each flight will be in the range [1, 10000].
   * 5. k is in the range of [0, n - 1].
   * 6. There will not be any duplicated flights or self cycles.
   * 
   * https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
   */
  private int min;
  
  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
    // Create map of src : List of src indexes
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    for(int i = 0; i < flights.length; i++) {
      if(!map.containsKey(flights[i][0]))
        map.put(flights[i][0], new ArrayList<>());
      map.get(flights[i][0]).add(i);
    }

    min = Integer.MAX_VALUE;
    dfs(map, flights, new boolean[n], src, dst, K, 0);
    return min == Integer.MAX_VALUE ? -1 : min;
  }
  
  private void dfs(HashMap<Integer,List<Integer>> map, int[][] flights, boolean[] visited, int src, int dst, int K, int price) {
    // Exceeded K stop restrictions or I already have a smaller price
    if(K < -1 || min < price) return;

    if(src == dst) {
      min = Math.min(min, price);
      return;
    }
    
    // src does not exist
    if(!map.containsKey(src)) return;
    
    for(int key : map.get(src)) {
      if(visited[src]) continue;
      visited[src] = true;
      dfs(map, flights, visited, flights[key][1], dst, K-1, price+flights[key][2]);
      visited[src] = false;
    }
  }
}
