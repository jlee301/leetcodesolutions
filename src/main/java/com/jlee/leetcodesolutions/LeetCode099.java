package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode099 {
  /*
   * Two elements of a binary search tree (BST) are swapped by mistake.
   * 
   * Recover the tree without changing its structure.
   * 
   * https://leetcode.com/problems/recover-binary-search-tree/
   */
  private TreeNode first;
  private TreeNode second;
  private TreeNode prev;
  
  public void recoverTree(TreeNode root) {
    prev = new TreeNode(Integer.MIN_VALUE);
    helper(root);
    
    // swap values of first and second
    int temp = first.val;
    first.val = second.val;
    second.val = temp;
  }
  
  private void helper(TreeNode node) {
    if(node == null)
      return;
    
    // If the tree is perfectly balanced, then in order traversal should yield
    // ascending values (left, root, right)
    helper(node.left);
    
    // Find the first node where the previous value is larger than the next, we
    // store the previous value as first
    if(first == null && prev.val > node.val)
      first = prev;
    
    // Now we must find second node where the previous value is larger than the
    // next, but we take the latter to swap with above
    if(first != null && prev.val > node.val)
      second = node;
    
    prev = node;
    
    helper(node.right);
  }
}
