package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode654 {
  /*
   * Given an integer array with no duplicates. A maximum tree building on this
   * array is defined as follow:
   * 1. The root is the maximum number in the array.
   * 2. The left subtree is the maximum tree constructed from left part subarray
   * divided by the maximum number.
   * 3. The right subtree is the maximum tree constructed from right part subarray
   * divided by the maximum number.
   * 
   * Construct the maximum tree by the given array and output the root node of
   * this tree.
   * 
   * Example 1:
   * Input: [3,2,1,6,0,5]
   * Output: return the tree root node representing the following tree:
   *       6 
   *     /   \ 
   *    3     5 
   *     \   / 
   *      2 0 
   *       \ 
   *        1 
   * 
   * Note:
   * The size of the given array will be in the range [1,1000].
   * 
   * https://leetcode.com/problems/maximum-binary-tree/description/
   */
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    if(nums == null || nums.length == 0)
      return null;
    
    // Find max number to create node
    int pos = 0, max = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > max) {
        pos = i;
        max = nums[i];
      }
    }
    TreeNode node = new TreeNode(max);
    // Creating left subtree from left of max
    node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, pos));
    // Creating right subtree from right of max
    node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, pos+1, nums.length));
    return node;
  }
}
