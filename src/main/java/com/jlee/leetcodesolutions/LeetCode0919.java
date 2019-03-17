package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0919 {
  /*
   * A complete binary tree is a binary tree in which every level, except possibly
   * the last, is completely filled, and all nodes are as far left as possible.
   * 
   * Write a data structure CBTInserter that is initialized with a complete binary
   * tree and supports the following operations:
   * 1. CBTInserter(TreeNode root) initializes the data structure on a given tree
   * with head node root;
   * 2. CBTInserter.insert(int v) will insert a TreeNode into the tree with value
   * node.val = v so that the tree remains complete, and returns the value of the
   * parent of the inserted TreeNode;
   * 3. CBTInserter.get_root() will return the head node of the tree.
   * 
   * https://leetcode.com/problems/complete-binary-tree-inserter/description/
   */
  private HashMap<Integer, List<TreeNode>> map;
  
  public LeetCode0919(TreeNode root) {
    map = new HashMap<>();
    helper(root, 0);
  }
  
  private void helper(TreeNode node, int level) {
    if(node == null)
      return;
    map.computeIfAbsent(level, k -> new ArrayList<>()).add(node);
    helper(node.left, level+1);
    helper(node.right, level+1);
  }
  
  public int insert(int v) {
    TreeNode node = new TreeNode(v);
    int level = map.size()-1;
    if(1 << level == map.get(level).size()) {
      // Level of the tree is full, create next level
      level++;
      map.put(level, new ArrayList<>());
    }
    map.get(level).add(node);
    int len = map.get(level).size();

    // Find parent from previous level and associate the node to the appropriate
    // left or right child:
    // len odd = left, len even = right
    TreeNode parent = map.get(level-1).get((len-1)/2);    
    if(len % 2 != 0)
      parent.left = node;
    else
      parent.right = node;    
    
    return parent.val;
  }
  
  public TreeNode get_root() {
    return map.get(0).get(0);
  }
}
