package com.jlee.leetcodesolutions;

public class LeetCode0982 {
  /*
   * https://leetcode.com/problems/triples-with-bitwise-and-equal-to-zero/
   */
  public int countTriplets(int[] A) {
    // 000 <--- when i,j,k are the same +1
    //
    // 001 <--- when i==j || j==k || i==k (two are the same) +3
    // 010
    // 100
    //
    // 012 <--- when i,j,k are all different +6
    // 021
    // 102
    // 120
    // 201
    // 210
    int result = 0;
    int N = A.length;
    for(int i = 0; i < N; i++) {
      for(int j = i; j < N; j++) {
        for(int k = j; k < N; k++) {
          if((A[i] & A[j] & A[k]) == 0) {
            if(i == j && j == k)
              result++;
            else if(i == j || j == k)
              result += 3;
            else
              result += 6;
          }
        }
      }
    }
    return result;
  }
}
