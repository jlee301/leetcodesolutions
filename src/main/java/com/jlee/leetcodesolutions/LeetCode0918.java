package com.jlee.leetcodesolutions;

public class LeetCode0918 {
  /*
   * https://leetcode.com/contest/weekly-contest-105/problems/maximum-sum-circular-subarray/
   */
  public int maxSubarraySumCircular(int[] A) {
    int totalSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;
    int currMax = 0;
    int currMin = 0;
    for(int i = 0; i < A.length; i++) {
      currMax = Math.max(currMax + A[i], A[i]);
      currMin = Math.min(currMin + A[i], A[i]);
      maxSum = Math.max(maxSum, currMax);
      minSum = Math.min(minSum, currMin);
      totalSum += A[i];
    }    
    return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
  }
}
