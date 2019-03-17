package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0515 {
  /*
   * You need to find the largest value in each row of a binary tree.
   * 
   * Example: 
   * Input:
   *      1 
   *     / \ 
   *    3   2 
   *   / \   \ 
   *  5   3   9
   * 
   * Output: [1, 3, 9]
   * 
   * https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
   */
  public List<Integer> largestValues(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    largestValues(root, list, 0);
    return list;
  }
  
  private void largestValues(TreeNode node, List<Integer> list, int level) {
    if(node == null)
      return;
    if(list.size() == level)
      list.add(node.val);
    else
      list.set(level, Math.max(list.get(level), node.val));
    
    largestValues(node.left, list, level+1);
    largestValues(node.right, list, level+1);
  }
}
