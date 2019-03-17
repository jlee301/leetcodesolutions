package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0891 {
  /*
   * https://leetcode.com/problems/sum-of-subsequence-widths/description/
   */
  public int sumSubseqWidths(int[] A) {
    // A[] = {2,1,3} -> {1,2,3}
    // for A[i], there are 2^i subsequences with A[i] as max
    // for A[i], there are 2^(n-i-1) subsequences with A[i] as min
    // eg
    // i = 0, A[0] = 1
    // 2^0 = 1 -> {1}
    // 2^(3-0-1) = 2^2 = 4 -> {1}, {1,2}, {1,2,3}, {1,3}
    //
    // i = 1, A[1] = 2
    // 2^1 = 2 -> {2}, {1,2}
    // 2^(3-1-1) = 2^1 = 2 -> {2}, {2,3}
    //
    // i = 2, A[2] = 3
    // 2^2 = 4 -> {3}, {1,2,3}, {1,3}, {2,3}
    // 2^(3-2-1) = 2^0 = 1 -> {3}
    Arrays.sort(A);
    int N = A.length;
    long MOD = 1_000_000_007;

    // Calculate the possible power of 2 variables up to 2^(N-1)
    // Done separately with MOD to avoid overflow
    long[] POW2 = new long[N];
    POW2[0] = 1;
    for(int i = 1; i < N; i++)
      POW2[i] = (POW2[i-1] * 2) % MOD;
    
    long widthSum = 0;
    for(int i = 0; i < N; i++) {
      widthSum = (widthSum + (POW2[i] * A[i])) % MOD;
      widthSum = (widthSum - (POW2[N-i-1] * A[i])) % MOD;
    }
    return (int) widthSum;
  }  
}
