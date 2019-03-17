package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0935 {
  /*
   * https://leetcode.com/contest/weekly-contest-109/problems/knight-dialer/
   */
  private static final int MOD = 1_000_000_007;
  public int knightDialer(int N) {
    // Map all possible Knight moves
    HashMap<Integer,int[]> map = new HashMap<>();
    map.put(0, new int[] {4,6});
    map.put(1, new int[] {6,8});
    map.put(2, new int[] {7,9});
    map.put(3, new int[] {4,8});
    map.put(4, new int[] {0,3,9});
    map.put(5, new int[] {});
    map.put(6, new int[] {0,1,7});
    map.put(7, new int[] {2,6});
    map.put(8, new int[] {1,3});
    map.put(9, new int[] {2,4});
    
    int count = 0;
    Integer[][] memo = new Integer[N][10];
    for(int i = 0; i <= 9; i++) {
      count = (count + helper(N-1, i, map, memo)) % MOD;
    }
    return count;
  }
  
  private int helper(int N, int node, HashMap<Integer,int[]> map, Integer[][] memo) {
    // Base case
    if(N == 0)
      return 1;
    
    if(memo[N][node] != null)
      return memo[N][node];
    
    int count = 0;
    for(int next : map.get(node)) {
      count = (count + helper(N-1, next, map, memo)) % MOD;
    }
    
    memo[N][node] = count;
    return count;
  }
}
