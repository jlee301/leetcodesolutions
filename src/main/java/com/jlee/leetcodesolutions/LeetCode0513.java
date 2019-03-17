package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LeetCode0513 {
  /*
   * Given a binary tree, find the leftmost value in the last row of the tree.
   * 
   * Note: You may assume the tree (i.e., the given root node) is not NULL.
   * 
   * https://leetcode.com/problems/find-bottom-left-tree-value/description/
   */
  public int findBottomLeftValue(TreeNode root) {
    if(root == null)
      return Integer.MIN_VALUE;
    
    // Storing TreeMap<Level, List of node values left to right>
    TreeMap<Integer, List<Integer>> map = new TreeMap<>();
    findBottomLeftValue(root, map, 0);
    // lastKey is the highest level
    int key = map.lastKey();
    return map.get(key).get(0);
  }
  
  private void findBottomLeftValue(TreeNode node, TreeMap<Integer,List<Integer>> map, int level) {
    if(node == null) 
      return;
    if(!map.containsKey(level))
      map.put(level, new ArrayList<>());
    map.get(level).add(node.val);
    
    findBottomLeftValue(node.left, map, level+1);
    findBottomLeftValue(node.right, map, level+1);
  }
}
