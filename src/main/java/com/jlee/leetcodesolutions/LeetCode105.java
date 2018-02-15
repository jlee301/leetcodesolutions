package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode105 {
  /*
   * Given preorder and inorder traversal of a tree, construct the binary tree.
   * Note: You may assume that duplicates do not exist in the tree.
   * 
   * For example, given
   * preorder = [3,9,20,15,7]
   * inorder = [9,3,15,20,7]
   * 
   * Return the following binary tree:
   *     3 
   *    / \ 
   *   9  20 
   *     /  \ 
   *    15   7
   * 
   * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
   */
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
      return null;
    return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
  }
  
  private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    if(preStart > preEnd || inStart > inEnd)
      return null;
    
    TreeNode node = new TreeNode(preorder[preStart]);
    int inIndexRoot = 0;
    for(int i = inStart; i <= inEnd; i++) {
      if(preorder[preStart] == inorder[i])
        inIndexRoot = i;
    }
    // Everything left of inIndexRoot (0 thru inIndexRoot-1) is part of the left
    // tree
    // Everything right of inIndexRoot (inIndexRoot+1 thru inorder.length-1) is part
    // of the right tree
    
    node.left = buildTree(preorder, preStart+1, preEnd, inorder, inStart, inIndexRoot-1);    
    // preStart + (inIndexRoot - inStart) + 1
    // Moving preStart the distance of all nodes that were on the left side.
    node.right = buildTree(preorder, preStart+inIndexRoot-inStart+1, preEnd, inorder, inIndexRoot+1, inEnd);
    return node;
  }
}
