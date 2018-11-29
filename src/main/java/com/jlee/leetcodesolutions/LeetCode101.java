package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode101 {
  /*
   * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
   * around its center).
   * 
   * Input: [1,2,2,3,4,4,3]
   *     1
   *    / \
   *   2   2
   *  / \ / \
   * 3  4 4  3
   * 
   * Output: true
   * 
   * Input: [1,2,2,null,3,null,3]
   *     1
   *    / \
   *   2   2
   *    \   \
   *     3    3
   * 
   * Output: false
   * 
   * https://leetcode.com/problems/symmetric-tree/description/
   */
  public boolean isSymmetric(TreeNode root) {
    if(root == null)
      return true;
    return isSymmetric(root.left, root.right);    
  }
  
  private boolean isSymmetric(TreeNode node1, TreeNode node2) {
    if(node1 == null && node2 == null)
      return true;
    else if(node1 == null || node2 == null)
      return false;
    else
      return node1.val == node2.val && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
  }
}
