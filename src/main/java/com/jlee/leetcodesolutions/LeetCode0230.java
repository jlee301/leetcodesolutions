package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0230 {
  /*
   * Given a binary search tree, write a function kthSmallest to find the kth
   * smallest element in it.
   * 
   * Note: You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
   * 
   * https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
   */
  public int kthSmallest(TreeNode root, int k) {
    if(root == null)
      return Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    populate(root, list);
    // This sort is here assuming the tree is not balanced.
    list.sort(null);
    return list.get(k-1);
  }
  
  private void populate(TreeNode node, List<Integer> list) {
    if(node == null) 
      return;
    populate(node.left, list);
    list.add(node.val);
    populate(node.right, list);
  }
}
