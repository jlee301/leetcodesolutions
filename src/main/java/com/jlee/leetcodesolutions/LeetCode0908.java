package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0908 {
  /*
   * Given an array A of integers, for each integer A[i] we may choose any x with
   * -K <= x <= K, and add x to A[i].
   * 
   * After this process, we have some array B.
   * 
   * Return the smallest possible difference between the maximum value of B and
   * the minimum value of B.
   * 
   * https://leetcode.com/contest/weekly-contest-103/problems/smallest-range-i/
   */
  public int smallestRangeI(int[] A, int K) {
    // Sort array in ascending order
    // Take the min value and add K
    // Take the max value and sub K
    Arrays.sort(A);
    int min = A[0] + K;
    int max = A[A.length-1] - K;
    // If max <= min, it means we can match the exact min value to be zero diff
    // If not, just return the difference between max and min;
    return max <= min ? 0 : max - min;
  }
}
