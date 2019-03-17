package com.jlee.leetcodesolutions;

public class LeetCode0861 {
  /*
   * We have a two dimensional matrix A where each value is 0 or 1.
   * 
   * A move consists of choosing any row or column, and toggling each value in
   * that row or column: changing all 0s to 1s, and all 1s to 0s.
   * 
   * After making any number of moves, every row of this matrix is interpreted as
   * a binary number, and the score of the matrix is the sum of these numbers.
   * 
   * Return the highest possible score.
   * 
   * https://leetcode.com/problems/score-after-flipping-matrix/description/
   */
  public int matrixScore(int[][] A) {
    int R = A.length;
    int C = A[0].length;
    
    // count[i] = count of 1's in the column
    int[] count = new int[C];
    
    // For each row, make moves to have A[r][0] == 1, as the first column in the row
    // would guarantee the highest score
    for(int r = 0; r < R; r++) {
      // Invert the row
      if(A[r][0] == 0) {
        for(int c = 0; c < C; c++) {
          A[r][c] ^= 1; 
          if(A[r][c] == 1)
            count[c]++;
        }
      }
      // The row already has A[r][0] == 1
      else {
        for(int c = 0; c < C; c++) {
          if(A[r][c] == 1)
            count[c]++;
        }
      }
    }
    
    // Calculate the score
    int score = 0;
    for(int c = 0; c < C; c++) {
      // Which is higher count, 0's or 1's in the column
      // R-count[c] == number of 0's in column c
      // count[c] == number of 1's in column c
      //
      // Multiply the higher count with the 2^n value
      score += Math.max(R-count[c], count[c]) * (1 << C-c-1);
    }
    return score;
  }
}
