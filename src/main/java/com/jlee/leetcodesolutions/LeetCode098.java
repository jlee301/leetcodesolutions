package com.jlee.leetcodesolutions;

public class LeetCode098 {
  /*
   * Given a binary tree, determine if it is a valid binary search tree (BST).
   * 
   * Assume a BST is defined as follows:
   * 1. The left subtree of a node contains only nodes with keys less than the
   * node's key.
   * 2. The right subtree of a node contains only nodes with keys greater than the
   * node's key.
   * 3. Both the left and right subtrees must also be binary search trees.
   * 
   * https://leetcode.com/problems/validate-binary-search-tree/description/
   */
  public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
  }
  
  private boolean isValidBST(TreeNode node, Integer min, Integer max) {
    if(node == null)
      return true;
    
    if((min == null || node.val > min) && (max == null || node.val < max))
      return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    else
      return false;
  }
}
