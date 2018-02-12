package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode783 {
  /*
   * Given a Binary Search Tree (BST) with the root node root, return the minimum
   * difference between the values of any two different nodes in the tree.
   * 
   * Example:
   * Input: root = [4,2,6,1,3,null,null]
   * Output: 1
   * 
   * Explanation:
   * The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
   *      4 
   *     / \ 
   *    2   6 
   *   / \ 
   *  1   3
   * 
   * The minimum difference in this tree is 1, it occurs between node 1 and node
   * 2, also between node 3 and node 2. Note:
   * 
   * 1. The size of the BST will be between 2 and 100.
   * 2. The BST is always valid, each node's value is an integer, and each node's
   * value is different.
   */
  public int minDiffInBST(TreeNode root) {
    List<Integer> data = new ArrayList<>();
    minDiffHelper(root, data);
    data.sort(null);

    int result = Integer.MAX_VALUE;
    for(int i = 0; i < data.size()-1; i++)
      result = Math.min(result, data.get(i+1) - data.get(i));
    
    return result;
  }
  
  private void minDiffHelper(TreeNode node, List<Integer> data) {
    if(node == null)
      return;
    else
      data.add(node.val);
    
    minDiffHelper(node.left, data);
    minDiffHelper(node.right, data);
  }
}
