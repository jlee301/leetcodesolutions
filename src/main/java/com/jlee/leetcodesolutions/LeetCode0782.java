package com.jlee.leetcodesolutions;

public class LeetCode0782 {
  /*
   * An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows
   * with each other, or any 2 columns with each other.
   * 
   * What is the minimum number of moves to transform the board into a
   * "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If
   * the task is impossible, return -1.
   * 
   * Note:
   * 1. board will have the same number of rows and columns, a number in the range
   * [2, 30].
   * 2. board[i][j] will be only 0s or 1s.
   * 
   * https://leetcode.com/problems/transform-to-chessboard/description/
   */
  public int movesToChessboard(int[][] board) {
    int N = board.length;
    int rs = 0, cs = 0, rm = 0, cm = 0;
    
    // each row should be either the same as the first or the exact inverse ie:
    // 0110
    // 0110
    // 1001
    // therefore, any rectangle on the board with corners top left, top right,
    // bottom left, bottom right must either be 4 zeroes or 2 ones 2 zeroes or 4 ones
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        // board[0][0] top left
        // board[0][j] top right
        // board[i][0] bottom left
        // board[i][j] bottom right
        if((board[0][0] ^ board[0][j] ^ board[i][0] ^ board[i][j]) == 1)
          return -1;
      }
    }
    
    for(int i = 0; i < N; i++) {
      // sum how many ones are in row and col
      rs += board[0][i];
      cs += board[i][0];
      
      // see how much of the first row and col match 0101
      if(board[i][0] == i % 2)
        rm++;
      if(board[0][i] == i % 2)
        cm++;
    }
    
    // You either should have N/2 or N+1 / 2 ones
    if(rs < N/2 || rs > (N+1)/2)
      return -1;
    if(cs < N/2 || cs > (N+1)/2)
      return -1;
    
    if(N % 2 == 1) {
      // N odd, take the even swaps
      if(rm % 2 == 1) rm = N - rm;
      if(cm % 2 == 1) cm = N - cm;
    }
    else {
      // N even, take the minimum swaps, because both are possible
      rm = Math.min(rm, N - rm);
      cm = Math.min(cm, N - cm);
    }
    
    return (rm+cm) / 2;
  }
}
