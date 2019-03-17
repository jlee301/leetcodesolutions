package com.jlee.leetcodesolutions;

public class LeetCode0289 {
  /*
   * Given a board with m by n cells, each cell has an initial state live (1) or
   * dead (0). Each cell interacts with its eight neighbors (horizontal, vertical,
   * diagonal) using the following four rules (taken from the Wikipedia article):
   * 1. Any live cell with fewer than two live neighbors dies, as if caused by
   * under-population.
   * 2. Any live cell with two or three live neighbors lives on to the next
   * generation.
   * 3. Any live cell with more than three live neighbors dies, as if by
   * over-population..
   * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if
   * by reproduction.
   * 
   * Write a function to compute the next state (after one update) of the board
   * given its current state.
   * 
   * https://leetcode.com/problems/game-of-life/description/
   */
  public void gameOfLife(int[][] board) {
    if(board == null || board.length == 0 || board[0].length == 0)
      return;
    
    // Make a clone of the board to keep track of original values.
    int[][] clone = new int[board.length][];
    for(int i = 0; i < board.length; i++)
      clone[i] = board[i].clone();
      
    for(int i = 0; i < clone.length; i++) {
      for(int j = 0; j < clone[i].length; j++) {
        // Check all eight neighbors
        int liveNeighbors = liveNeighbor(clone, i - 1, j - 1) + liveNeighbor(clone, i - 1, j)
            + liveNeighbor(clone, i - 1, j + 1) + liveNeighbor(clone, i, j + 1) + liveNeighbor(clone, i + 1, j + 1)
            + liveNeighbor(clone, i + 1, j) + liveNeighbor(clone, i + 1, j - 1) + liveNeighbor(clone, i, j - 1);
        // Over/under population
        if(clone[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3))
          board[i][j] = 0;
        // Dead cell reproduction
        if(clone[i][j] == 0 && liveNeighbors == 3)
          board[i][j] = 1;
      }
    }
  }
  
  private int liveNeighbor(int[][] board, int row, int col) {
    if(row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1 || board[row][col] == 0)
      return 0;
    return 1;
  }
}
