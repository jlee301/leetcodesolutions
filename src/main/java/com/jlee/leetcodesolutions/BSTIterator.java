package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Stack;

public class BSTIterator {
  /*
   * Implement an iterator over a binary search tree (BST). Your iterator will be
   * initialized with the root node of a BST.
   * 
   * Calling next() will return the next smallest number in the BST.
   * 
   * Note: next() and hasNext() should run in average O(1) time and uses O(h)
   * memory, where h is the height of the tree.
   */
  private Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    stack = new Stack<>();
    populate(root);
  }

  /*
   * @return whether we have a next smallest number 
   */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /*
   * When we remove an entry, we attempt to populate the right node.
   * @return the next smallest number 
   */
  public int next() {
    TreeNode node = stack.pop();
    populate(node.right);
    return node.val;
  }
  
  /*
   * To keep O(h) memory, we limit populating only of the left side. The
   * assumption is that this tree is balanced properly so this should mean left is
   * less than root, and right is greater.
   */
  private void populate(TreeNode node) {
    while(node != null) {
      stack.push(node);
      node = node.left;
    }
  }
}
