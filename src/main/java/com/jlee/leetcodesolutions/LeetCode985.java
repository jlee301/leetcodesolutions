package com.jlee.leetcodesolutions;

public class LeetCode985 {
  /*
   * https://leetcode.com/contest/weekly-contest-122/problems/sum-of-even-numbers-after-queries/
   */
  public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int[] result = new int[queries.length];
    int sum = 0;
    for(int i = 0; i < A.length; i++) {
      // Obtain the initial sum of all even numbers
      if(A[i] % 2 == 0)
        sum += A[i];
    }
    
    // evaluate each query
    for(int i = 0; i < queries.length; i++) {
      if(A[queries[i][1]] % 2 == 0) {
        if(queries[i][0] % 2 == 0) {
          // even + even = even
          sum += queries[i][0];
        }
        else {
          // even + odd = odd (need to remove from sum the value of A[i])
          sum -= A[queries[i][1]];
        }
      }
      else {
        if(queries[i][0] % 2 != 0) {
          // odd + odd = even
          sum += A[queries[i][1]] + queries[i][0];
        }
      }
      // update A[i]
      A[queries[i][1]] += queries[i][0];
      // record the sum of even numbers
      result[i] = sum;
    }
    return result;
  }
}
