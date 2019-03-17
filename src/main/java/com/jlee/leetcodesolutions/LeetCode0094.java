package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0094 {
  /*
   * Given a binary tree, return the inorder traversal of its nodes' values.
   * 
   * For example: Given binary tree [1,null,2,3], 
   *   1 
   *    \ 
   *     2 
   *    / 
   *   3 
   * return [1,3,2].
   * 
   * Note: Recursive solution is trivial, could you do it iteratively?
   * 
   * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if(root == null)
      return result;
    
    inorderHelper(root, result);
    return result;
  }
  
  private void inorderHelper(TreeNode node, List<Integer> result) {
    if(node.left != null)
      inorderHelper(node.left, result);
    
    result.add(node.val);
    
    if(node.right != null)
      inorderHelper(node.right, result);
  }
}
