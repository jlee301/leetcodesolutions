package com.jlee.leetcodesolutions;

public class LeetCode0111 {
  /*
   * Given a binary tree, find its minimum depth.
   * 
   * The minimum depth is the number of nodes along the shortest path from the
   * root node down to the nearest leaf node.
   * 
   * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
   */
  int min = Integer.MAX_VALUE;
  public int minDepth(TreeNode root) {
    helper(root, 1);
    return min == Integer.MAX_VALUE ? 0 : min;
  }
  
  private void helper(TreeNode node, int level) {
    if(node == null || level >= min)
      return;
    
    if(node.left == null && node.right == null) {
      min = Math.min(min, level);
      return;
    }
    
    if(node.left != null)
      helper(node.left, level+1);
    
    if(node.right != null)
      helper(node.right, level+1);
  }
}
