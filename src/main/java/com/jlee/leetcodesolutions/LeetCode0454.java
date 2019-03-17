package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0454 {
  /*
   * Given four lists A, B, C, D of integer values, compute how many tuples (i, j,
   * k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
   * 
   * To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤
   * N ≤ 500. All integers are in the range of -228 to 228 - 1 and the result is
   * guaranteed to be at most 231 - 1.
   * 
   * Example:
   * Input:
   * A = [ 1, 2]
   * B = [-2,-1]
   * C = [-1, 2]
   * D = [ 0, 2]
   * 
   * Output:
   * 2
   * 
   * Explanation:
   * The two tuples are:
   * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
   * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
   * 
   * https://leetcode.com/problems/4sum-ii/description/
   */
  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    int n = A.length;
    // Store all possible sum combinations of A and B into HashMap. If occurs more
    // than once, increase count.
    HashMap<Integer,Integer> mapSum = new HashMap<>();
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        int sum = A[i] + B[j];
        mapSum.put(sum, mapSum.getOrDefault(sum, 0)+1);
      }
    }
    
    // Now formulate every possible sum combinations of C and D. If the negative of
    // the sum is in the HashMap, then add the count to the result.
    int result = 0;
    for(int k = 0; k < n; k++) {
      for(int l = 0; l < n; l++) {
        int sum = -(C[k] + D[l]);
        result += mapSum.getOrDefault(sum, 0);
      }
    }
    return result;
  }
}
