package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode114 {
  /*
   * Given a binary tree, flatten it to a linked list in-place.
   * For example, Given
   *          1
   *         / \
   *        2   5
   *       / \   \
   *      3   4   6
   * 
   * The flattened tree should look like:
   * 1
   *  \
   *   2
   *    \
   *     3
   *      \
   *       4
   *        \
   *         5
   *          \
   *           6
   * 
   * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
   */
  public void flatten(TreeNode root) {
    if(root == null)
      return;
    
    List<Integer> list = new ArrayList<>();
    obtainTree(list, root.left);
    obtainTree(list, root.right);
    root.left = null;
    for(int num : list) {
      root.right = new TreeNode(num);
      root = root.right;
    }
  }
  
  private void obtainTree(List<Integer> list, TreeNode node) {
    if(node == null)
      return;
    list.add(node.val);
    obtainTree(list, node.left);
    obtainTree(list, node.right);
  }
  
  public void flattenBetter(TreeNode root) {
    if(root == null)
      return;
    
    flattenBetter(root.left);
    flattenBetter(root.right);
    // Temporarily save root.right
    TreeNode temp = root.right;
    if(root.left != null) {
      // Make right the left, then set left to null.
      root.right = root.left;
      root.left = null;
      // Now traverse to the end of right and set it to the original right.
      while(root.right != null) root = root.right;
      root.right = temp;
    }
  }
}
