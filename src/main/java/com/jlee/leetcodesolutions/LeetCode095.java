package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode095 {
  /*
   * Given an integer n, generate all structurally unique BST's (binary search
   * trees) that store values 1...n.
   * 
   * For example, Given n = 3, your program should return all 5 unique BST's shown
   * below.
   * 
   *  1       3       3       2       1 
   *   \     /       /       / \       \ 
   *    3   2       1       1   3       2 
   *   /   /         \                   \ 
   *  2   1           2                   3
   *  
   * https://leetcode.com/problems/unique-binary-search-trees-ii/description/
   */
  public List<TreeNode> generateTrees(int n){
    if(n < 1)
      return new ArrayList<TreeNode>();
    
    return generateTrees(1, n);
  }
  
  private List<TreeNode> generateTrees(int start, int end){
    List<TreeNode> res = new ArrayList<>();
    if(start > end) {
      res.add(null);
      return res;
    }
    
    for(int i = start; i <= end; i++) {
      List<TreeNode> leftTrees = generateTrees(start, i-1);
      List<TreeNode> rightTrees = generateTrees(i+1, end);
      for(TreeNode left : leftTrees) {
        for(TreeNode right: rightTrees) {
          TreeNode root = new TreeNode(i);
          root.left = left;
          root.right = right;
          res.add(root);
        }
      }
    }
    return res;
  }
}
