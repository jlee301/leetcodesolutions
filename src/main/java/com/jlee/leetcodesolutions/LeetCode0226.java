package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode0226 {
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
    
    // Create the left and right subtrees w/o directly affecting the input first
    TreeNode left = invertTree(root.right);
    TreeNode right = invertTree(root.left);
    
    // After they are created, now swap them in-place
    root.left = left;
    root.right = right;
    return root;
  }
}
