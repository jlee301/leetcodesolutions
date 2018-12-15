package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode538 {
  /*
   * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
   * every key of the original BST is changed to the original key plus sum of all
   * keys greater than the original key in BST.
   * 
   * Example:
   * Input: 
   * The root of a Binary Search Tree like this: 
   *   5 
   *  / \ 
   * 2  13
   * 
   * Output: 
   * The root of a Greater Tree like this: 
   *   18 
   *  /  \ 
   * 20  13
   * 
   * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
   */
  private int sum;
  
  public TreeNode convertBST(TreeNode root) {
    sum = 0;
    helper(root);
    return root;
  }
  
  private void helper(TreeNode node) {
    if(node == null)
      return;
    
    // Traverse right side first to find greater values
    // Add the sum to root, then traverse left
    helper(node.right);
    node.val += sum;
    sum = node.val;
    
    helper(node.left);
  }
}
