package com.jlee.leetcodesolutions;

public class NumMatrix {
  /*
   * Given a 2D matrix matrix, find the sum of the elements inside the rectangle
   * defined by its upper left corner (row1, col1) and lower right corner (row2,
   * col2).
   * 
   * Range Sum Query 2D The above rectangle (with the red border) is defined by
   * (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.
   * 
   * Example: 
   * Given matrix = [ [3, 0, 1, 4, 2], 
   *                  [5, 6, 3, 2, 1], 
   *                  [1, 2, 0, 1, 5],
   *                  [4, 1, 0, 1, 7], 
   *                  [1, 0, 3, 0, 5] ]
   * 
   * sumRegion(2, 1, 4, 3) -> 8 
   * sumRegion(1, 1, 2, 2) -> 11 
   * sumRegion(1, 2, 2, 4) -> 12 
   * 
   * Note: You may assume that the matrix does not change. There are many calls 
   * to sumRegion function. You may assume that row1 ≤ row2 and col1 ≤ col2.
   * 
   * https://leetcode.com/problems/range-sum-query-2d-immutable/description/
   */
  private int[][] memo;
  
  public NumMatrix(int[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return;
    
    // memo[m][n] = sum of numbers in row m up to matrix[m][n-1]
    //
    // matrix = { { 1, 2, 3, 4},   --> memo = { { 0, 1, 3, 6,10},
    //            { 5, 6, 7, 8} }               { 0, 5,11,18,26} }
    memo = new int[matrix.length][matrix[0].length+1];
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++)
        memo[i][j+1] = memo[i][j] + matrix[i][j];
    }
  }
  
  /*
   * sum [ [1,2,0,1],        [ [1],        sum [ [2,0,1],
   *       [4,1,0,1],    -     [4],    =         [1,0,1],
   *       [1,0,3,0] ]         [1] ]             [0,3,0] ]
   */
  public int sumRegion(int row1, int col1, int row2, int col2) {
    int sum = 0;
    if(memo == null) return sum;
    for(int i = row1; i <= row2; i++)
      sum += memo[i][col2+1] - memo[i][col1];
    return sum;
  }
}
