package com.jlee.leetcodesolutions;

public class LeetCode0794 {
  /*
   * A Tic-Tac-Toe board is given as a string array board. Return True if and only
   * if it is possible to reach this board position during the course of a valid
   * tic-tac-toe game.
   * 
   * The board is a 3 x 3 array, and consists of characters " ", "X", and "O". The
   * " " character represents an empty square.
   * 
   * Here are the rules of Tic-Tac-Toe:
   * 1. Players take turns placing characters into empty squares (" ").
   * 2. The first player always places "X" characters, while the second player
   * always places "O" characters.
   * 3. "X" and "O" characters are always placed into empty squares, never filled
   * ones.
   * 4. The game ends when there are 3 of the same (non-empty) character filling
   * any row, column, or diagonal.
   * 5. The game also ends if all squares are non-empty.
   * 6. No more moves can be played if the game is over.
   * 
   * Note:
   * 1. board is a length-3 array of strings, where each string board[i] has
   * length 3.
   * 2. Each board[i][j] is a character in the set {" ", "X", "O"}.
   * 
   * https://leetcode.com/problems/valid-tic-tac-toe-state/description/
   */
  public boolean validTicTacToe(String[] board) {
    // Count X's and O's
    // count[0] = count of X's
    // count[1] = count of O's
    int[] count = new int[2];
    for(String row : board) {
      for(int i = 0; i < row.length(); i++) {
        if(row.charAt(i) == 'X')
          count[0]++;
        if(row.charAt(i) == 'O')
          count[1]++;
      }
    }
    // Invalid number of plays on the board
    // 1. More O's than X's
    // 2. More than 1 X's than O's
    if(count[0] - count[1] < 0 || count[0] - count[1] > 1)
      return false;
    
    // There should not be more than one set of winners
    // winner[0] = three connect X count
    // winner[1] = three connect O count
    int[] winner = new int[2];
    // Check horizontals
    for(String row : board) {
      if(row.equals("XXX"))
        winner[0]++;
      if(row.equals("OOO"))
        winner[1]++;
    }

    // Check verticals
    for(int i = 0; i < 3; i++) {
      StringBuilder sb = new StringBuilder();
      String result = "";
      for(int j = 0; j < 3; j++)
        sb.append(board[j].charAt(i));
      result = sb.toString();
      if(result.equals("XXX"))
        winner[0]++;
      if(result.equals("OOO"))
        winner[1]++;
    }
    // Check Diagonals
    StringBuilder sb = new StringBuilder();
    String result = "";
    sb.append("" + board[0].charAt(0) + board[1].charAt(1) + board[2].charAt(2));
    result = sb.toString();
    if(result.equals("XXX"))
      winner[0]++;
    if(result.equals("OOO"))
      winner[1]++;
    
    sb = new StringBuilder();
    sb.append("" + board[0].charAt(2) + board[1].charAt(1) + board[2].charAt(0));
    result = sb.toString();
    if(result.equals("XXX"))
      winner[0]++;
    if(result.equals("OOO"))
      winner[1]++;
    
    // Cannot have multiple winners
    if(winner[0] > 0 && winner[1] > 0)
      return false;
    
    // If X won, it should have one more move than O's
    if(winner[0] > 0 && count[0] - count[1] != 1)
      return false;
    
    // If O won, it should have equal moves to X's
    if(winner[1] > 0 && count[0] - count[1] != 0)
      return false;
    
    return true;
  }
}
