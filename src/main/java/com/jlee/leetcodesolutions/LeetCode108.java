package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;

public class LeetCode108 {
  /*
   * Given an array where elements are sorted in ascending order, convert it to a
   * height balanced BST. For this problem, a height-balanced binary tree is
   * defined as a binary tree in which the depth of the two subtrees of every node
   * never differ by more than 1.
   * 
   * Input: [-10,-3,0,5,9]
   * Output: [0,-3,9,-10,null,5]
   *       0
   *      / \
   *    -3   9
   *    /   /
   *  -10  5
   *  
   * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
   */
  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length-1);
  }
  
  private TreeNode helper(int[] nums, int left, int right) {
    if(left > right)
      return null;
    
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums, left, mid-1);
    node.right = helper(nums, mid+1, right);
    return node;
  }
}
