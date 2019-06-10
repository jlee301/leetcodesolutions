package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode1080 {
  /*
   * https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/
   */
  public TreeNode sufficientSubset(TreeNode root, int limit) {
    return helper(root, limit, root.val);
  }
  
  private TreeNode helper(TreeNode node, int limit, int sum) {
    // If at leaf, check the limit
    if(node.left == null && node.right == null)
      return sum < limit ? null : node;
    
    if(node.left != null)
      node.left = helper(node.left, limit, sum + node.left.val);
    
    if(node.right != null)
      node.right = helper(node.right, limit, sum + node.right.val);
    
    // The node is insufficient if the left and right nodes are null
    return node.left == null && node.right == null ? null : node;
  }
}
