package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0655 {
  /*
   * Print a binary tree in an m*n 2D string array following these rules:
   * 
   * 1. The row number m should be equal to the height of the given binary tree.
   * 2. The column number n should always be an odd number.
   * 3. The root node's value (in string format) should be put in the exactly
   * middle of the first row it can be put. The column and the row where the root
   * node belongs will separate the rest space into two parts (left-bottom part
   * and right-bottom part). You should print the left subtree in the left-bottom
   * part and print the right subtree in the right-bottom part. The left-bottom
   * part and the right-bottom part should have the same size. Even if one subtree
   * is none while the other is not, you don't need to print anything for the none
   * subtree but still need to leave the space as large as that for the other
   * subtree. However, if two subtrees are none, then you don't need to leave
   * space for both of them.
   * 4. Each unused space should contain an empty string "".
   * 5. Print the subtrees following the same rules.
   * 
   * https://leetcode.com/problems/print-binary-tree/description/
   */
  public List<List<String>> printTree(TreeNode root) {
    // Get the height of the tree to determine MxN matrix size and fill array with
    // empty
    int height = getDepth(root);
    String[][] result = new String[height][(1 << height) - 1];    
    for(String[] row : result)
      Arrays.fill(row, "");

    printTree(root, result, 0, 0, result[0].length);

    // Convert array into List<List<String>> format
    List<List<String>> list = new ArrayList<>();
    for(String[] row : result)
      list.add(Arrays.asList(row));
    return list;
  }
  
  public void printTree(TreeNode node, String[][] result, int row, int left, int right) {
    if(node == null)
      return;

    // Determine mid point to write node.val
    int mid = (left + right) / 2;
    result[row][mid] = "" + node.val;

    printTree(node.left, result, row+1, left, mid);
    printTree(node.right, result, row+1, mid+1, right);
  }
  
  private int getDepth(TreeNode node) {
    if(node == null)
      return 0;
    return 1 + Math.max(getDepth(node.left), getDepth(node.right));
  }
}
