package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0102 {
  /*
   * Given a binary tree, return the level order traversal of its nodes' values.
   * (ie, from left to right, level by level).
   * 
   * For example: Given binary tree [3,9,20,null,null,15,7], 
   *    3 
   *   / \ 
   *  9  20 
   *    /  \ 
   *   15   7
   *   
   * return its level order traversal as: [ [3], [9,20], [15,7] ]
   * 
   * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    levelOrder(root, res, 0);
    return res;
  }
  
  private void levelOrder(TreeNode node, List<List<Integer>> res, int level) {
    if(node == null)
      return;
    
    if(level >= res.size())
      res.add(new ArrayList<>());
    
    res.get(level).add(node.val);    
    levelOrder(node.left, res, level+1);
    levelOrder(node.right, res, level+1);
  }
}
