package com.jlee.leetcodesolutions;

public class LeetCode999 {
  /*
   * https://leetcode.com/contest/weekly-contest-125/problems/available-captures-for-rook/
   */
  public int numRookCaptures(char[][] board) {
    // Find location of the white rook
    int i = 0, j = 0;
    search: for(i = 0; i < board.length; i++) {
      for(j = 0; j < board[i].length; j++) {
        if(board[i][j] == 'R')
          break search;
      }
    }
    
    // Edge case where no white rook is found
    if(i == 8)
      return 0;
    
    int count = 0;
    // check up direction
    for(int r = i-1; r >= 0; r--) {
      if(board[r][j] == 'p') {
        count++;
        break;
      }
      else if(board[r][j] == 'B')
        break;
    }
    
    // check down direction
    for(int r = i+1; r < board.length; r++) {
      if(board[r][j] == 'p') {
        count++;
        break;
      }
      else if(board[r][j] == 'B')
        break;
    }
    
    // check left direction
    for(int c = j-1; c >= 0; c--) {
      if(board[i][c] == 'p') {
        count++;
        break;
      }
      else if(board[i][c] == 'B')
        break;
    }
    
    // check right direction
    for(int c = j+1; c < board[0].length; c++) {
      if(board[i][c] == 'p') {
        count++;
        break;
      }
      else if(board[i][c] == 'B')
        break;
    }
    
    return count;
  }  
}
