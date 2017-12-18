package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode226 {
  /*
   * Invert a binary tree.
   *      4
   *    /   \
   *   2     7
   *  / \   / \
   * 1   3 6   9
   * 
   * to
   *      4
   *    /   \
   *   7     2
   *  / \   / \
   * 9   6 3   1
   * 
   * https://leetcode.com/problems/invert-binary-tree/description/
   */
  public TreeNode invertTree(TreeNode root) {
    if(root == null)
      return null;
    
    // Invert temporarily here to not affect original
    TreeNode left = invertTree(root.right);
    TreeNode right = invertTree(root.left);
    
    root.left = left;
    root.right = right;
    
    return root;
  }
}
