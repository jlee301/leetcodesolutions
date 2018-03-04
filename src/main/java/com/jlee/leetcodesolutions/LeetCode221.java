package com.jlee.leetcodesolutions;

public class LeetCode221 {
  /*
   * Given a 2D binary matrix filled with 0's and 1's, find the largest square
   * containing only 1's and return its area.
   * 
   * For example, given the following matrix:
   * 1 0 1 0 0 
   * 1 0 1 1 1 
   * 1 1 1 1 1 
   * 1 0 0 1 0 
   * Return 4.
   * 
   * https://leetcode.com/problems/maximal-square/description/
   */
  public int maximalSquare(char[][] matrix) {
    int maxLen = 0;
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return maxLen;
    
    int row = matrix.length, col = matrix[0].length;
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        if(matrix[i][j] == '1') {
          int len = 1;
          // Move right-down and then check if the entire row and col is all 1's
          outerloop:
            while(i+len < row && j+len < col) {
              // Check row is all 1's
              for(int k = j; k <= j+len; k++) {
                if(matrix[i+len][k] == '0')
                  break outerloop;
              }
              // Check col is all 1's
              for(int k = i; k <= i+len; k++) {
                if(matrix[k][j+len] == '0')
                  break outerloop;
              }
              len++;
            }
          maxLen = Math.max(maxLen, len);
        }
      }
    }
    return maxLen * maxLen;
  }
}
