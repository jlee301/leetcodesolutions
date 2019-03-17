package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0976 {
  /*
   * https://leetcode.com/contest/weekly-contest-119/problems/largest-perimeter-triangle/
   */
  public int largestPerimeter(int[] A) {
    int max = 0;
    Arrays.sort(A);
    
    // Pythagorean theorem: sum of two sides must be greater than third side
    // a + b > c
    // b + c > a
    // c + a > b
    for(int i = A.length-1; i >= 2; i--) {
      if(A[i] < A[i-1] + A[i-2]) {
        max = Math.max(max, A[i]+A[i-1]+A[i-2]);
        break;
      }
    }
    return max;
  }
}
