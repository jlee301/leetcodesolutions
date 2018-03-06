package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode236 {
  /*
   * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
   * in the tree.
   * 
   * According to the definition of LCA on Wikipedia: “The lowest common ancestor
   * is defined between two nodes v and w as the lowest node in T that has both v
   * and w as descendants (where we allow a node to be a descendant of itself).”
   * 
   *            _______3______ 
   *           /              \ 
   *       ___5__           ___1__ 
   *      /      \         /      \ 
   *     6        2       0        8 
   *             / \ 
   *            7   4 
   * 
   * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another
   * example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of
   * itself according to the LCA definition.
   * 
   * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null || root == p || root == q)
      return root;
    
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    
    // If subtree has both p and q, then the root is the lca
    if(left != null && right != null)
      return root;
    // If subtree has one (p or q), then the result is the one found
    else if(left != null)
      return left;
    else
      return right;
  }
}
