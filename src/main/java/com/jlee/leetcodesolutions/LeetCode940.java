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
    int count = 0;
    
    // dp[i] = the number of distinct subsequences ending with S[i]
    // Base case for dp[i] == 1 for substring S[0:i]
    int N = S.length();
    int[] dp = new int[N];
    Arrays.fill(dp, 1);
    
    // Calculate how many distinct subsequences ending with S[i]
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < i; j++) {
        // Avoid doubling counts
        if(S.charAt(i) == S.charAt(j))
          continue;
        
        dp[i] = (dp[i] + dp[j]) % MOD;
      }
      count = (count + dp[i]) % MOD;
    }
    return count;
  }
}
