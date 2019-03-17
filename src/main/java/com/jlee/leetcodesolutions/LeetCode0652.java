package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0652 {
  /*
   * Given a binary tree, return all duplicate subtrees. For each kind of
   * duplicate subtrees, you only need to return the root node of any one of them.
   * 
   * Two trees are duplicate if they have the same structure with same node
   * values.
   * 
   * Example 1:     1 
   *               / \ 
   *              2   3 
   *             /   / \ 
   *            4   2   4 
   *               / 
   *              4 
   * The following are two duplicate subtrees: 
   *   2     4 
   *  / 
   * 4
   * 
   * Therefore, you need to return above trees' root in the form of a list.
   * 
   * https://leetcode.com/problems/find-duplicate-subtrees/description/
   */
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    // Map Serialized Value, Frequency
    HashMap<String,Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();
    findDuplicateSubtrees(root, map, result);
    return result;
  }
  
  private String findDuplicateSubtrees(TreeNode node, HashMap<String,Integer> map, List<TreeNode> result) {
    // Serialize the subtree
    if(node == null)
      return "#";
    String serialKey = node.val + "," + findDuplicateSubtrees(node.left, map, result) + "," + findDuplicateSubtrees(node.right, map, result);
    map.put(serialKey, map.getOrDefault(serialKey, 0) + 1);
    // We only add into the list when count = 2 to avoid duplicates
    if(map.get(serialKey) == 2)
      result.add(node);
    return serialKey;
  }
}
