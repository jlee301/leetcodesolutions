package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0995 {
  /*
   * https://leetcode.com/contest/weekly-contest-124/problems/minimum-number-of-k-consecutive-bit-flips/
   */
  public int minKBitFlips(int[] A, int K) {
    // When K == 1, just return the number of 0 bits
    if(K == 1) {
      int sum = Arrays.stream(A).sum();
      return A.length - sum;
    }
    
    return dfs(A, K, 0, 0);
  }
  
  private int dfs(int[] A, int K, int pos, int count) {
    if(pos == A.length)
      return count;
    
    if(A[pos] == 0) {
      // Will not be able to change the next K bits
      if(pos+K-1 >= A.length)
        return -1;
      
      // Flip next K bits
      for(int i = 0; i < K; i++)
        A[pos+i] = A[pos+i] == 0 ? 1 : 0;
      
      return dfs(A, K, pos+1, count+1);
    }
    else {
      return dfs(A, K, pos+1, count);
    }
  }
}
