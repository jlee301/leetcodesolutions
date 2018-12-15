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
  private int max;
  public int diameterOfBinaryTree(TreeNode root) {
    max = 0;
    findDepth(root);
    return max;
  }
  
  private int findDepth(TreeNode node) {
    if(node == null)
      return 0;
    
    int leftDepth = findDepth(node.left);
    int rightDepth = findDepth(node.right);
    max = Math.max(max, leftDepth + rightDepth);
    
    return 1 + Math.max(leftDepth, rightDepth);
  }
}
