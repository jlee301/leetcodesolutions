package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode1022 {
  /*
   * https://leetcode.com/contest/weekly-contest-131/problems/sum-of-root-to-leaf-binary-numbers/
   */
  private long sum;
  private int MOD = 1_000_000_007;
  public int sumRootToLeaf(TreeNode root) {
    sum = 0L;
    dfs(root, 0L);
    return (int) sum;
  }
  
  private void dfs(TreeNode node, long curr) {
    curr <<= 1;
    curr = (curr | node.val) % MOD;
    
    // Reached a sum to leaf, add to the sum
    if(node.left == null && node.right == null) {
      sum = (sum + curr) % MOD;
      return;
    }
    
    if(node.left != null)
      dfs(node.left, curr);
    
    if(node.right != null)
      dfs(node.right, curr);
  }
}
