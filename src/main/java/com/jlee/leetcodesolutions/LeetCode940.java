package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode940 {
  /*
   * Given a string S, count the number of distinct, non-empty subsequences of S .
   * 
   * Since the result may be large, return the answer modulo 10^9 + 7.
   * 
   * https://leetcode.com/problems/distinct-subsequences-ii/
   */
  public int distinctSubseqII(String S) {
    int MOD = 1_000_000_007;
    
    // dp[k+1] = the number of distinct subsequences containing S[0], S[1], ... S[k]
    int N = S.length();
    int[] dp = new int[N+1];
    dp[0] = 1; // base case is empty string ""

    // prev[S[k] - 'a'] == index of the previous time char S[k] was processed
    // This is to be used to avoid doubling the counts
    int[] prev = new int[26];
    Arrays.fill(prev, -1);
    
    for(int i = 0; i < N; i++) {
      int idx = S.charAt(i) - 'a';
      dp[i+1] = (dp[i] * 2) % MOD;
      
      // check if ch been processed before to avoid doubling counts
      if(prev[idx] != -1)
        dp[i+1] = (dp[i+1] - dp[prev[idx]]) % MOD;
      
      prev[idx] = i;
    }
    // Removing empty space count
    dp[N]--;
    return dp[N] < 0 ? dp[N] + MOD : dp[N];
  }
}
