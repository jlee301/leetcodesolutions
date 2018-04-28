package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode684 {
  /*
   * In this problem, a tree is an undirected graph that is connected and has no
   * cycles.
   * 
   * The given input is a graph that started as a tree with N nodes (with distinct
   * values 1, 2, ..., N), with one additional edge added. The added edge has two
   * different vertices chosen from 1 to N, and was not an edge that already
   * existed.
   * 
   * The resulting graph is given as a 2D-array of edges. Each element of edges is
   * a pair [u, v] with u < v, that represents an undirected edge connecting nodes
   * u and v.
   * 
   * Return an edge that can be removed so that the resulting graph is a tree of N
   * nodes. If there are multiple answers, return the answer that occurs last in
   * the given 2D-array. The answer edge [u, v] should be in the same format, with
   * u < v.
   * 
   * Note:
   * 1. The size of the input 2D-array will be between 3 and 1000.
   * 2.Every integer represented in the 2D-array will be between 1 and N, where N
   * is the size of the input array.
   * 
   * https://leetcode.com/problems/redundant-connection/description/
   */
  public int[] findRedundantConnection(int[][] edges) {
    if(edges == null)
      return null;
    
    // Create adjacency map from all edges
    HashMap<Integer,List<Integer>> adjMap = new HashMap<>();
    for(int[] edge : edges) {
      if(!adjMap.containsKey(edge[0]))
        adjMap.put(edge[0], new ArrayList<Integer>());
      adjMap.get(edge[0]).add(edge[1]);
      if(!adjMap.containsKey(edge[1]))
        adjMap.put(edge[1], new ArrayList<Integer>());
      adjMap.get(edge[1]).add(edge[0]);        
    }
    
    // Remove all leafs recursively
    removeLeafs(adjMap);
    
    // What will remain are the redundant connections, so now remove the last
    // occurring one from the 2D-array
    for(int i = edges.length-1; i >= 0; i--) {
      if(adjMap.containsKey(edges[i][0]) && adjMap.containsKey(edges[i][1]))
        return edges[i];
    }
    // This scenario only happens if there is no redundant edges.
    return new int[] {};
  }
  
  public void removeLeafs(HashMap<Integer,List<Integer>> adjMap) {
    // Create a node to list of leafs to remove from the node
    HashMap<Integer,List<Integer>> removed = new HashMap<>();
    for(int key : adjMap.keySet()) {
      List<Integer> list = adjMap.get(key);
      if(list.size() == 1) {
        int leaf = list.get(0);
        if(!removed.containsKey(leaf))
          removed.put(leaf, new ArrayList<>());
        removed.get(leaf).add(key);
      }
    }
    if(!removed.isEmpty()) {
      for(int key : removed.keySet()) {
        List<Integer> values = removed.get(key);
        for(int value : values) {
          // Remove leafs and its references
          if(adjMap.containsKey(key))
            adjMap.get(key).remove((Integer) value);          
          adjMap.remove(value);
        }
      }
      removeLeafs(adjMap);
    }
  }
}
