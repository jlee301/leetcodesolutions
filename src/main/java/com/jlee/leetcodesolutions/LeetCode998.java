package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode998 {
  /*
   * https://leetcode.com/contest/weekly-contest-125/problems/maximum-binary-tree-ii/
   */
  public TreeNode insertIntoMaxTree(TreeNode root, int val) {
    if(root == null)
      return new TreeNode(val);
    
    if(val > root.val) {
      TreeNode node = new TreeNode(val);
      node.left = root;
      return node;
    }
    
    root.right = insertIntoMaxTree(root.right, val);
    return root;
  }
}
