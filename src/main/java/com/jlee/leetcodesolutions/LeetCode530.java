package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode530 {
  /*
   * Given a binary search tree with non-negative values, find the minimum
   * absolute difference between values of any two nodes.
   * 
   * Example:
   * Input:
   *   1 
   *    \ 
   *     3 
   *    / 
   *   2
   * 
   * Output: 1
   * 
   * Explanation: The minimum absolute difference is 1, which is the difference
   * between 2 and 1 (or between 2 and 3).
   * 
   * Note: There are at least two nodes in this BST.
   * 
   * https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
   */
  private int min;
  private Integer prev;
  
  public int getMinimumDifference(TreeNode root) {
    min = Integer.MAX_VALUE;      
    prev = null;
    helper(root);
    return min;
  }
  
  private void helper(TreeNode node) {
    if(node == null)
      return;
    
    helper(node.left);
    if(prev != null)
      min = Math.min(min, node.val - prev);
    
    prev = node.val;
    helper(node.right);
  }
}
