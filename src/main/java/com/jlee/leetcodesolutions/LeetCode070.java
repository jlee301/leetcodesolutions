package com.jlee.leetcodesolutions;

public class LeetCode070 {
  /*
   * You are climbing a stair case. It takes n steps to reach to the top. Each
   * time you can either climb 1 or 2 steps. In how many distinct ways can you
   * climb to the top?
   * 
   * Note: Given n will be a positive integer.
   * 
   * Input: 2
   * Output:  2
   * Explanation:  There are two ways to climb to the top.
   * 1. 1 step + 1 step
   * 2. 2 step
   * 
   * Input: 3
   * Output:  3
   * Explanation:  There are three ways to climb to the top.
   * 1. 1 step + 1 step + 1 step
   * 2. 1 step + 2 step
   * 3. 2 step + 1 step
   * 
   * https://leetcode.com/problems/climbing-stairs/discuss/
   * 
   */
  public int climbStairs(int n) {
    // input: 0, output 0
    // input: 1, output 1
    // input: 2, output 2
    // input: 3, output 3
    //
    // input: 4, output 5
    // 1 step + 1 step + 1 step + 1 step
    // 1 step + 1 step + 2 step
    // 1 step + 2 step + 1 step
    // 2 step + 1 step + 1 step
    // 2 step + 2 step
    // This is a fibonacci sequence

    // Base cases
    if(n == 0)
      return 0;
    if(n == 1)
      return 1;
    if(n == 2)
      return 2;
    
    // dp[i] = number of distinct steps to reach step i
    int[] dp = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3; i <= n; i++)
      dp[i] = dp[i-2] + dp[i-1];
    
    return dp[n];
  }
}
