package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode0701 {
  /*
   * Given the root node of a binary search tree (BST) and a value to be inserted
   * into the tree, insert the value into the BST. Return the root node of the BST
   * after the insertion. It is guaranteed that the new value does not exist in
   * the original BST.
   * 
   * Note that there may exist multiple valid ways for the insertion, as long as
   * the tree remains a BST after insertion. You can return any of them.
   * 
   * https://leetcode.com/problems/insert-into-a-binary-search-tree/
   */
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if(root == null)
      return new TreeNode(val);
    
    if(val > root.val)
      root.right = insertIntoBST(root.right, val);
    else
      root.left = insertIntoBST(root.left, val);
    
    return root;        
  }
}
