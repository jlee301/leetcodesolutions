package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode687 {
  /*
   * Given a binary tree, find the length of the longest path where each node in
   * the path has the same value. This path may or may not pass through the root.
   * 
   * Note: The length of path between two nodes is represented by the number of
   * edges between them.
   * 
   * Example 1:
   * Input:
   *      5 
   *     / \ 
   *    4   5 
   *   / \   \ 
   *  1   1   5
   * 
   * Output: 2
   * 
   * Example 2:
   * Input:
   *      1 
   *     / \ 
   *    4   5 
   *   / \   \ 
   *  4   4   5
   * 
   * Output: 2
   * 
   * Note:
   * 1. The given binary tree has not more than 10000 nodes.
   * 2. The height of the tree is not more than 1000.
   * 
   * https://leetcode.com/problems/longest-univalue-path/description/
   */
  private int result = 0;

  public int longestUnivaluePath(TreeNode root) {
    if (root == null)
      return result;
    
    // The value for root is intentionally ignored.
    getLen(root, root.val);
    return result;
  }
  
  private int getLen(TreeNode node, int prev) {
    if (node == null)
      return 0;
    
    int left = getLen(node.left, node.val);
    int right = getLen(node.right, node.val);
    result = Math.max(result, left + right);
    
    if (prev == node.val)
      return Math.max(left, right) + 1;
    else
      return 0;
  }
}
