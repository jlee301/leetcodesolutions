package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0144 {
  /*
   * Given a binary tree, return the preorder traversal of its nodes' values.
   * 
   * For example: Given binary tree [1,null,2,3], 
   *    1 
   *     \ 
   *      2 
   *     / 
   *    3 
   * return [1,2,3].
   * 
   * Note: Recursive solution is trivial, could you do it iteratively?
   */
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    preorderTraversal(root, list);
    return list;
  }
  
  private void preorderTraversal(TreeNode node, List<Integer> list) {
    if(node == null)
      return;
    
    list.add(node.val);
    preorderTraversal(node.left, list);
    preorderTraversal(node.right, list);
  }
}
