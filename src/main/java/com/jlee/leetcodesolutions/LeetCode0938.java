package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode0938 {
  /*
   * https://leetcode.com/contest/weekly-contest-110/problems/range-sum-of-bst/
   */
  public int rangeSumBST(TreeNode root, int L, int R) {
    return helper(root, L, R);
  }
  
  public int helper(TreeNode node, int L, int R) {
    if(node == null)
      return 0;
    
    int sum = 0;
    if(node.val >= L && node.val <= R)
      sum += node.val;
    
    sum += helper(node.left, L, R);
    sum += helper(node.right, L, R);
    return sum;
  }
}
