package com.jlee.leetcodesolutions;

public class LeetCode074 {
  /*
   * Write an efficient algorithm that searches for a value in an m x n matrix.
   * This matrix has the following properties:
   * 1. Integers in each row are sorted from left to right.
   * 2. The first integer of each row is greater than the last integer of the
   * previous row. For example,
   * 
   * Consider the following matrix:
   * [ [ 1,  3,  5,  7], 
   *   [10, 11, 16, 20], 
   *   [23, 30, 34, 50] ]
   * 
   * Given target = 3, return true.
   * 
   * https://leetcode.com/problems/search-a-2d-matrix/description/
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length < 1 || matrix[0].length < 1) 
      return false;
    
    // Search this first entry in each row to see where the target could be in
    int row = -1;
    for(int i = 0; i < matrix.length; i++) {
      if(matrix[i][0] == target)
        return true;
      else if(matrix[i][0] < target)
        row = i;
      else 
        break;
    }
    
    // If row is still equal to -1, it means every first entry is greater than the
    // target. It is not possible for the target to exist in this condition.
    if(row == -1)
      return false;
    
    // Now search the row for the target. We can skip first entry because it was
    // checked above when seeing which row it could be in.
    for(int i = 1; i < matrix[row].length; i++) {
      if(matrix[row][i] == target)
        return true;
      else if(matrix[row][i] > target)
        break;
    }
    return false;
  }
}
