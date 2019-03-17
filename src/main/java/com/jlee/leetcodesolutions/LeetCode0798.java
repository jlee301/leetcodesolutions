package com.jlee.leetcodesolutions;

public class LeetCode0798 {
  /*
   * Given an array A, we may rotate it by a non-negative integer K so that the
   * array becomes A[K], A[K+1], A{K+2], ... A[A.length - 1], A[0], A[1], ...,
   * A[K-1]. Afterward, any entries that are less than or equal to their index are
   * worth 1 point.
   * 
   * For example, if we have [2, 4, 1, 3, 0], and we rotate by K = 2, it becomes
   * [1, 3, 0, 2, 4]. This is worth 3 points because 1 > 0 [no points], 3 > 1 [no
   * points], 0 <= 2 [one point], 2 <= 3 [one point], 4 <= 4 [one point].
   * 
   * Over all possible rotations, return the rotation index K that corresponds to
   * the highest score we could receive. If there are multiple answers, return the
   * smallest such index K.
   * 
   * https://leetcode.com/problems/smallest-rotation-with-highest-score/description/
   */
  public int bestRotation(int[] A) {
    int N = A.length;
    int[] count = new int[N];
    for(int i = 0; i < N; i++) {
      count[(i-A[i]+1+N) % N]--;
      count[(i+1) % N]++;
    }
    
    int K = 0;
    int max = -N;
    int countSum = 0;
    for(int i = 0; i < N; i++) {
      countSum += count[i];
      if(countSum > max) {
        max = countSum;
        K = i;
      }
    }
    return K;
  }
}
