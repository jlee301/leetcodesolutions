package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode1110 {
  /*
   * https://leetcode.com/problems/delete-nodes-and-return-forest/
   */
  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    HashSet<Integer> set = new HashSet<>();
    for(int n : to_delete)
      set.add(n);
    
    List<TreeNode> result = new ArrayList<>();
    delNodes(root, null, set, result);
    return result;
  }
  
  private void delNodes(TreeNode node, TreeNode parent, HashSet<Integer> set, List<TreeNode> list) {
    if(node == null)
      return;
    
    if(set.contains(node.val)) {
      delNodes(node.left, null, set, list);
      delNodes(node.right, null, set, list);
      
      if(parent != null) {
        if(parent.left == node)
          parent.left = null;
        else
          parent.right = null;
      }
    }
    else {
      if(parent == null)
        list.add(node);
      
      delNodes(node.left, node, set, list);
      delNodes(node.right, node, set, list);
    }
  }
}
