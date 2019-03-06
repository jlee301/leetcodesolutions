package com.jlee.leetcodesolutions;

public class LeetCode1000 {
  /*
   * https://leetcode.com/problems/minimum-cost-to-merge-stones/
   */
  public int mergeStones(int[] stones, int K) {
    int N = stones.length;
    if((N - 1) % (K - 1) != 0)
      return -1;

    return dfs(stones, 0, N, K - 1, K, new Integer[N+1][N+1][K+1]);
  }

  private int dfs(int[] stones, int start, int end, int rem, int K, Integer[][][] memo) {
    if(end - start == 1)
      return 0;
    if(rem == 0)
      rem = K - 1;
    
    if(memo[start][end][rem] == null) {
      int sum = 0;
      for(int i = start; i < end; i++)
        sum += stones[i];

      int min = Integer.MAX_VALUE;
      for(int i = start; i < end - 1; i++) {
        // check to see if the segments can create valid piles
        if((i != start) && (i - start) % (K - 1) != 0)
          continue;

        int leftCost = dfs(stones, start, i + 1, K - 1, K, memo);
        int rightCost = dfs(stones, i + 1, end, rem - 1, K, memo);
        int tmp = leftCost + rightCost;
        if(rem == K - 1)
          tmp += sum;
        
        min = Math.min(min, tmp);
      }
      memo[start][end][rem] = min;
    }
    return memo[start][end][rem];
  }
}
