package com.jlee.leetcodesolutions;

public class LeetCode0879 {
  /*
   * There are G people in a gang, and a list of various crimes they could commit.
   * 
   * The i-th crime generates a profit[i] and requires group[i] gang members to
   * participate.
   * 
   * If a gang member participates in one crime, that member can't participate in
   * another crime.
   * 
   * Let's call a profitable scheme any subset of these crimes that generates at
   * least P profit, and the total number of gang members participating in that
   * subset of crimes is at most G.
   * 
   * How many schemes can be chosen? Since the answer may be very large, return it
   * modulo 10^9 + 7.
   * 
   * https://leetcode.com/problems/profitable-schemes/description/
   */
  private int G;
  private int P;
  private int[] group;
  private int[] profit;
  private int N;
  private int MOD = 1000000007;
  private Integer[][][] memo;
  
  public int profitableSchemes(int G, int P, int[] group, int[] profit) {
    this.G = G;
    this.P = P;
    this.group = group;
    this.profit = profit;
    this.N = group.length;
    
    // memo = new Integer[G+1][100*100+1][N+1];
    memo = new Integer[G+1][P+1][N+1];
    return helper(0, 0, 0);
  }
  
  private int helper(int currG, int currP, int pos) {
    if(pos == N)
      return 0;
    
    int minP = Math.min(currP, P);
    if(memo[currG][minP][pos] != null)
      return memo[currG][minP][pos];
    
    int count = 0;
    if(currG + group[pos] <= G) {
      if(currP + profit[pos] >= P) {
        count = (count + 1) % MOD;
      }
      // Can you add the next job with current job(s)
      count = (count + helper(currG + group[pos], currP + profit[pos], pos+1)) % MOD;
    }
    // Check next job without adding current job
    count = (count + helper(currG, currP, pos+1)) % MOD;
    
    memo[currG][minP][pos] = count;
    return count;
  }
}
