package com.jlee.leetcodesolutions;

public class LeetCode639 {
  /*
   * A message containing letters from A-Z is being encoded to numbers using the
   * following mapping way:
   * 'A' -> 1
   * 'B' -> 2
   * ...
   * 'Z' -> 26
   * 
   * Beyond that, now the encoded string can also contain the character '*', which
   * can be treated as one of the numbers from 1 to 9.
   * 
   * Given the encoded message containing digits and the character '*', return the
   * total number of ways to decode it.
   * 
   * Also, since the answer may be very large, you should return the output mod
   * 10^9 + 7.
   * 
   * https://leetcode.com/problems/decode-ways-ii/description/
   */
  public int numDecodings(String s) {
    int MOD = 1000000007;
    int N = s.length();
    
    // dp[i+1] = number of possible ways to decode up to s[i]
    // Base case is filling in result of the first digit
    long[] dp = new long[N+1];
    dp[0] = 1;
    dp[1] = s.charAt(0) == '*' ? 9 : s.charAt(0) == '0' ? 0 : 1; 
    
    for(int i = 1; i < N; i++) {
      char curr = s.charAt(i);
      char prev = s.charAt(i-1);
      if(curr == '*') {
        // If you treat the curr digit as a standalone, it will be 9 times the previous
        // possible combination
        dp[i+1] = (9 * dp[i]) % MOD;
        
        // Not treating as standalone
        if(prev == '1') {
          // Your possible combinations are then 11 - 19
          dp[i+1] = (dp[i+1] + 9 * dp[i-1]) % MOD;
        }
        else if(prev == '2') {
          // Your possible combinations are 21 - 26
          dp[i+1] = (dp[i+1] + 6 * dp[i-1]) % MOD;
        }
        else if(prev == '*') {
          // Your possible combinations are 11 - 26 (excluding 20)
          dp[i+1] = (dp[i+1] + 15 * dp[i-1]) % MOD;
        }
      }
      
      else {
        dp[i+1] = curr == '0' ? 0 : dp[i];
        if(prev == '1') {
          dp[i+1] = (dp[i+1] + dp[i-1]) % MOD;
        }
        else if(prev == '2' && curr <= '6') {
          dp[i+1] = (dp[i+1] + dp[i-1]) % MOD;
        }
        else if(prev == '*') {
          // Your choices are either going to be:
          // 1. [11,21] [12,22] [13,23] [14,24] [15,25] [16,26]
          // 2. 17, 18, 19
          dp[i+1] = (dp[i+1] + (curr <= '6' ? 2 : 1) * dp[i-1]) % MOD;
        }
      }
    }
    return (int) dp[N];
  }
}
