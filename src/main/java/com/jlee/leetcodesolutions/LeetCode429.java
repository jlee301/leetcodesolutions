package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode429 {
  /*
   * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
   */
  public List<List<Integer>> levelOrder(Node root) {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    levelOrder(root, map, 0);

    // Convert map into List
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i < map.size(); i++)
      result.add(map.get(i));
    return result;
  }
  
  private void levelOrder(Node root, HashMap<Integer,List<Integer>> map, int level) {
    if(root == null)
      return;
    
    map.computeIfAbsent(level, k -> new ArrayList<>()).add(root.val);
    for(Node child : root.children)
      levelOrder(child, map, level + 1);
  }
  
  public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
  }
}
