package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0129 {
  /*
   * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
   * could represent a number.
   * 
   * An example is the root-to-leaf path 1->2->3 which represents the number 123.
   * 
   * Find the total sum of all root-to-leaf numbers.
   * 
   * For example,
   *    1 
   *   / \ 
   *  2   3
   * 
   * The root-to-leaf path 1->2 represents the number 12.
   * The root-to-leaf path 1->3 represents the number 13.
   * Return the sum = 12 + 13 = 25.
   * 
   * https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
   */
  public int sumNumbers(TreeNode root) {
    if(root == null)
      return 0;
    
    List<String> list = new ArrayList<>();
    sumNumbersHelper(list, root, "");
    int sum = 0;
    for(String num : list)
      sum += Integer.valueOf(num);
    return sum;
  }
  
  private void sumNumbersHelper(List<String> list, TreeNode node, String temp) {
    temp = temp + node.val;
    if(node.left == null && node.right == null) {
      list.add(temp);
      return;
    }
    
    if(node.left != null)
      sumNumbersHelper(list, node.left, temp);
   
    if(node.right != null)
      sumNumbersHelper(list, node.right, temp);
  }
}
