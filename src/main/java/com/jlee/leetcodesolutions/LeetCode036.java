package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode036 {
  /*
   * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
   * 
   * The Sudoku board could be partially filled, where empty cells are filled with
   * the character '.'.
   * 
   * A partially filled sudoku which is valid.
   * 
   * Note:
   * 1. A valid Sudoku board (partially filled) is not necessarily solvable.
   * 2. Only the filled cells need to be validated.
   * 
   * https://leetcode.com/problems/valid-sudoku/description/
   */
  public boolean isValidSudoku(char[][] board) {
    if(board == null || board.length != 9 || board[0].length != 9)
      return false;
    
    HashSet<String> set = new HashSet<String>();
    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        char number = board[i][j];
        if(number != '.') {
          if(!set.add(number + " column " + i) || !set.add(number + " row " + j) ||
              !set.add(number + " block " + i/3 + j/3))
            return false;
        }
      }
    }
    return true;
  }
}
