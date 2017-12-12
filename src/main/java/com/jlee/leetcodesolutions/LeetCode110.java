package com.jlee.leetcodesolutions;

public class LeetCode110 {
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
    if(root == null) {
      return true;
    }
    
    int maxLeft = maxDepth(root.left);
    int maxRight = maxDepth(root.right);
    
    if(maxLeft-maxRight < -1 || maxLeft-maxRight > 1)
      return false;
    else
      return true;
  }
  
  /*
   * Taken from Problem 104 Max Depth
   */
  public int maxDepth(TreeNode node) {
    if(node==null) {
        return 0;
    }    
    return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
  }
}
