package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode563 {
  /*
   * Given a binary tree, return the tilt of the whole tree.
   * 
   * The tilt of a tree node is defined as the absolute difference between the sum
   * of all left subtree node values and the sum of all right subtree node values.
   * Null node has tilt 0.
   * 
   * The tilt of the whole tree is defined as the sum of all nodes' tilt.
   * 
   * Example:
   * Input:
   *   1
   *  / \
   * 2   3
   * 
   * Output: 1
   * 
   * Explanation:
   * Tilt of node 2 : 0
   * Tilt of node 3 : 0
   * Tilt of node 1 : |2-3| = 1
   * Tilt of binary tree : 0 + 0 + 1 = 1
   * 
   * Note:
   * 1. The sum of node values in any subtree won't exceed the range of 32-bit
   * integer.
   * 2.All the tilt values won't exceed the range of 32-bit integer.
   * 
   * https://leetcode.com/problems/binary-tree-tilt/description/
   */
  private int tilt = 0;
  public int findTilt(TreeNode root) {
    if(root == null)
      return tilt;
    
    findTiltAt(root);
    return tilt;
  }
  
  private void findTiltAt(TreeNode root) {
    if(root.left != null && root.right != null) {
      tilt += Math.abs(root.left.val - root.right.val);
      findTiltAt(root.left);
      findTiltAt(root.right);
      
    } else if(root.left != null && root.right == null) {
      tilt += Math.abs(root.left.val - 0);
      findTiltAt(root.left);
      
    } else if(root.left == null && root.right != null) {
      tilt += Math.abs(0 - root.right.val);
      findTiltAt(root.right);
      
    }
  }
}
