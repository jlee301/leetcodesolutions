package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode0979 {
  /*
   * https://leetcode.com/problems/distribute-coins-in-binary-tree/
   */
  private int moves;
  public int distributeCoins(TreeNode root) {
    moves = 0;
    dfs(root);
    return moves;
  }
  
  private int dfs(TreeNode node) {
    if(node == null)
      return 0;
    
    int left = dfs(node.left);
    int right = dfs(node.right);
    
    moves += Math.abs(left) + Math.abs(right);
    return left + right + node.val - 1;
  }
}
