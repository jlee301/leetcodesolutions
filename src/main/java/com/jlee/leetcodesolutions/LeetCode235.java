package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode235 {
  /*
   * Given a binary search tree (BST), find the lowest common ancestor (LCA) of
   * two given nodes in the BST.
   * 
   * According to the definition of LCA on Wikipedia: “The lowest common ancestor
   * is defined between two nodes v and w as the lowest node in T that has both v
   * and w as descendants (where we allow a node to be a descendant of itself).”
   * 
   *      ___6___
   *     /       \
   *    2         8
   *   / \       / \
   *  0   4     7   9
   *     / \
   *    3   5
   *      
   * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another
   * example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of
   * itself according to the LCA definition.
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root.val < p.val && root.val < q.val)
      return lowestCommonAncestor(root.right, p, q);
    
    if(root.val > p.val && root.val > q.val)
      return lowestCommonAncestor(root.left, p, q);
    
    return root;
  }
}
