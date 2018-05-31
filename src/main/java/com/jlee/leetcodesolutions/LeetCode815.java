package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode815 {
  /*
   * We have a list of bus routes. Each routes[i] is a bus route that the i-th bus
   * repeats forever. For example if routes[0] = [1, 5, 7], this means that the
   * first bus (0-th indexed) travels in the sequence 1->5->7->1->5->7->1->...
   * forever.
   * 
   * We start at bus stop S (initially not on a bus), and we want to go to bus
   * stop T. Travelling by buses only, what is the least number of buses we must
   * take to reach our destination? Return -1 if it is not possible.
   * 
   * https://leetcode.com/problems/bus-routes/description/
   */
  public int numBusesToDestination(int[][] routes, int S, int T) {
    if(routes == null || routes.length == 0)
      return -1;
    
    // Edge case if you start and end at same stop
    if(S == T) return 0;
    
    // Map bus stops to bus ids that have it as part of the route
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    for(int i = 0; i < routes.length; i++) {
      for(int route : routes[i]) {
        if(!map.containsKey(route))
          map.put(route, new HashSet<>());
        map.get(route).add(i);
      }
    }
    // {1=[0], 2=[0], 3=[1], 6=[1], 7=[0, 1]}
        
    // BFS
    HashSet<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    // Add all buses that have S as part of their route
    queue.addAll(map.get(S));
    visited.addAll(map.get(S));
    int noOfBuses = 1;
    
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        int currBus = queue.poll();
        
        // Check the route of this bus
        for(int route : routes[currBus]) {
          if(route == T)
            return noOfBuses;
          
          // Can any of these routes jump to a new bus I have not been on earlier?
          for(int nextBus : map.get(route)) {
            if(!visited.contains(nextBus))
              queue.add(nextBus);
              visited.add(nextBus);
          }
        }
      }
      noOfBuses++;
    }
    return -1;
  }
}
