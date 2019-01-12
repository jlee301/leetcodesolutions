package com.jlee.leetcodesolutions;

public class LeetCode509 {
  /*
   * https://leetcode.com/problems/fibonacci-number/
   */
  public int fib(int N) {
    // Base cases
    if(N == 0)
      return 0;
    
    if(N == 1)
      return 1;
    
    int[] dp = new int[N+1];
    dp[0] = 0;
    dp[1] = 1;
    
    for(int i = 2; i <= N; i++)
      dp[i] = dp[i-1] + dp[i-2];
    
    return dp[N];
  }
}
