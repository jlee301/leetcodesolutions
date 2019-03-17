package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0910 {
  /*
   * Given an array A of integers, for each integer A[i] we may choose either x =
   * -K or x = K, and add x to A[i].
   * 
   * After this process, we have some array B.
   * 
   * Return the smallest possible difference between the maximum value of B and
   * the minimum value of B.
   * 
   * https://leetcode.com/contest/weekly-contest-103/problems/smallest-range-ii/
   */
  public int smallestRangeII(int[] A, int K) {
    Arrays.sort(A);
    int N = A.length;
    
    // Assume you add K or sub K to every integer in the array, this is our baseline 
    // diff to start with.
    int minDiff = A[N-1] - A[0];
    
    // You only have one choice with the borders: A[0]+K and A[N-1]-K
    // Then for every other integer in the array, we want to try A[i]+K and A[i+1]-K
    // and compare it to the borders to determine the smallest diff with the max and
    // min values.
    for(int i = 0; i < N-1; i++) {
      int max = Math.max(A[N-1]-K, A[i]+K);
      int min = Math.min(A[0]+K, A[i+1]-K);
      minDiff = Math.min(minDiff, max - min);
    }
    return minDiff;
  }
}
