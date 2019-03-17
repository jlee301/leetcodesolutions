package com.jlee.leetcodesolutions;

public class LeetCode0110 {
  /*
   * Given a binary tree, determine if it is height-balanced.
   * 
   * For this problem, a height-balanced binary tree is defined as a binary tree
   * in which the depth of the two subtrees of every node never differ by more
   * than 1.
   * 
   * https://leetcode.com/problems/balanced-binary-tree/description/
   */
  public boolean isBalanced(TreeNode root) {
    return helper(root) != -1;
  }
  
  private int helper(TreeNode node) {
    if(node == null)
      return 0;
    
    // Check if left is height balanced
    int left = helper(node.left);
    if(left == -1)
      return -1;
    
    // Check if right is height balanced
    int right = helper(node.right);
    if(right == -1)
      return -1;
    
    // Check if both subtrees does not have a difference greater than 1
    if(Math.abs(left-right) > 1)
      return -1;
  
    return 1 + Math.max(left, right);
  }
}
