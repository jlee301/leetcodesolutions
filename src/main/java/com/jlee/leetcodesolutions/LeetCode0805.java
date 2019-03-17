package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0805 {
  /*
   * In a given integer array A, we must move every element of A to either list B
   * or list C. (B and C initially start empty.)
   * 
   * Return true if and only if after such a move, it is possible that the average
   * value of B is equal to the average value of C, and B and C are both
   * non-empty.
   * 
   * Note:
   * 1. The length of A will be in the range [1, 30].
   * 2. A[i] will be in the range of [0, 10000].
   * 
   * https://leetcode.com/problems/split-array-with-same-average/description/
   */
  public boolean splitArraySameAverage(int[] A) {
    int N = A.length;
    int sum = 0;
    for(int num : A)
      sum += num;
    Arrays.sort(A);
    
    // i == no of elements 
    // 1 element with sum = 1 * avg
    // 2 elements with sum = 2 * avg
    // i elements with sum = i * avg
    for(int i = 1; i <= N/2; i++) {
      if(sum * i % N == 0 && splitArraySameAverage(A, sum * i / N, i, 0))
        return true;
    }
    return false;
  }
  
  private boolean splitArraySameAverage(int[] A, int target, int i, int pos) {
    if(i == 0)
      return target == 0;
        
    for(int j = pos; j < A.length; j++) {
      // Skips duplicates
      if(j > pos && A[j-1] == A[j]) continue;
      if(splitArraySameAverage(A, target-A[j], i-1, j+1))
        return true;
    }
    return false;
  }  
}
