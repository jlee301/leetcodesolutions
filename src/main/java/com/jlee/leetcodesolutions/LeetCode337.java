package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class LeetCode337 {
  /*
   * The thief has found himself a new place for his thievery again. There is only
   * one entrance to this area, called the "root." Besides the root, each house
   * has one and only one parent house. After a tour, the smart thief realized
   * that "all houses in this place forms a binary tree". It will automatically
   * contact the police if two directly-linked houses were broken into on the same
   * night.
   * 
   * Determine the maximum amount of money the thief can rob tonight without
   * alerting the police.
   * 
   * https://leetcode.com/problems/house-robber-iii/description/
   */
  public int rob(TreeNode root) {
    // Adding memo caching
    return rob(root, new HashMap<>());
  }
  
  private int rob(TreeNode node, Map<TreeNode,Integer> memo) {
    if(node == null)
      return 0;
    // Adding memo caching
    if(memo.containsKey(node))
      return memo.get(node);
    
    // Cache the max value of this node from including the node value or not
    memo.put(node, Math.max(rob(node, memo, true), rob(node, memo, false)));    
    return memo.get(node);
  }
  
  private int rob(TreeNode node, Map<TreeNode,Integer> memo, boolean include) {
    if(node == null)
      return 0;
    
    if(include)
      // Includes the node value and implicitly exclude for children
      return node.val + rob(node.left, memo, false) + rob(node.right, memo, false);
    else
      // Since we are not including the node value, we send it back to the main
      // function to determine whether including the children's node value produces
      // higher result or not
      return rob(node.left, memo) + rob(node.right, memo);
  }  
}
