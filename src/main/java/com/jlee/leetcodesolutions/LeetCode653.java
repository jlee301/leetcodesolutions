package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.HashSet;

public class LeetCode653 {
  /*
   * Given a Binary Search Tree and a target number, return true if there exist
   * two elements in the BST such that their sum is equal to the given target.
   * 
   * Example 1: 
   * Input: 
   *     5 
   *    / \ 
   *   3   6 
   *  / \   \ 
   * 2   4   7
   * 
   * Target = 9
   * Output: True 
   * 
   * Example 2: 
   * Input: 
   *     5 
   *    / \ 
   *   3   6 
   *  / \   \ 
   * 2   4   7
   * Target = 28
   * Output: False
   * 
   * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
   */
  public boolean findTarget(TreeNode root, int k) {
    return dfs(root, k, new HashSet<>());       
  }
  
  private boolean dfs(TreeNode node, int k, HashSet<Integer> set) {
    if(node == null)
      return false;
    
    if(set.contains(k - node.val))
      return true;
    
    set.add(node.val);
    return dfs(node.left, k, set) || dfs(node.right, k, set);
  }
}
