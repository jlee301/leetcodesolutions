package com.jlee.leetcodesolutions;

import java.util.HashMap;
import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode437 {
  /*
   * You are given a binary tree in which each node contains an integer value.
   * 
   * Find the number of paths that sum to a given value.
   * 
   * The path does not need to start or end at the root or a leaf, but it must go
   * downwards (traveling only from parent nodes to child nodes).
   * 
   * The tree has no more than 1,000 nodes and the values are in the range
   * -1,000,000 to 1,000,000.
   * 
   * Example:
   * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
   * 
   *       10 
   *      /  \ 
   *     5   -3 
   *    / \    \ 
   *   3   2   11 
   *  / \   \ 
   * 3  -2   1
   * 
   * Return 3. The paths that sum to 8 are:
   * 1. 5 -> 3 
   * 2. 5 -> 2 -> 1 
   * 3. -3 -> 11
   * 
   * https://leetcode.com/problems/path-sum-iii/description/
   */
  private int result;
  
  public int pathSum(TreeNode root, int sum) {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0, 1);
    result = 0;
    pathSum(root, sum, 0, map);
    return result;
  }
  
  private void pathSum(TreeNode node, int target, int sum, HashMap<Integer,Integer> map) {
    if(node == null)
      return;
    
    int currSum = sum + node.val;
    // Check to see if I have any previous sums that sum to target
    result += map.getOrDefault(currSum - target, 0);
    
    map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    pathSum(node.left, target, currSum, map);
    pathSum(node.right, target, currSum, map);
    map.put(currSum, map.getOrDefault(currSum, 0) - 1);
  }
}
