package com.jlee.leetcodesolutions;

public class LeetCode100 {
  /*
   * Given two binary trees, write a function to check if they are the same or
   * not. Two binary trees are considered the same if they are structurally
   * identical and the nodes have the same value.
   * 
   * Input:     1         1
   *           / \       / \
   *          2   3     2   3
   *         [1,2,3],   [1,2,3]
   *         
   * Output: true
   * 
   * 
   * Input:     1         1
   *           /           \
   *          2             2
   *         [1,2],     [1,null,2]
   *
   * Output: false
   * 
   * Input:     1         1
   *           / \       / \
   *          2   1     1   2
   *         [1,2,1],   [1,1,2]
   * 
   * Output: false
   * 
   * https://leetcode.com/problems/same-tree/description/
   */
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null)
      return true;
    else if(p == null || q == null)
      return false;
    else
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
