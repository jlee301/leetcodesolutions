package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode623 {
  /*
   * Given the root of a binary tree, then value v and depth d, you need to add a
   * row of nodes with value v at the given depth d. The root node is at depth 1.
   * 
   * The adding rule is: given a positive integer depth d, for each NOT null tree
   * nodes N in depth d-1, create two tree nodes with value v as N's left subtree
   * root and right subtree root. And N's original left subtree should be the left
   * subtree of the new left subtree root, its original right subtree should be
   * the right subtree of the new right subtree root. If depth d is 1 that means
   * there is no depth d-1 at all, then create a tree node with value v as the new
   * root of the whole original tree, and the original tree is the new root's left
   * subtree.
   * 
   * Note:
   * 1. The given d is in range [1, maximum depth of the given tree + 1].
   * 2. The given binary tree has at least one tree node.
   */
  public TreeNode addOneRow(TreeNode root, int v, int d) {
    // d-1 is new root
    if(d == 1) {
      TreeNode newRoot = new TreeNode(v);
      newRoot.left = root;
      return newRoot;
    }
    
    // Store into queue all TreeNodes at level d-1
    Queue<TreeNode> queue = new LinkedList<>();
    findLevel(root, 1, d-1, queue);

    while(!queue.isEmpty()) {
      TreeNode node = queue.poll();
      TreeNode left = new TreeNode(v);
      TreeNode right = new TreeNode(v);
      left.left = node.left;
      right.right = node.right;
      node.left = left;
      node.right = right;
    }
    return root;
  }
  
  private void findLevel(TreeNode node, int curr, int level, Queue<TreeNode> queue) {
    if(node == null)
      return;
    if(curr == level)
      queue.offer(node);
    else {
      findLevel(node.left, curr+1, level, queue);
      findLevel(node.right, curr+1, level, queue);
    }
  }
}
