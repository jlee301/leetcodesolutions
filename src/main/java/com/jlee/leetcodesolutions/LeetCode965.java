package com.jlee.leetcodesolutions;

public class LeetCode965 {
  /*
   * https://leetcode.com/contest/weekly-contest-117/problems/univalued-binary-tree/
   */
  public boolean isUnivalTree(TreeNode root) {
    if(root == null)
      return true;
    
    return traverse(root.left, root.val) && traverse(root.right, root.val);
  }
  
  private boolean traverse(TreeNode node, int val) {
    if(node == null)
      return true;
    
    if(node.val != val)
      return false;
    
    return traverse(node.left, val) && traverse(node.right, val);
  }
}
