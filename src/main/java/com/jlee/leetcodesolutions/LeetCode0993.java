package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0993 {
  /*
   * https://leetcode.com/contest/weekly-contest-124/problems/cousins-in-binary-tree/
   */
  public boolean isCousins(TreeNode root, int x, int y) {
    HashMap<Integer,Integer> parent = new HashMap<>();
    HashMap<Integer,Integer> depth = new HashMap<>();
    populate(root, -1, parent, depth, 0);
    
    return depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y) ? true : false;      
  }
  
  private void populate(TreeNode node, int prev, HashMap<Integer,Integer> parent, HashMap<Integer,Integer> depth, int level) {
    if(node == null)
      return;
    
    parent.put(node.val, prev);    
    depth.put(node.val, level);
    
    populate(node.left, node.val, parent, depth, level+1);
    populate(node.right, node.val, parent, depth, level+1);
  }
}
