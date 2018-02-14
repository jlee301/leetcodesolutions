package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode103 {
  /*
   * Given a binary tree, return the zigzag level order traversal of its nodes'
   * values. (ie, from left to right, then right to left for the next level and
   * alternate between).
   * 
   * For example: Given binary tree [3,9,20,null,null,15,7], 
   *    3 
   *   / \ 
   *  9  20 
   *    /  \ 
   *   15   7
   *   
   * return its zigzag level order traversal as: [ [3], [20,9], [15,7] ]
   * 
   * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
   */
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    zigzagLevelOrder(root, res, 0);
    return res;
  }
  
  private void zigzagLevelOrder(TreeNode node, List<List<Integer>> res, int level) {
    if(node == null)
      return;
    
    if(level >= res.size())
      res.add(new ArrayList<>());
    
    // Left to right
    if(level % 2 == 0)
      res.get(level).add(node.val);

    // Right to left
    else
      res.get(level).add(0, node.val);
    
    zigzagLevelOrder(node.left, res, level+1);
    zigzagLevelOrder(node.right, res, level+1);
  }
}
