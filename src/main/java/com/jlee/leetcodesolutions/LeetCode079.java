package com.jlee.leetcodesolutions;

public class LeetCode079 {
  /*
   * Given a 2D board and a word, find if the word exists in the grid.
   * 
   * The word can be constructed from letters of sequentially adjacent cell, where
   * "adjacent" cells are those horizontally or vertically neighboring. The same
   * letter cell may not be used more than once.
   * 
   * For example, Given board =
   * [ ['A','B','C','E'], 
   *   ['S','F','C','S'], 
   *   ['A','D','E','E'] ]
   * 
   * word = "ABCCED", -> returns true,
   * word = "SEE", -> returns true,
   * word = "ABCB", -> returns false.
   * 
   * https://leetcode.com/problems/word-search/description/
   */
  public boolean exist(char[][] board, String word) {
    if(board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0)
      return false;
    
    boolean[][] check = new boolean[board.length][board[0].length];
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[i].length; j++) {
        if(exist(board, word, check, i, j, 0))
          return true;
      }
    }
    return false;
  }
  
  private boolean exist(char[][] board, String word, boolean[][] check, int i, int j, int pos) {
    if(i < 0 || i > board.length-1 || j < 0 || j > board[0].length-1 || check[i][j]
        || word.charAt(pos) != board[i][j])
      return false;
    
    check[i][j] = true;
    pos++;
    if(pos < word.length()) {
      boolean exist = exist(board, word, check, i-1, j, pos) || exist(board, word, check, i+1, j, pos)
          || exist(board, word, check, i, j-1, pos) || exist(board, word, check, i, j+1, pos);
      check[i][j] = false;
      return exist;
    }
    return true;
  }
}
