package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode404 {
  /*
   * Find the sum of all left leaves in a given binary tree.
   * 
   * Example:
   *   3 
   *  / \ 
   * 9   20 
   *    /  \ 
   *   15   7
   * 
   * There are two left leaves in the binary tree, with values 9 and 15
   * respectively. Return 24.
   */
  public int sumOfLeftLeaves(TreeNode root) {
    int sum = 0;
    if(root == null)
      return sum;
    
    // If left node is a leaf --> add to sum
    // Else keep traversing the tree on left
    if(root.left != null)
      if(root.left.left == null && root.left.right == null)
        sum += root.left.val;
      else
        sum += sumOfLeftLeaves(root.left);
    
    // Now check right
    sum += sumOfLeftLeaves(root.right);
    return sum;
  }
}
