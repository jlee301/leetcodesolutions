package com.jlee.leetcodesolutions;

public class LeetCode0977 {
  /*
   * https://leetcode.com/contest/weekly-contest-120/problems/squares-of-a-sorted-array/
   */
  public int[] sortedSquares(int[] A) {
    int left = 0, right = A.length-1;
    int[] result = new int[A.length];
    int idx = A.length-1;
    while(left <= right) {
      if(Math.abs(A[left]) > Math.abs(A[right])) {
        result[idx] = A[left] * A[left];
        left++;
      }
      else {
        result[idx] = A[right] * A[right];
        right--;
      }
      idx--;
    }
    return result;
  }
}
