package com.jlee.leetcodesolutions;

public class LeetCode0968 {
  /*
   * Given a binary tree, we install cameras on the nodes of the tree.
   * 
   * Each camera at a node can monitor its parent, itself, and its immediate
   * children.
   * 
   * Calculate the minimum number of cameras needed to monitor all nodes of the
   * tree.
   * 
   * https://leetcode.com/problems/binary-tree-cameras/
   */
  private int count;
  
  public int minCameraCover(TreeNode root) {
    count = 0;
    return dfs(root) == 0 ? count + 1 : count;
  }
  
  /*
   *  -1: null
   *   0: no camera, no cover
   *   1: no camera, covered
   *   2: has camera, covered
   */
  private int dfs(TreeNode node) {
    if(node == null)
      return -1;
    
    // at a leaf, should never place camera here
    if(node.left == null && node.right == null)
      return 0;
    
    int left = dfs(node.left);
    int right = dfs(node.right);
    
    // need to place camera here to provide coverage
    if(left == 0 || right == 0) {
      count++;
      return 2;
    }
    
    if(left < 2 && right < 2)
      return 0;
    
    return 1;
  }
}
