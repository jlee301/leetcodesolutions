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
    return (isSymmetric(root.left, root.right));
  }
  
  public boolean isSymmetric(TreeNode left, TreeNode right) {
    // This is very similar to isSameTree code, but you're passing left versus right
    // 1. null checks
    // 2. left.val == right.val --> isSymmetric(left.left, right.right) &&
    // isSymmetric(left.right, right.left)
    // 3. else return false
    if(left == null && right == null)
      return true;
    if(left == null || right == null)
      return false;
    
    if(left.val == right.val)
      return(isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left));
    else
      return false;
  }
}
