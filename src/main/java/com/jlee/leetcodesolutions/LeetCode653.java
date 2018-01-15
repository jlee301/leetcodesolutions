package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;

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
  private ArrayList<Integer> list = new ArrayList<Integer>();
  
  public boolean findTarget(TreeNode root, int k) {
    if(root == null)
      return false;
    
    populateList(root);
    for(int i = 0; i < list.size(); i++) {
      int temp = list.remove(i);
      if(list.contains(k - temp))
        return true;
      else
        list.add(i,temp);
    }
    return false;
  }
  
  private void populateList(TreeNode node) {
    if(node == null)
      return;
    
    list.add(node.val);
    populateList(node.left);
    populateList(node.right);
  }
}
