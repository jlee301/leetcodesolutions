package com.jlee.leetcodesolutions;

public class LeetCode0450 {
  /*
   * Given a root node reference of a BST and a key, delete the node with the
   * given key in the BST. Return the root node reference (possibly updated) of
   * the BST.
   * 
   * Basically, the deletion can be divided into two stages:
   * 1. Search for a node to remove.
   * 2. If the node is found, delete the node.
   * 
   * Note: Time complexity should be O(height of tree).
   */
  public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null)
      return null;
    if(root.val > key)
      root.left = deleteNode(root.left, key);
    else if(root.val < key)
      root.right = deleteNode(root.right, key);
    else {
      // We found the node with the key value.
      if(root.left == null)
        return root.right;
      else if(root.right == null)
        return root.left;
      else {
        // Left and right both have values. Find min value from right side. Set this as
        // the value and then delete it from the right side.
        root.val = findMin(root.right);
        root.right = deleteNode(root.right, root.val);
      }
    }
    return root;
  }
  
  private int findMin(TreeNode node) {
    int minVal = Integer.MAX_VALUE;
    while(node != null) {
      minVal = Math.min(minVal, node.val);
      node = node.left;
    }
    return minVal;
  }  
}
