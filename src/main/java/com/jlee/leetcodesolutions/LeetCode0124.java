package com.jlee.leetcodesolutions;

public class LeetCode0124 {
  /*
   * Given a non-empty binary tree, find the maximum path sum.
   * 
   * For this problem, a path is defined as any sequence of nodes from some
   * starting node to any node in the tree along the parent-child connections. The
   * path must contain at least one node and does not need to go through the root.
   * 
   * https://leetcode.com/problems/binary-tree-maximum-path-sum/
   */
  private int mps;
  
  /*
   *   root        Path 1       Path 2
   *    1            1            1
   *   / \          / \          / \
   *  1   1        1   1        1   1
   *     / \          /              \
   *    1   1        1                1
   */
  public int maxPathSum(TreeNode root) {
    mps = Integer.MIN_VALUE;
    helper(root);
    return mps;
  }
  
  private int helper(TreeNode node) {
    if(node == null)
      return 0;
    
    // If either the left or right path leads to a negative value, we ignore and
    // take 0
    int left = Math.max(0, helper(node.left));
    int right = Math.max(0, helper(node.right));
    
    // assuming this node if the highest path
    mps = Math.max(mps, left + right + node.val);
    
    // Now we use the path with the highest sum to return
    return Math.max(left, right) + node.val;
  }
}
