package com.jlee.leetcodesolutions;

public class LeetCode962 {
  /*
   * Given an array A of integers, a ramp is a tuple (i, j) for which i < j and
   * A[i] <= A[j]. The width of such a ramp is j - i.
   * 
   * Find the maximum width of a ramp in A. If one doesn't exist, return 0.
   * 
   * https://leetcode.com/problems/maximum-width-ramp/
   */
  public int maxWidthRamp(int[] A) {
    int max = 0;
    for(int i = 0; i < A.length; i++) {
      for(int j = i+1+max; j < A.length; j++) {
        if(A[i] <= A[j])
          max = Math.max(max, j - i);
      }
    }
    return max;
  }
}
