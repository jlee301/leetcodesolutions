package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode501 {
  /*
   * Given a binary search tree (BST) with duplicates, find all the mode(s) (the
   * most frequently occurred element) in the given BST.
   * 
   * Assume a BST is defined as follows:
   * 1. The left subtree of a node contains only nodes with keys less than or
   * equal to the node's key.
   * 2. The right subtree of a node contains only nodes with keys greater than or
   * equal to the node's key.
   * 3. Both the left and right subtrees must also be binary search trees.
   * 
   * For example: 
   * Given BST [1,null,2,2], 
   *  1 
   *   \ 
   *    2 
   *   / 
   *  2
   * 
   * return [2].
   * 
   * Note: 
   * If a tree has more than one mode, you can return them in any order.
   * 
   * https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
   */
  private HashMap<Integer, Integer> map;
  private int max;

  public int[] findMode(TreeNode root) {
    map = new HashMap<Integer, Integer>();
    max = 0;
    findCounts(root);

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int key : map.keySet())
      if (map.get(key) == max)
        list.add(key);

    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++)
      result[i] = list.get(i);

    return result;
  }

  /*
   * This function traverses the tree and counts how many time a value repeats in
   * the entire tree. Every turn it will calculate the max value.
   */
  private void findCounts(TreeNode root) {
    if (root == null)
      return;

    map.put(root.val, map.getOrDefault(root.val, 0) + 1);
    max = Math.max(max, map.get(root.val));

    if (root.left != null)
      findCounts(root.left);

    if (root.right != null)
      findCounts(root.right);

    return;
  }
}
