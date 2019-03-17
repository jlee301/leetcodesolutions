package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0501 {
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
  private int max;
  
  public int[] findMode(TreeNode root) {
    HashMap<Integer,Integer> map = new HashMap<>();
    max = 0;
    traverse(root, map);
    
    List<Integer> list = new ArrayList<>();
    for(int key : map.keySet()) {
      if(max == map.get(key))
        list.add(key);
    }    
    int[] ans = new int[list.size()];
    for(int i = 0; i < list.size(); i++)
      ans[i] = list.get(i);
    return ans;
  }
  
  private void traverse(TreeNode node, HashMap<Integer,Integer> map) {
    if(node == null)
      return;
    
    int count = map.getOrDefault(node.val, 0) + 1;
    max = Math.max(max, count);
    map.put(node.val, count);
    traverse(node.left, map);
    traverse(node.right, map);
  }
}
