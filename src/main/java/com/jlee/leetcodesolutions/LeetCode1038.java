package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode1038 {
  /*
   * https://leetcode.com/contest/weekly-contest-135/problems/binary-search-tree-to-greater-sum-tree/
   */
  public TreeNode bstToGst(TreeNode root) {
    dfs(root, 0);
    return root;
  }
  
  private int dfs(TreeNode node, int parent) {
    if(node == null)
      return 0;
    
    // Process right first because every node down this path will be greater than the left
    int right = dfs(node.right, parent);    
    int left = dfs(node.left, node.val + right + parent);
    int temp = node.val;
    node.val = node.val + right + parent;
    
    // Return the sum of this node and all of its children
    return temp + left + right;
  }
}
