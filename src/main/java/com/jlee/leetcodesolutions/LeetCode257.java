package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
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
  public List<String> binaryTreePaths(TreeNode root){
    ArrayList<String> list = new ArrayList<String>();
    if(root == null) 
      return list;
    else {
      binaryTreePaths(root, list, "");
      return list;
    }
  }
  
  private void binaryTreePaths(TreeNode root, List<String> list, String rootToLeaf) {
    if(root.left != null) {
      binaryTreePaths(root.left, list, rootToLeaf + root.val + "->");
    }
    
    if (root.right != null) {
      binaryTreePaths(root.right, list, rootToLeaf + root.val + "->");
    } 
    
    if(root.left == null && root.right == null) {
      list.add(rootToLeaf + root.val);
    }
  }
}
