package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0037 {
  /*
   * https://leetcode.com/problems/sudoku-solver/
   */
  private HashSet<String> rows;
  private HashSet<String> cols;
  private HashSet<String> blks;
  private boolean found;
  private static final char PERIOD = '.';
  
  public void solveSudoku(char[][] board) {
    // Establish what the current board is
    rows = new HashSet<>();
    cols = new HashSet<>();
    blks = new HashSet<>();
    found = false;
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[i].length; j++) {
        if(board[i][j] != PERIOD) {
          rows.add(board[i][j] + "row" + i);
          cols.add(board[i][j] + "col" + j);
          blks.add(board[i][j] + "blk" + i/3 + j/3);
        }
      }
    }
    dfs(board, 0, 0);
  }
  
  private void dfs(char[][] board, int r, int c) {
    if(blks.size() == 81) {
      found = true;
      return;
    }
    
    if(board[r][c] != PERIOD) {
      if(c == board[r].length-1)
        dfs(board, r+1, 0);
      else
        dfs(board, r, c+1);
      
      if(found)
        return;
    }
    else {
      for(char i = '1'; i <= '9'; i++) {
        String rowKey = i + "row" + r;
        String colKey = i + "col" + c;
        String blkKey = i + "blk" + r/3 + c/3;
        if(!rows.contains(rowKey) && !cols.contains(colKey) && !blks.contains(blkKey)) {
          // Backtracking
          board[r][c] = i;
          rows.add(rowKey);
          cols.add(colKey);
          blks.add(blkKey);
          
          if(c == board[r].length-1)
            dfs(board, r+1, 0);
          else
            dfs(board, r, c+1);
          
          if(found)
            return;
          
          board[r][c] = '.';
          rows.remove(rowKey);
          cols.remove(colKey);
          blks.remove(blkKey);
        }
      }
    }
  }
}
