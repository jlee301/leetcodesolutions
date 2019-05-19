package com.jlee.leetcodesolutions;

public class LeetCode1049 {
  /*
   * https://leetcode.com/problems/last-stone-weight-ii/
   */
  public int lastStoneWeightII(int[] stones) {
    return dfs(stones, 0, 0, new Integer[stones.length][6000]);
  }
  
  private int dfs(int[] stones, int pos, int sum, Integer[][] memo) {
    // {1,12,25,100}
    // If the running sum is negative, we make the return invalid by returning the max stone size (100)
    // We do this because we know out of the whole array, the smallest weight will be between [0 - 100]
    if(pos == stones.length)
      return sum < 0 ? 100 : sum;
    
    if(memo[pos][sum + 3000] != null)
      return memo[pos][sum + 3000];
    
    memo[pos][sum + 3000] = Math.min(dfs(stones, pos+1, sum - stones[pos], memo), dfs(stones, pos+1, sum + stones[pos], memo));
    return memo[pos][sum + 3000];
  }
}
