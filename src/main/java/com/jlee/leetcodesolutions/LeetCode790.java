package com.jlee.leetcodesolutions;

public class LeetCode790 {
  /*
   * We have two types of tiles: a 2x1 domino shape, and an "L" tromino shape.
   * These shapes may be rotated.
   * 
   * Given N, how many ways are there to tile a 2 x N board? Return your answer
   * modulo 10^9 + 7.
   * 
   * (In a tiling, every square must be covered by a tile. Two tilings are
   * different if and only if there are two 4-directionally adjacent cells on the
   * board such that exactly one of the tilings has both squares occupied by a
   * tile.)
   * 
   * https://leetcode.com/problems/domino-and-tromino-tiling/description/
   */
  private static final int MOD = 1000000007;

  public int numTilings(int N) {
    if(N == 0) return 0;
    if(N == 1) return 1;
    int[] dp = new int[N+1];
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    // dp[3] = 5
    // dp[4] = 11
    // dp[5] = 24
    // dp[6] = 53
    
    for(int i = 3; i <= N; i++)
      dp[i] = ((2*dp[i-1] % MOD) + (dp[i-3] % MOD)) % MOD;
    
    return dp[N];
  }
}
