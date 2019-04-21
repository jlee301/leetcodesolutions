package com.jlee.leetcodesolutions;

public class LeetCode1029 {
  /*
   * https://leetcode.com/contest/weekly-contest-133/problems/two-city-scheduling/ 
   */
  private int N;
  
  public int twoCitySchedCost(int[][] costs) {
    N = costs.length;
    Integer[][][] memo = new Integer[N+1][N/2 + 1][N/2 + 1];
    return dfs(costs, 0, N/2, N/2, memo);
  }
  
  private int dfs(int[][] costs, int pos, int A, int B, Integer[][][] memo) {
    if(pos == N)
      return 0;
    
    if(memo[pos][A][B] != null)
      return memo[pos][A][B];
    
    int localA = Integer.MAX_VALUE, localB = Integer.MAX_VALUE;
    if(A > 0)
      localA = costs[pos][0] + dfs(costs, pos+1, A-1, B, memo);
    
    if(B > 0)
      localB = costs[pos][1] + dfs(costs, pos+1, A, B-1, memo);
    
    memo[pos][A][B] = Math.min(localA, localB);
    return memo[pos][A][B];
  }
}
