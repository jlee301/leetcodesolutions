package com.jlee.leetcodesolutions;

import java.util.List;

public class LeetCode559 {
  /*
   * Given a n-ary tree, find its maximum depth.
   * 
   * The maximum depth is the number of nodes along the longest path from the root
   * node down to the farthest leaf node.
   * 
   * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
   */
  public int maxDepth(Node root) {
    if(root == null)
      return 0;
    
    int max = 0;
    for(Node child : root.children)
      max = Math.max(max, maxDepth(child));
    
    return 1 + max;
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
