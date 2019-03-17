package com.jlee.leetcodesolutions;

public class LeetCode0104 {
  /*
   * Given a binary tree, find its maximum depth. The maximum depth is the number
   * of nodes along the longest path from the root node down to the farthest leaf
   * node.
   * 
   * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
   */
  public int maxDepth(TreeNode root) {
    if(root == null)
      return 0;
    
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}
