package com.jlee.leetcodesolutions;

public class LeetCode0498 {
  /*
   * Given a matrix of M x N elements (M rows, N columns), return all elements of
   * the matrix in diagonal order as shown in the below image.
   * 
   * Example: 
   * Input: [ [ 1, 2, 3 ], 
   *          [ 4, 5, 6 ], 
   *          [ 7, 8, 9 ] ] 
   * 
   * Output: [1,2,4,7,5,3,6,8,9]
   * 
   * Note:
   * 1. The total number of elements of the given matrix will not exceed 10,000.
   * 
   * https://leetcode.com/problems/diagonal-traverse/description/
   */
  public int[] findDiagonalOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0)
      return new int[] {};
    
    int[] result = new int[matrix.length * matrix[0].length];
    int row = 0, col = 0;
    boolean dup = true;
    for(int i = 0; i < result.length; i++) {
      result[i] = matrix[row][col];
      
      // Figure out next position
      if(dup) { 
        // diagonal up-right
        row--;
        col++;
      } else {
        // diagonal down-left
        row++;
        col--;
      }
      
      // If we go out of bounds, we must change directions and reposition to next
      // point.  The ordering of the if statements matter here.
      if(col > matrix[0].length-1) {
        row = row + 2;
        col--;
        dup = false;
      }
      if(row < 0) {
        row++;
        dup = false;
      }
      if(row > matrix.length-1) {
        row--; 
        col = col + 2;
        dup = true;
      }
      if(col < 0) {
        col++;
        dup = true;
      }
    }
    return result;
  }
}
