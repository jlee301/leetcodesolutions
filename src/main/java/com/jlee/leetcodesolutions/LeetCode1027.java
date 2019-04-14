package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1027 {
  /*
   * https://leetcode.com/problems/longest-arithmetic-sequence/
   */
  public int longestArithSeqLength(int[] A) {
    if(A.length < 3)
      return A.length;
    
    int max = 0;
    HashMap<Integer,HashMap<Integer,Integer>> memo = new HashMap<>();
    for(int i = 0; i < A.length; i++)
      memo.put(i, new HashMap<>());
    
    for(int i = 0; i < A.length-1; i++)
      max = Math.max(max, dfs(A, i, Integer.MIN_VALUE, memo));
    
    return max;
  }
  
  private int dfs(int[] A, int pos, int diff, HashMap<Integer,HashMap<Integer,Integer>> memo) {
    // if(memo.get(pos).containsKey(diff))
    //   return memo.get(pos).get(diff);
    
    int len = 0;
    if(diff == Integer.MIN_VALUE) {
      // first comparison
      for(int i = pos+1; i < A.length; i++)
        len = Math.max(len, 2+dfs(A, i, A[i] - A[pos], memo));
    }
    else {
      for(int i = pos+1; i < A.length; i++) {
        if(diff == A[i] - A[pos])
          len = Math.max(len, 1+dfs(A, i, diff, memo));
      }
    }
    // memo.get(pos).put(diff, len);
    return len;
  }
}
