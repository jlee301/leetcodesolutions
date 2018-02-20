package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode133 {
  /*
   * Clone an undirected graph. Each node in the graph contains a label and a list
   * of its neighbors.
   * 
   * OJ's undirected graph serialization: 
   * Nodes are labeled uniquely.
   * 
   * https://leetcode.com/problems/clone-graph/description/
   */
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    HashMap<Integer,UndirectedGraphNode> map = new HashMap<>();
    return cloneGraph(node, map);
  }
  
  private UndirectedGraphNode cloneGraph(UndirectedGraphNode node, HashMap<Integer,UndirectedGraphNode> map) {
    if(node == null)
      return null;
    
    if(map.containsKey(node.label))
      return map.get(node.label);
    
    UndirectedGraphNode newGraph = new UndirectedGraphNode(node.label);
    map.put(node.label, newGraph);
    for(UndirectedGraphNode neighbor : node.neighbors)
      newGraph.neighbors.add(cloneGraph(neighbor, map));
    
    return newGraph;
  }
}
