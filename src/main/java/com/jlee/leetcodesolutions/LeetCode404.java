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
    return sumOfLeftLeaves(null, root);
  }
  
  private int sumOfLeftLeaves(TreeNode parent, TreeNode child) {
    if(child == null)
      return 0;
    
    if(child.left == null && child.right == null) {
      if(parent != null && parent.left == child)
        return child.val;
      else
        return 0;
    }
    
    int sum = 0;
    if(child.left != null)
      sum += sumOfLeftLeaves(child, child.left);
    
    if(child.right != null)
      sum += sumOfLeftLeaves(child, child.right);
    
    return sum;
  }
}
