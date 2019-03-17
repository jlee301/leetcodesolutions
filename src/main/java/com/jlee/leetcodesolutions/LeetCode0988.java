package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.PriorityQueue;

public class LeetCode0988 {
  /*
   * https://leetcode.com/contest/weekly-contest-122/problems/smallest-string-starting-from-leaf/
   */
  public String smallestFromLeaf(TreeNode root) {
    // The priority queue will keep the strings in lexi order
    PriorityQueue<String> pq = new PriorityQueue<>();
    dfs(root, "", pq);
    return pq.peek();
  }
  
  private void dfs(TreeNode node, String str, PriorityQueue<String> pq) {
    str = (char)('a' + node.val) + str;
    
    if(node.left == null && node.right == null) {
      pq.add(str);
      return;
    }
    
    if(node.left != null && node.right != null) {
      dfs(node.left, str, pq);
      dfs(node.right, str, pq);
    }
    else if(node.left != null) {
      dfs(node.left, str, pq);
    }
    else {
      dfs(node.right, str, pq);      
    }
  }
}
