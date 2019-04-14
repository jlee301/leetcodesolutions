package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode1026 {
  /*
   * https://leetcode.com/contest/weekly-contest-132/problems/maximum-difference-between-node-and-ancestor/ 
   */
  private int max;
  
  public int maxAncestorDiff(TreeNode root) {
    max = 0;
    dfs(root, root.val, root.val);
    return max;
  }
  
  private void dfs(TreeNode node, int currMax, int currMin) {
    if(node == null)
      return;
    
    // Obtain the max diff with respects to the current node and currMax, currMin
    max = Math.max(max, Math.max(Math.abs(currMax - node.val), Math.abs(currMin - node.val)));
    
    // Update the currMax and currMin for next iteration
    // Because we want the absolute values, we are only concern with the max and min values we have seen so far
    int nextMax = Math.max(currMax, node.val);
    int nextMin = Math.min(currMin, node.val);    
    dfs(node.left, nextMax, nextMin);
    dfs(node.right, nextMax, nextMin);
  }
}
