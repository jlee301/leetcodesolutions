package com.jlee.leetcodesolutions;

public class LeetCode572 {
  /*
   * Given two non-empty binary trees s and t, check whether tree t has exactly
   * the same structure and node values with a subtree of s. A subtree of s is a
   * tree consists of a node in s and all of this node's descendants. The tree s
   * could also be considered as a subtree of itself.
   * 
   * Example 1: 
   * Given tree s:
   *      3 
   *     / \ 
   *    4   5 
   *   / \ 
   *  1   2 
   *  
   *  Given tree t: 
   *    4 
   *   / \ 
   *  1   2
   * 
   * Return true, because t has the same structure and node values with a subtree
   * of s.
   * 
   * https://leetcode.com/problems/subtree-of-another-tree/description/
   */
  public boolean isSubtree(TreeNode s, TreeNode t) {
    if(s == null && t == null)
      return true;
    
    if(s == null || t == null)
      return false;
    
    if(isMatch(s, t))
      return true;
    else
      return isSubtree(s.left, t) || isSubtree(s.right, t);
  }
  
  private boolean isMatch(TreeNode s, TreeNode t) {
    if(s == null && t == null)
      return true;
    
    if(s == null || t == null)
      return false;
    
    if(s.val != t.val)
      return false;
    else
      return isMatch(s.left, t.left) && isMatch(s.right, t.right);
  }
}
