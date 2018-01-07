package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode543 {
  /*
   * Given a binary tree, you need to compute the length of the diameter of the
   * tree. The diameter of a binary tree is the length of the longest path between
   * any two nodes in a tree. This path may or may not pass through the root.
   * 
   * Example: Given a binary tree 
   *     1 
   *    / \ 
   *   2   3 
   *  / \ 
   * 4   5 
   * 
   * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
   * 
   * Note: The length of path between two nodes is represented by the number of
   * edges between them.
   * 
   * https://leetcode.com/problems/diameter-of-binary-tree/description/
   */
  public int diameterOfBinaryTree(TreeNode root) {
    if(root == null)
      return 0;
    
    return countLength(root.left) + countLength(root.right);    
  }
  
  private int countLength(TreeNode node) {
    if(node == null)
      return 0;
    
    return Math.max(countLength(node.left), countLength(node.right)) + 1;
  }
}
