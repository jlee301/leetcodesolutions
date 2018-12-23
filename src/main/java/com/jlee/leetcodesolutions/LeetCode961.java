package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode961 {
  /*
   * In a array A of size 2N, there are N+1 unique elements, and exactly one of
   * these elements is repeated N times.
   * 
   * Return the element repeated N times.
   * 
   * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
   */
  public int repeatedNTimes(int[] A) {
    Arrays.sort(A);
    int mid = A.length / 2;
    return A[mid] == A[mid+1] ? A[mid] : A[mid-1];
  }
}
