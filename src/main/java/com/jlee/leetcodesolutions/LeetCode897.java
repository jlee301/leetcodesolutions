package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode897 {
  /*
   * Given a tree, rearrange the tree in in-order so that the leftmost node in the
   * tree is now the root of the tree, and every node has no left child and only 1
   * right child.
   * 
   * https://leetcode.com/contest/weekly-contest-100/problems/increasing-order-search-tree/
   */
  public TreeNode increasingBST(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    helper(root, queue);
    TreeNode dummy = new TreeNode(-1);
    TreeNode curr = dummy;
    while(!queue.isEmpty()) {
      curr.right = queue.poll();
      curr = curr.right;
      curr.left = null;
    }
    curr.right = null;
    return dummy.right;
  }
  
  // Store into the queue in-order, left, root, right
  private void helper(TreeNode node, Queue<TreeNode> queue) {
    if(node == null)
      return;
    
    helper(node.left, queue);
    queue.add(node);
    helper(node.right, queue);
  }
}
