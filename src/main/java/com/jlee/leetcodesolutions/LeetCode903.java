package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode903 {
  /*
   * We are given S, a length n string of characters from the set {'D', 'I'}.
   * (These letters stand for "decreasing" and "increasing".)
   * 
   * A valid permutation is a permutation P[0], P[1], ..., P[n] of integers {0, 1,
   * ..., n}, such that for all i:
   * 1. If S[i] == 'D', then P[i] > P[i+1], and;
   * 2. If S[i] == 'I', then P[i] < P[i+1].
   * 
   * How many valid permutations are there? Since the answer may be large, return
   * your answer modulo 10^9 + 7.
   * 
   * https://leetcode.com/problems/valid-permutations-for-di-sequence/description/
   */
  private int MOD = 1_000_000_007;
  
  public int numPermsDISequence(String S) {
    int N = S.length();
    Long[][] memo = new Long[N+1][N+1];
    HashSet<Integer> set = new HashSet<>();
    long result = 0;
    for(int i = 0; i <= N; i++) {
      set.add(i);
      result = (result + helper(S, N, 0, i, i, memo, set)) % MOD;
      set.remove(i);
    }
    return (int) result;
  }
  
  private long helper(String S, int N, int strIdx, int relativeIdx, int num, Long[][] memo, HashSet<Integer> set) {
    if(strIdx == N)
      return 1;
    
    if(memo[strIdx][relativeIdx] != null)
      return memo[strIdx][relativeIdx];
    
    int relative = -1;
    long result = 0;
    char ch = S.charAt(strIdx);
    for(int i = 0; i <= N; i++) {
      if(!set.contains(i)) {
        relative++;
        if((ch == 'D' && i < num) || (ch == 'I' && i > num)) {
          set.add(i);
          result = (result + helper(S, N, strIdx+1, relative, i, memo, set)) % MOD;
          set.remove(i);
        }
      }
    }
    memo[strIdx][relativeIdx] = result;
    return result;
  }
}
