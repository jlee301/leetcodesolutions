package com.jlee.leetcodesolutions;

public class LeetCode868 {
  /*
   * Given a matrix A, return the transpose of A.
   * 
   * The transpose of a matrix is the matrix flipped over it's main diagonal,
   * switching the row and column indices of the matrix.
   * 
   * https://leetcode.com/contest/weekly-contest-92/problems/transpose-matrix/
   */
  public int[][] transpose(int[][] A){
    int R = A.length;
    int C = A[0].length;
    int[][] result = new int[C][R];
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++)
        result[c][r] = A[r][c];
    }
    return result;
  }
}
