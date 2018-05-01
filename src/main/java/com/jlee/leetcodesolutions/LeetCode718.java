package com.jlee.leetcodesolutions;

public class LeetCode718 {
  /*
   * Given two integer arrays A and B, return the maximum length of an subarray
   * that appears in both arrays.
   * 
   * Example 1:
   * Input:
   * A: [1,2,3,2,1]
   * B: [3,2,1,4,7]
   * Output: 3
   * Explanation:
   * The repeated subarray with maximum length is [3, 2, 1].
   * 
   * Note:
   * 1. 1 <= len(A), len(B) <= 1000
   * 2. 0 <= A[i], B[i] < 100
   * 
   * https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
   */
  public int findLength(int[] A, int[] B) {
    int max = 0;
    int[][] dp = new int[A.length+1][B.length+1];
    // dp[i][j] is the length of longest common subarray ending with A[i-1] and B[j-1]
    for(int i = 0; i < A.length; i++) {
      for(int j = 0; j < B.length; j++) {
        if(A[i] == B[j]) {
          dp[i+1][j+1] = dp[i][j] + 1;
          max = Math.max(max, dp[i+1][j+1]);
        }
      }
    }
    return max;
  }
}
