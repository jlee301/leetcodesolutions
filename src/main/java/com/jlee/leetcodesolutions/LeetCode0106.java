package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode0106 {
  /*
   * Given inorder and postorder traversal of a tree, construct the binary tree.
   * Note: You may assume that duplicates do not exist in the tree.
   * 
   * For example, given
   * inorder = [9,3,15,20,7] 
   * postorder = [9,15,7,20,3]
   * 
   * Return the following binary tree:
   *     3 
   *    / \ 
   *   9  20 
   *     /  \ 
   *    15   7
   * 
   * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
   */
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    if(inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0)
      return null;
    return buildTree(inorder, 0, inorder.length-1, postorder, postorder.length-1);
  }
  
  private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart) {
    if(postStart < 0 || inStart > inEnd) return null;
    TreeNode node = new TreeNode(postorder[postStart]);
    int inIdx = 0;
    for(int i = inStart; i <= inEnd; i++)
      if(postorder[postStart] == inorder[i]) inIdx = i;
    
    node.right = buildTree(inorder, inIdx+1, inEnd, postorder, postStart-1);
    node.left = buildTree(inorder, inStart, inIdx-1, postorder, postStart-(inEnd-inIdx)-1);
    return node;
  }
}
