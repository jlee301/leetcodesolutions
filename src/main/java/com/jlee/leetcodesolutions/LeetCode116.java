package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeLinkNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode116 {
  /*
   * Populate each next pointer to point to its next right node. If there is no
   * next right node, the next pointer should be set to NULL.
   * 
   * Initially, all next pointers are set to NULL.
   * 
   * Note:
   * 1. You may only use constant extra space.
   * 2. You may assume that it is a perfect binary tree (ie, all leaves are at the
   * same level, and every parent has two children).
   * 
   * For example, Given the following perfect binary tree, 
   *      1 
   *    /   \ 
   *   2     3 
   *  / \   / \ 
   * 4   5 6   7 
   * 
   * After calling your function, the tree should look like: 
   *      1 -> NULL
   *    /  \
   *   2 -> 3 -> NULL
   *  / \  / \
   * 4->5->6->7 -> NULL
   * 
   * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
   */
  public void connect(TreeLinkNode root) {
    List<List<TreeLinkNode>> list = new ArrayList<>();
    connectHelper(list, root, 0);
    for(List<TreeLinkNode> row : list) {
      for(int i = 0; i < row.size()-1; i++)
        row.get(i).next = row.get(i+1);
    }
  }
  
  private void connectHelper(List<List<TreeLinkNode>> list, TreeLinkNode node, int level) {
    if(node == null) 
      return;
    if(level >= list.size())
      list.add(level, new ArrayList<>());
    
    list.get(level).add(node);
    connectHelper(list, node.left, level+1);
    connectHelper(list, node.right, level+1);
  }
}
