package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Stack;

public class LeetCode1028 {
  /*
   * https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
   */
  public TreeNode recoverFromPreorder(String S) {
    // If a node has only one child, that child is guaranteed to be the left child.
    
    int left = 0;
    while(left < S.length() && Character.isDigit(S.charAt(left)))
      left++;
    
    TreeNode root = new TreeNode(Integer.valueOf(S.substring(0, left)));
    
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    int right = left;
    
    // Use sliding window to determine the depth and value
    while(left < S.length()) {
      // Find depth of next node
      while(!Character.isDigit(S.charAt(right)))
        right++;
      
      int depth = right - left;
      
      // Find value of next node
      left = right;
      while(right < S.length() && Character.isDigit(S.charAt(right)))
        right++;
      
      int value = Integer.valueOf(S.substring(left, right));
      TreeNode node = new TreeNode(value);
      
      // Determine how many to pop from stack
      while(stack.size() > depth)
        stack.pop();
      
      if(stack.peek().left == null)
        stack.peek().left = node;
      else
        stack.peek().right = node;
      
      stack.push(node);
      
      // Update pointer for next iteration
      left = right;
    }
    return root;
  }
}
