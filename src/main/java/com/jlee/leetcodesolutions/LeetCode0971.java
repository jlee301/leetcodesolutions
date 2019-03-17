package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode0971 {
  /*
   * https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/
   */
  public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    int i = 0;
    
    // DFS
    while(!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      if(curr == null)
        continue;
      
      if(curr.val != voyage[i]) {
        // cannot match the voyage
        return Arrays.asList(new Integer[] {-1});
      }
      
      if(curr.left != null && curr.left.val != voyage[i+1]) {
        // children are swapped, so process right first
        stack.add(curr.left);
        stack.add(curr.right);
        result.add(curr.val);
      }
      else {
        stack.add(curr.right);
        stack.add(curr.left);
      }
      i++;
    }
    return result;
  }  
}
