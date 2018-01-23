package com.jlee.leetcodesolutions;

public class LeetCode766 {
  /*
   * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the
   * same element.
   * 
   * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
   * 
   * Example 1:
   * Input: 
   * matrix = [[1,2,3,4],
   *           [5,1,2,3],
   *           [9,5,1,2]] 
   * Output: True
   * Explanation:
   * In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]",
   * "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same,
   * so the answer is True. Example 2:
   * 
   * Input: 
   * matrix = [[1,2],
   *           [2,2]] 
   * Output: False
   * Explanation: 
   * The diagonal "[1, 2]" has different elements.
   * 
   * Note:
   * 1. matrix will be a 2D array of integers.
   * 2. matrix will have a number of rows and columns in range [1, 20].
   * 3. matrix[i][j] will be integers in range [0, 99].
   */
  private int[][] matrix;
  private boolean[][] check;
  
  public boolean isToeplitzMatrix(int[][] matrix) {
    if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
      return false;
    
    this.matrix = matrix;
    check = new boolean[matrix.length][matrix[0].length];
    
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(!checkDiag(i, j, matrix[i][j]))
          return false;
      }
    }
    return true;
  }
  
  private boolean checkDiag(int row, int col, int value) {
    if(row > matrix.length-1 || col > matrix[0].length-1 || check[row][col])
      return true;
    
    if(matrix[row][col] != value)
      return false;
    
    check[row][col] = true;
    return checkDiag(row+1,col+1,matrix[row][col]);
  }
}
