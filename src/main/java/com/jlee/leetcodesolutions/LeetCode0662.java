package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.HashMap;

public class LeetCode0662 {
  /*
   * Given a binary tree, write a function to get the maximum width of the given
   * tree. The width of a tree is the maximum width among all levels. The binary
   * tree has the same structure as a full binary tree, but some nodes are null.
   * 
   * The width of one level is defined as the length between the end-nodes (the
   * leftmost and right most non-null nodes in the level, where the null nodes
   * between the end-nodes are also counted into the length calculation.
   * 
   * https://leetcode.com/problems/maximum-width-of-binary-tree/description/
   */
  private int max = 0;
  
  public int widthOfBinaryTree(TreeNode root) {
    // Store Level and leftmost position
    HashMap<Integer,Integer> map = new HashMap<>();
    widthOfBinaryTree(root, map, 0, 0);
    return max;
  }
  
  /*                         pos
   *      1                   0
   *    /   \               /   \
   *   2     3             0     1
   *  / \   / \           / \   / \
   * 5   6 7   8         0   1 2   3
   */
  private void widthOfBinaryTree(TreeNode node, HashMap<Integer,Integer> map, int level, int pos) {
    if(node == null)
      return;
    
    // Store the position only if the level does not exist (guarantees to be
    // leftmost)
    if(!map.containsKey(level))
      map.put(level, pos);
    
    // Check distance from leftmost, take the max
    max = Math.max(max, pos - map.get(level) + 1);
          
    widthOfBinaryTree(node.left, map, level+1, 2 * pos);
    widthOfBinaryTree(node.right, map, level+1, 2 * pos + 1);
  }
}
