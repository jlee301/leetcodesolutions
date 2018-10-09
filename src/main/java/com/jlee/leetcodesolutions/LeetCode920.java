package com.jlee.leetcodesolutions;

public class LeetCode920 {
  /*
   * Your music player contains N different songs and she wants to listen to L
   * (not necessarily different) songs during your trip. You create a playlist so
   * that:
   * 1. Every song is played at least once
   * 2. A song can only be played again only if K other songs have been played
   * 
   * Return the number of possible playlists. As the answer can be very large,
   * return it modulo 10^9 + 7.
   * 
   * https://leetcode.com/problems/number-of-music-playlists/description/
   */
  public int numMusicPlaylists(int N, int L, int K) {
    long MOD = 1_000_000_007;
    long[][] dp = new long[L+1][N+1];
    dp[0][0] = 1L;
    
    for(int i = 1; i <= L; i++) {
      for(int j = 1; j <= N; j++) {
        // Last song was new to the playlist
        dp[i][j] += dp[i-1][j-1] * (N-j+1);     
        // Last song was a repeat
        dp[i][j] += dp[i-1][j] * Math.max(j-K, 0);
        dp[i][j] %= MOD;
      }
    }
    return (int) dp[L][N];
  }
}
