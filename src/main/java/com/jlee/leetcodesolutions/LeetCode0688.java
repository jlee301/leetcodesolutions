package com.jlee.leetcodesolutions;

public class LeetCode0688 {
  /*
   * On an NxN chessboard, a knight starts at the r-th row and c-th column and
   * attempts to make exactly K moves. The rows and columns are 0 indexed, so the
   * top-left square is (0, 0), and the bottom-right square is (N-1, N-1).
   * 
   * A chess knight has 8 possible moves it can make, as illustrated below. Each
   * move is two squares in a cardinal direction, then one square in an orthogonal
   * direction.
   * 
   * 
   * Each time the knight is to move, it chooses one of eight possible moves
   * uniformly at random (even if the piece would go off the chessboard) and moves
   * there.
   * 
   * The knight continues moving until it has made exactly K moves or has moved
   * off the chessboard. Return the probability that the knight remains on the
   * board after it has stopped moving.
   * 
   * https://leetcode.com/problems/knight-probability-in-chessboard/description/
   */
  public double knightProbability(int N, int K, int r, int c) {
    return knightProbability(N, K, r, c, new double[N][N][K+1]);
  }
  
  public double knightProbability(int N, int K, int r, int c, double[][][] memo) {
    if(r < 0 || r > N-1 || c < 0 || c > N-1)
      // Out of bounds
      return 0;
    if(K == 0)
      // Still on the board
      return 1;
    if(memo[r][c][K] > 0)
      return memo[r][c][K];
    
    // Eight possible moves from the knight
    int[][] moves = { {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, -1}, {2, 1}, {-1, -2}, {1, -2} };
    double sum = 0.0;
    for(int[] move : moves)
      sum += knightProbability(N, K-1, r+move[0], c+move[1], memo);
    
    memo[r][c][K] = sum / 8;
    return memo[r][c][K];
  }
}
