package com.jlee.leetcodesolutions;

public class LeetCode130 {
  /*
   * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions
   * surrounded by 'X'.
   * 
   * A region is captured by flipping all 'O's into 'X's in that surrounded
   * region.
   * 
   * For example, 
   * X X X X 
   * X O O X 
   * X X O X 
   * X O X X 
   * 
   * After running your function, the board should be:
   * X X X X 
   * X X X X 
   * X X X X 
   * X O X X
   * 
   * https://leetcode.com/problems/surrounded-regions/description/
   */
  public void solve(char[][] board) {
    if(board == null || board.length == 0 || board[0].length == 0)
      return;
    
    // check is to keep track of all 'O' that are connected to another '0' that is
    // on the border of the board.
    boolean[][] check = new boolean[board.length][board[0].length];
    for(int j = 0; j < board[0].length; j++)
      solveHelper(board, check, 0, j); // first row
    
    if(board.length-1 != 0)
      for(int j = 0; j < board[board.length-1].length; j++)
        solveHelper(board, check, board.length-1, j); // last row
    
    for(int i = 0; i < board.length; i++)
      solveHelper(board, check, i, 0); // first col
    
    if(board[0].length-1 != 0)
      for(int i = 0; i < board.length; i++)
        solveHelper(board, check, i, board[0].length-1); // last col
    
    for(int i = 1; i < board.length-1; i++) {
      for(int j = 1; j < board[i].length-1; j++) {
        if(board[i][j] == 'O' && !check[i][j])
          board[i][j] = 'X';
      }
    }
  }
  
  private void solveHelper(char[][] board, boolean[][] check, int i, int j) {
    if(i < 0 || i > board.length-1 || j < 0 || j > board[i].length-1 || check[i][j] || board[i][j] == 'X')
      return;
    
    check[i][j] = true;
    solveHelper(board, check, i-1, j);
    solveHelper(board, check, i+1, j);
    solveHelper(board, check, i, j-1);
    solveHelper(board, check, i, j+1);    
  }
}
