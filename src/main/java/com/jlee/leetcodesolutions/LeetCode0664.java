package com.jlee.leetcodesolutions;

public class LeetCode0664 {
  /*
   * There is a strange printer with the following two special requirements:
   * 1. The printer can only print a sequence of the same character each time.
   * 2. At each turn, the printer can print new characters starting from and
   * ending at any places, and will cover the original existing characters.
   * 
   * Given a string consists of lower English letters only, your job is to count
   * the minimum number of turns the printer needed in order to print it.
   * 
   * https://leetcode.com/problems/strange-printer/description/
   */
  public int strangePrinter(String s) {
    int N = s.length();
    return strangePrinter(s, 0, N-1, new int[N][N]);
  }
  
  private int strangePrinter(String s, int i, int j, int[][] memo) {
    if(i > j) 
      return 0;
    
    if(memo[i][j] != 0)
      return memo[i][j];
    
    // 1. If the turn is writing s[i] through [i+1 : j]
    // s = abc --> aaa
    int ans = strangePrinter(s, i+1, j, memo) + 1;
    for(int k = i+1; k <= j; k++) {
      if(s.charAt(i) == s.charAt(k)) {
        ans = Math.min(ans, strangePrinter(s, i, k-1, memo) + strangePrinter(s, k+1, j, memo));
        // if s[i] exist already @ s[k] (ie no need to rewrite in this position)
        // This check is to see if it's possible to use less turns by acknowledging
        // 2. writing s[i] through [i+1 : k-1] + 
        // 3. writing s[k+1] through [k+2 : j] 
        // Take the min(1, 2+3)
      }
    }
    memo[i][j] = ans;
    return ans;
  }
}
