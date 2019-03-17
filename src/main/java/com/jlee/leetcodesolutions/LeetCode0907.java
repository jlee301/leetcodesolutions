package com.jlee.leetcodesolutions;

public class LeetCode0907 {
  /*
   * Given an array of integers A, find the sum of min(B), where B ranges over
   * every (contiguous) subarray of A.
   * 
   * Since the answer may be large, return the answer modulo 10^9 + 7.
   * 
   * https://leetcode.com/contest/weekly-contest-102/problems/sum-of-subarray-minimums/
   */
  public int sumSubarrayMins(int[] A) {
    int MOD = 1_000_000_007;
    long sum = 0;
    for(int i = 0; i < A.length; i++) {
      int left = 1, right = 1;
      // left = number of subarrays from [A[0] : A[i]] where A[i] is min
      for(int j = i-1; j >= 0 && A[i] < A[j]; j--)
        left++;
      
      // right = number of subarrays from [A[i] : A[A.length-1]] where A[i] is min
      for(int j = i+1; j < A.length && A[i] <= A[j]; j++)
        right++;
      
      // left * right = total number of subarrays where A[i] is min
      sum = (sum + left * right * A[i]) % MOD;
    }
    return (int) sum;
  }
}
