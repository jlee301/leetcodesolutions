package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Stack;

public class LeetCode1008 {
  /*
   * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
   */
  public TreeNode bstFromPreorder(int[] preorder) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode root = null;
    
    for(int i = 0; i < preorder.length; i++) {
      TreeNode node = new TreeNode(preorder[i]);
      
      // Because this is preorder, preorder[0] == root
      // We store root for the return value while we build the rest of the BST
      if(i == 0)
        root = node;
      
      if(stack.isEmpty()) {
        stack.push(node);
      }
      else {
        if(preorder[i] < stack.peek().val) {
          // populate left side
          stack.peek().left = node;
          stack.push(node);
        }
        else {
          // populate right side
          // We keep popping from the stack until we find a node that is greater
          // ie node = 10, stack = 7,8,14 --> 7 is popped, 8 is popped, 14 is greater
          // so we add 10 to the right side of node 8
          TreeNode temp = null;
          while(!stack.isEmpty() && stack.peek().val < preorder[i])
            temp = stack.pop();
          
          temp.right = node;
          stack.push(node);
        }
      }
    }
    return root;
  }
}
