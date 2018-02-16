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
    
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    obtainTree(left, root.left);
    obtainTree(right, root.right);
    root.left = null;
    for(int num : left) {
      root.right = new TreeNode(num);
      root = root.right;
    }
    for(int num : right) {
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
}
