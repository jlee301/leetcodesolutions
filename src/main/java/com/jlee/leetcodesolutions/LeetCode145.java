package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
  /*
   * Given a binary tree, return the postorder traversal of its nodes' values.
   * 
   * https://leetcode.com/problems/binary-tree-postorder-traversal/
   */
  public List<Integer> postorderTraversal(TreeNode root) {
    // Postorder: left, right, root
    List<Integer> result = new ArrayList<>();
    if(root == null)
      return result;
    
    helper(root, result);
    return result;
  }
  
  private void helper(TreeNode node, List<Integer> result) {
    if(node.left != null)
      helper(node.left, result);
    
    if(node.right != null)
      helper(node.right, result);
    
    result.add(node.val);
  }
}
