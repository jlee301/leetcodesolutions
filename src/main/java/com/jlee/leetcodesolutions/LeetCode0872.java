package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0872 {
  /*
   * Consider all the leaves of a binary tree. From left to right order, the
   * values of those leaves form a leaf value sequence.
   * 
   * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9,
   * 8).
   * 
   * Two binary trees are considered leaf-similar if their leaf value sequence is
   * the same.
   * 
   * Return true if and only if the two given trees with head nodes root1 and
   * root2 are leaf-similar.
   * 
   * https://leetcode.com/contest/weekly-contest-94/problems/leaf-similar-trees/
   */
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> leafs1 = new ArrayList<>();
    List<Integer> leafs2 = new ArrayList<>();
    // Generate all leafs from root1
    findLeafs(root1, leafs1);
    // Generate all leafs from root2
    findLeafs(root2, leafs2);
    
    // Compare to see if the leaf sequences are the same
    if(leafs1.size() != leafs2.size())
      return false;    
    for(int i = 0; i < leafs1.size(); i++) {
      if(leafs1.get(i) != leafs2.get(i))
        return false;
    }
    return true;
  }
  
  private void findLeafs(TreeNode node, List<Integer> list) {
    if(node.left == null && node.right == null) {
      list.add(node.val);
      return;
    }
    
    if(node.left != null)
      findLeafs(node.left, list);
    
    if(node.right != null)
      findLeafs(node.right, list);
  }
}
