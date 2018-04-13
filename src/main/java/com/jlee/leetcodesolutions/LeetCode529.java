package com.jlee.leetcodesolutions;

public class LeetCode529 {
  /*
   * You are given a 2D char matrix representing the game board. 'M' represents an
   * unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a
   * revealed blank square that has no adjacent (above, below, left, right, and
   * all 4 diagonals) mines, digit ('1' to '8') represents how many mines are
   * adjacent to this revealed square, and finally 'X' represents a revealed mine.
   * 
   * Now given the next click position (row and column indices) among all the
   * unrevealed squares ('M' or 'E'), return the board after revealing this
   * position according to the following rules:
   * 1. If a mine ('M') is revealed, then the game is over - change it to 'X'.
   * 2. If an empty square ('E') with no adjacent mines is revealed, then change
   * it to revealed blank ('B') and all of its adjacent unrevealed squares should
   * be revealed recursively.
   * 3. If an empty square ('E') with at least one adjacent mine is revealed, then
   * change it to a digit ('1' to '8') representing the number of adjacent mines.
   * 4. Return the board when no more squares will be revealed.
   * 
   * https://leetcode.com/problems/minesweeper/description/
   */
  public char[][] updateBoard(char[][] board, int[] click) {
    if(board[click[0]][click[1]] == 'M') {
      // The click was on a mine, immediate completion.
      board[click[0]][click[1]] = 'X';
      return board;
    }
    calculateBoard(board, click[0], click[1]);
    return board;
  }
  
  private void calculateBoard(char[][] board, int row, int col) {
    if(row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1 || board[row][col] != 'E')
      return;
    
    int val = countMines(board, row, col);
    if(val == 0) {
      board[row][col] = 'B';
      // Check all eight surrounding
      calculateBoard(board, row-1, col);
      calculateBoard(board, row-1, col+1);
      calculateBoard(board, row, col+1);
      calculateBoard(board, row+1, col+1);
      calculateBoard(board, row+1, col);
      calculateBoard(board, row+1, col-1);
      calculateBoard(board, row, col-1);
      calculateBoard(board, row-1, col-1);
    }
    else
      board[row][col] = (char)('0' + val);
  }
  
  private int countMines(char[][] board, int row, int col) {
    int count = 0;
    for(int i = -1; i < 2; i++) {
      for(int j = -1; j < 2; j++) {
        int r = row + i;
        int c = col + j;
        if(r < 0 || r > board.length-1 || c < 0 || c > board[0].length-1) continue;
        if(board[r][c] == 'M') count++;
      }
    }
    return count;
  }
}
