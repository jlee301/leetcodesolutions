package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Arrays;
import java.util.HashSet;

public class LeetCode671 {
  /*
   * Given a non-empty special binary tree consisting of nodes with the
   * non-negative value, where each node in this tree has exactly two or zero
   * sub-node. If the node has two sub-nodes, then this node's value is the
   * smaller value among its two sub-nodes.
   * 
   * Given such a binary tree, you need to output the second minimum value in the
   * set made of all the nodes' value in the whole tree.
   * 
   * If no such second minimum value exists, output -1 instead.
   * 
   * Example 1:
   * Input: 
   *   2 
   *  / \ 
   * 2   5 
   *    / \ 
   *   5   7
   * 
   * Output: 5
   * Explanation: The smallest value is 2, the second smallest value is 5.
   * 
   * Example 2:
   * Input: 
   *   2 
   *  / \ 
   * 2   2
   * 
   * Output: -1
   * Explanation: The smallest value is 2, but there isn't any second smallest
   * value.
   * 
   * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/
   */
  private HashSet<Integer> hash = new HashSet<Integer>();
  
  public int findSecondMinimumValue(TreeNode root) {
    if(root == null)
      return -1;
    
    populateSet(root);
    Integer[] values = new Integer[hash.size()];
    hash.toArray(values);

    Arrays.sort(values);
    // Because HashSet does not allow duplicate entries, the second entry if it
    // exist is the second minimum.
    if(values.length > 1)
      return values[1];
    else
      return -1;
  }
  
  private void populateSet(TreeNode node) {
    if(node == null)
      return;
    
    hash.add(node.val);
    populateSet(node.left);
    populateSet(node.right);
  }
}
