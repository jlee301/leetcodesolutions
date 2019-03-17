package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0054 {
  /*
   * Given a matrix of m x n elements (m rows, n columns), return all elements of
   * the matrix in spiral order.
   * 
   * For example, Given the following matrix:
   * [ [ 1, 2, 3 ], 
   *   [ 4, 5, 6 ], 
   *   [ 7, 8, 9 ] ]
   * 
   * You should return [1,2,3,6,9,8,7,4,5].
   * 
   * https://leetcode.com/problems/spiral-matrix/description/
   */
  private List<Integer> result;
  private int rowStart, rowEnd, colStart, colEnd;
  private int[][] matrix;
  
  public List<Integer> spiralOrder(int[][] matrix) {
    result = new ArrayList<>();
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return result;
    
    this.matrix = matrix;
    rowStart = 0; rowEnd = matrix.length-1; 
    colStart = 0; colEnd = matrix[0].length-1;
    
    while(rowStart <= rowEnd && colStart <= colEnd) {
      spiralLeft();
      spiralDown();
      spiralRight();
      spiralUp();
    }
    return result;
  }
  
  private void spiralLeft() {
    for(int i = colStart; i <= colEnd; i++)
      result.add(matrix[rowStart][i]);
    rowStart++;
  }
  
  private void spiralDown() {
    for(int i = rowStart; i <= rowEnd; i++)
      result.add(matrix[i][colEnd]);
    colEnd--;
  }
  
  private void spiralRight() {
    for(int i = colEnd; i >= colStart && rowStart <= rowEnd; i--)
      result.add(matrix[rowEnd][i]);
    rowEnd--;
  }
  
  private void spiralUp() {
    for(int i = rowEnd; i >= rowStart && colStart <= colEnd; i--)
      result.add(matrix[i][colStart]);
    colStart++;
  }
}
