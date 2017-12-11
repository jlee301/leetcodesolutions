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
    // if p.val != q.val --> return false
    // else
    // check left --> isSameTree(p.left, q.left)
    // check right --> isSameTree(p.right, q.right)
    if(p == null && q == null)
      return true;
    if(p == null || q == null)
      return false;
    
    // After passing the null checks, the assumption is you have values to compare
    if(p.val != q.val) {
      return false;
    } else {
      return(isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
  }
}
