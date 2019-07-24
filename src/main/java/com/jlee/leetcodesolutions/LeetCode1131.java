package com.jlee.leetcodesolutions;

public class LeetCode1131 {
  /*
   * https://leetcode.com/problems/maximum-of-absolute-value-expression/
   */
  public int maxAbsValExpr(int[] arr1, int[] arr2) {
    int value = Integer.MIN_VALUE;
    for(int i = 0; i < arr1.length; i++) {
      for(int j = i+1; j < arr1.length; j++) {
        value = Math.max(value, Math.abs(arr1[i] - arr1[j]) + Math.abs(arr2[i] - arr2[j]) + Math.abs(i - j));
      }
    }
    return value;
  }
}
