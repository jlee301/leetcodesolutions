package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;

public class LeetCode538 {
  /*
   * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
   * every key of the original BST is changed to the original key plus sum of all
   * keys greater than the original key in BST.
   * 
   * Example:
   * Input: 
   * The root of a Binary Search Tree like this: 
   *   5 
   *  / \ 
   * 2  13
   * 
   * Output: 
   * The root of a Greater Tree like this: 
   *   18 
   *  /  \ 
   * 20  13
   * 
   * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
   */
  private ArrayList<Integer> list = new ArrayList<Integer>();

  public TreeNode convertBST(TreeNode root) {
    if(root == null)
      return null;
    
    populateList(root);
    TreeNode temp = new TreeNode(0);
    populateGreaterTree(root, temp, root.val);
    
    return temp;
  }
  
  private void populateList(TreeNode node) {
    list.add(node.val);
    if(node.left != null)
      populateList(node.left);
    if(node.right != null)
      populateList(node.right);
  }
  
  private void populateGreaterTree(TreeNode node, TreeNode greater, int value) {
    greater.val = value;
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i) > value)
        greater.val += list.get(i);
    }
    
    if(node.left != null) {
      greater.left = new TreeNode(0);
      populateGreaterTree(node.left, greater.left, node.left.val);
    }
    
    if(node.right != null) {
      greater.right = new TreeNode(0);
      populateGreaterTree(node.right, greater.right, node.right.val);
    }
  }
}
