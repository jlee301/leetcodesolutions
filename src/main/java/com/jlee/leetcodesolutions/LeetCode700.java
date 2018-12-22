package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode700 {
  /*
   * Given the root node of a binary search tree (BST) and a value. You need to
   * find the node in the BST that the node's value equals the given value. Return
   * the subtree rooted with that node. If such node doesn't exist, you should
   * return NULL.
   * 
   * https://leetcode.com/problems/search-in-a-binary-search-tree/
   */
  public TreeNode searchBST(TreeNode root, int val) {
    if(root == null)
      return null;

    if(root.val == val)
      return root;
    else if (root.val > val)
      return searchBST(root.left, val);
    else
      return searchBST(root.right, val);
  }
}
