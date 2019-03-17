package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0199 {
  /*
   * Given a binary tree, imagine yourself standing on the right side of it,
   * return the values of the nodes you can see ordered from top to bottom.
   * 
   * For example: Given the following binary tree, 
   *     1     <--- 
   *    / \ 
   *   2   3   <--- 
   *    \   \ 
   *     5   4 <--- 
   * 
   * You should return [1, 3, 4].
   * 
   * https://leetcode.com/problems/binary-tree-right-side-view/description/
   */
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    rightSideViewHelper(map, root, 0);
    for(int i = 0; i < map.size(); i++)
      result.add(map.get(i));
    return result;
  }

  private void rightSideViewHelper(HashMap<Integer,Integer> map, TreeNode node, int level) {
    if(node == null)
      return;
    
    if(!map.containsKey(level))
      map.put(level, node.val);
    
    rightSideViewHelper(map, node.right, level+1);
    rightSideViewHelper(map, node.left, level+1);
  }
}
