package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0113 {
  /*
   * Given a binary tree and a sum, find all root-to-leaf paths where each path's
   * sum equals the given sum.
   * 
   * For example: Given the below binary tree and sum = 22, 
   *          5 
   *         / \ 
   *        4   8 
   *       /   / \ 
   *      11  13  4 
   *     /  \    / \ 
   *    7    2  5   1 
   * 
   * return [ [5,4,11,2], [5,8,4,5] ]
   */
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    if(root == null)
      return res;
    pathSumHelper(root, sum, res, new ArrayList<>());
    return res;
  }
  
  private void pathSumHelper(TreeNode node, int sum, List<List<Integer>> res, List<Integer> temp) {
    temp.add(node.val);
    if(node.left == null && node.right == null)
      if(sum-node.val == 0) 
        res.add(new ArrayList<>(temp));
    
    if(node.left != null)
      pathSumHelper(node.left, sum-node.val, res, temp);
    
    if(node.right != null)
      pathSumHelper(node.right, sum-node.val, res, temp);
    
    temp.remove(temp.size()-1);
  }
}
