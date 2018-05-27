package com.jlee.leetcodesolutions;

public class LeetCode840 {
  /*
   * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9
   * such that each row, column, and both diagonals all have the same sum.
   * 
   * Given an N x N grid of integers, how many 3 x 3 "magic square" subgrids are
   * there? (Each subgrid is contiguous).
   * 
   * https://leetcode.com/contest/weekly-contest-86/problems/magic-squares-in-grid/
   */
  public int numMagicSquaresInside(int[][] grid) {
    int count = 0;
    for(int r = 0; r < grid.length-2; r++) {
      for(int c = 0; c < grid[r].length-2; c++) {        
        // Check if numbers are 1 thru 9
        boolean isDistinct = true;
        int[] nums = new int[10];
        for(int i = 0; i < 3; i++) {
          for(int j = 0; j < 3; j++) {
            if(grid[r+i][c+j] >= 1 && grid[r+i][c+j] <= 9)
              nums[grid[r+i][c+j]]++;
          }
        }
        for(int i = 1; i < 10; i++) {
          if(nums[i] != 1) {
            isDistinct = false;
            break;
          }
        }

        if(isDistinct) {
          // Check sums are the same
          int[] result = new int[8];
          
          // Rows
          result[0] = grid[r][c] + grid[r][c+1] + grid[r][c+2];
          result[1] = grid[r+1][c] + grid[r+1][c+1] + grid[r+1][c+2];
          result[2] = grid[r+2][c] + grid[r+2][c+1] + grid[r+2][c+2];
          // Columns
          result[3] = grid[r][c] + grid[r+1][c] + grid[r+2][c];
          result[4] = grid[r][c+1] + grid[r+1][c+1] + grid[r+2][c+1];
          result[5] = grid[r][c+2] + grid[r+1][c+2] + grid[r+2][c+2];
          // Diagonals
          result[6] = grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2];
          result[7] = grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c];

          // Check results
          boolean isMagic = true;
          for(int i = 1; i < result.length; i++) {
            if(result[0] != result[i]) {
              isMagic = false;
              break;
            }
          }
          if(isMagic)
            count++;
        }
      }
    }
    return count;
  }
}
