package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode669 {
  /*
   * Given a binary search tree and the lowest and highest boundaries as L and R,
   * trim the tree so that all its elements lies in [L, R] (R >= L). You might
   * need to change the root of the tree, so the result should return the new root
   * of the trimmed binary search tree.
   * 
   * Example 1: 
   * Input:                 Output: 
   *    1                      1
   *   / \                      \
   *  0   2                      2
   * 
   * L = 1 R = 2
   * 
   * Example 2:
   * Input:                 Output:
   *    3                      3
   *   / \                    /
   *  0   4                  2
   *   \                    /
   *    2                  1
   *   / 
   *  1
   * 
   * L = 1 R = 3
   * 
   * https://leetcode.com/problems/trim-a-binary-search-tree/description/
   */
  public TreeNode trimBST(TreeNode root, int L, int R) {
    TreeNode newTree = null;
    if(root == null)
      return newTree;
    
    newTree = new TreeNode(0);
    if(root.val >= L && root.val <= R) {
      newTree.val = root.val;
      newTree.left = trimBST(root.left, L, R);
      newTree.right = trimBST(root.right, L, R);
    } else {
      newTree = trimBST(root.left, L, R);
      // If the trim is still null, then try right side.
      if(newTree == null)
        newTree = trimBST(root.right, L, R);
    }
    return newTree;
  }
}
