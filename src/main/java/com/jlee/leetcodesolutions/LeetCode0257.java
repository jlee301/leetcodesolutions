package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0257 {
  /*
   * Given a binary tree, return all root-to-leaf paths.
   * 
   * For example, given the following binary tree:
   *     1
   *    / \
   *   2   3
   *    \
   *     5
   * 
   * All root-to-leaf paths are:
   * ["1->2->5", "1->3"]
   * 
   * https://leetcode.com/problems/binary-tree-paths/description/
   */  
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    if(root != null)
      binaryTreePaths(root, result, "");
    return result;
  }
  
  private void binaryTreePaths(TreeNode node, List<String> result, String str) {
    str += node.val;
    if(node.left == null && node.right == null) {
      result.add(str);
      return;
    }
    
    if(node.left != null)
      binaryTreePaths(node.left, result, str+"->");
      
    if(node.right != null)
      binaryTreePaths(node.right, result, str+"->");
  }
}
