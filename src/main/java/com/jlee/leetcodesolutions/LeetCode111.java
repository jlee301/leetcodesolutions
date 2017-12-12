package com.jlee.leetcodesolutions;

public class LeetCode111 {
  /*
   * Given a binary tree, find its minimum depth.
   * 
   * The minimum depth is the number of nodes along the shortest path from the
   * root node down to the nearest leaf node.
   * 
   * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
   */
  public int minDepth(TreeNode root) {
    if (root == null)
      return 0;
    
    int minLeft = minDepth(root.left);
    int minRight = minDepth(root.right);
    
    if (minLeft == 0 || minRight == 0) {
      // Either left or right doesn't have any leafs
      return minLeft + minRight + 1;
    } else {
      return Math.min(minLeft,minRight) + 1;
    }
  }
}
