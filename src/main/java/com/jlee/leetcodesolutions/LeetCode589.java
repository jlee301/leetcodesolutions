package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode589 {
  /*
   * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
   */
  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    traverse(root, result);
    return result;
  }
  
  private void traverse(Node node, List<Integer> result) {
    if(node == null)
      return;
    
    // root, left, right
    result.add(node.val);
    for(Node child : node.children)
      traverse(child, result);
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
