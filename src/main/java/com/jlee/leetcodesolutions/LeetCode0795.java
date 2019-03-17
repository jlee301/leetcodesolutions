package com.jlee.leetcodesolutions;

public class LeetCode0795 {
  /*
   * We are given an array A of positive integers, and two positive integers L and
   * R (L <= R).
   * 
   * Return the number of (contiguous, non-empty) subarrays such that the value of
   * the maximum array element in that subarray is at least L and at most R.
   * 
   * Example :
   * Input:
   * A = [2, 1, 4, 3]
   * L = 2
   * R = 3
   * Output: 3
   * Explanation: There are three subarrays that meet the requirements: [2], [2,
   * 1], [3].
   * 
   * Note:
   * 1. L, R and A[i] will be an integer in the range [0, 10^9].
   * 2. The length of A will be in the range of [1, 50000].
   * 
   * https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/description/
   */
  public int numSubarrayBoundedMax(int[] A, int L, int R) {
    // result = total number of contiguous subarrays that meet the condition
    // start = starting position
    // min = number of possible contiguous subarrays with elements < L
    int result = 0, start = 0, min = 0; 
    for(int i = 0; i < A.length; i++) {
      if(A[i] >= L && A[i] <= R) {
        result += i-start+1;
        min = i-start+1;
      }
      else if (A[i] < L) {
        // Found an element < L, now min is a reality
        result += min;
      }
      else { 
        // A[i] > R, reset
        start = i+1;
        min = 0;
      }
    }
    return result;
  }
}
