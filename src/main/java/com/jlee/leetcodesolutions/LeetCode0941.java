package com.jlee.leetcodesolutions;

public class LeetCode0941 {
  /*
   * Given an array A of integers, return true if and only if it is a valid
   * mountain array.
   * 
   * Recall that A is a mountain array if and only if:
   * 1. A.length >= 3
   * 2. There exists some i with 0 < i < A.length - 1 such that:
   * A[0] < A[1] < ... A[i-1] < A[i]
   * A[i] > A[i+1] > ... > A[B.length - 1]
   * 
   * https://leetcode.com/contest/weekly-contest-111/problems/valid-mountain-array/
   */
  public boolean validMountainArray(int[] A) {
    if (A == null || A.length < 3)
      return false;

    // find peak
    int i = 0;
    for(; i < A.length-1; i++) {
      if(A[i] < A[i+1])
        continue;
      else if(A[i] == A[i+1])
        return false;
      else
        break;
    }
    
    // The peak cannot be the first or last element
    if(i == 0 || i == A.length-1)
      return false;
    
    // Everything else should be descending
    for(; i < A.length-1; i++) {
      if(A[i] <= A[i+1])
        return false;
    }
    return true;
  }
}
