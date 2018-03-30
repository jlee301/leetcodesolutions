package com.jlee.leetcodesolutions;

public class LeetCode419 {
  /*
   * Given an 2D board, count how many battleships are in it. The battleships are
   * represented with 'X's, empty slots are represented with '.'s. You may assume
   * the following rules:
   * 1. You receive a valid board, made of only battleships or empty slots.
   * 2. Battleships can only be placed horizontally or vertically. In other words,
   * they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1
   * column), where N can be of any size.
   * 3. At least one horizontal or vertical cell separates between two battleships -
   * there are no adjacent battleships.
   * 
   * https://leetcode.com/problems/battleships-in-a-board/description/
   */
  public int countBattleships(char[][] board) {
    if(board == null || board.length == 0 || board[0].length == 0)
      return 0;
    
    int result = 0;
    boolean[][] checked = new boolean[board.length][board[0].length];
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[i].length; j++) {
        if(!checked[i][j] && board[i][j] == 'X') {
          result++;
          markRight(board, checked, i, j+1);
          markDown(board, checked, i+1, j);
        }
      }
    }
    return result;
  }
  
  private void markRight(char[][] board, boolean [][] checked, int i, int j) {
    if(j > board[i].length-1)
      return;
    checked[i][j] = true;
    if(board[i][j] == 'X')
      markRight(board, checked, i, j+1);
  }

  private void markDown(char[][] board, boolean [][] checked, int i, int j) {
    if(i > board.length-1)
      return;
    checked[i][j] = true;
    if(board[i][j] == 'X')
      markDown(board, checked, i+1, j);
  }
}
