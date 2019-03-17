package com.jlee.leetcodesolutions;

public class LeetCode0059 {
  /*
   * Given an integer n, generate a square matrix filled with elements from 1 to
   * n2 in spiral order.
   * 
   * For example, Given n = 3,
   * You should return the following matrix: 
   * [ [ 1, 2, 3 ], 
   *   [ 8, 9, 4 ], 
   *   [ 7, 6, 5 ] ]
   *   
   * https://leetcode.com/problems/spiral-matrix-ii/description/
   */
  private int rowStart, rowEnd, colStart, colEnd, count;
  private int[][] matrix;
  
  public int[][] generateMatrix(int n) {
    if(n <= 0)
      return new int[0][0];
    
    matrix = new int[n][n];
    rowStart = 0; rowEnd = n-1; colStart = 0; colEnd = n-1; count = 1;
    while(count <= n*n) {
      spiralLeft();
      spiralDown();
      spiralRight();
      spiralUp();
    }
    return matrix;
  }
  
  private void spiralLeft() {
    for(int i = colStart; i <= colEnd; i++)
      matrix[rowStart][i] = count++;
    rowStart++;
  }
  
  private void spiralDown() {
    for(int i = rowStart; i <= rowEnd; i++)
      matrix[i][colEnd] = count++;
    colEnd--;
  }
  
  private void spiralRight() {
    for(int i = colEnd; i >= colStart; i--)
      matrix[rowEnd][i] = count++;
    rowEnd--;
  }
  
  private void spiralUp() {
    for(int i = rowEnd; i >= rowStart; i--)
      matrix[i][colStart] = count++;
    colStart++;
  }
}
