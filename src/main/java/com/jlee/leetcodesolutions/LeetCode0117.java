package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0117 {
  /*
   * Follow up for problem "Populating Next Right Pointers in Each Node".
   * 
   * What if the given tree could be any binary tree? Would your previous solution
   * still work?
   * 
   * Note:
   * 
   * 1. You may only use constant extra space.
   * 
   * For example, Given the following binary tree,
   *      1
   *    /  \
   *   2    3
   *  / \    \
   * 4   5    7
   * 
   * After calling your function, the tree should look like:
   *      1 -> NULL
   *    /  \
   *   2 -> 3 -> NULL
   *  / \    \
   * 4-> 5 -> 7 -> NULL
   * 
   * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
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
