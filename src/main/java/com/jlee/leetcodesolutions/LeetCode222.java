package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode222 {
  /*
   * Given a complete binary tree, count the number of nodes.
   * 
   * Definition of a complete binary tree from Wikipedia:
   * In a complete binary tree every level, except possibly the last, is
   * completely filled, and all nodes in the last level are as far left as
   * possible. It can have between 1 and 2^h nodes inclusive at the last level h.
   * 
   * https://leetcode.com/problems/count-complete-tree-nodes/description/
   */
  public int countNodes(TreeNode root) {
    if(root == null)
      return 0;
    
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    
    /*
     * If the heights are the same, it means the left subtree is guaranteed to be a
     * full tree. This would indicate that there are 2^(height of left) nodes
     * (including root) on the left subtree and we would need to count the right
     * subtree.
     * 
     * If they are not the same, then it is reverse, right subtree is guaranteed to
     * be a full tree.
     */
    if(leftHeight == rightHeight) {
      return (1 << leftHeight) + countNodes(root.right);
    } else {
      return (1 << rightHeight) + countNodes(root.left);
    }
  }
  
  private int getHeight(TreeNode node) {
    if(node == null)
      return 0;
    // We only check left based on the description that a complete binary tree, the
    // last level are always as far left as possible.
    return 1 + getHeight(node.left);
  }
}
