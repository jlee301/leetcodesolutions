package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode107 {
  /*
   * Given a binary tree, return the bottom-up level order traversal of its nodes'
   * values. (ie, from left to right, level by level from leaf to root).
   * 
   * Input: [3,9,20,null,null,15,7]
   *     3
   *    / \
   *   9  20
   *     /  \
   *    15   7
   * 
   * Output: [
   *          [15,7],
   *          [9,20],
   *          [3]
   *         ]
   */
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    levelOrderBottom(root, map, 0);
    List<List<Integer>> result = new ArrayList<>();
    for(int i = map.size()-1; i >= 0; i--)
      result.add(map.get(i));
    
    return result;
  }
  
  private void levelOrderBottom(TreeNode node, HashMap<Integer,List<Integer>> map, int level) {
    if(node == null)
      return;
    
    map.computeIfAbsent(level, k -> new ArrayList<>()).add(node.val);
    levelOrderBottom(node.left, map, level+1);
    levelOrderBottom(node.right, map, level+1);
  }
}
