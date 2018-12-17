package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode960 {
  /*
   * We are given an array A of N lowercase letter strings, all of the same
   * length.
   * 
   * Now, we may choose any set of deletion indices, and for each string, we
   * delete all the characters in those indices.
   * 
   * For example, if we have an array A = ["babca","bbazb"] and deletion indices
   * {0, 1, 4}, then the final array after deletions is ["bc","az"].
   * 
   * Suppose we chose a set of deletion indices D such that after deletions, the
   * final array has every element (row) in lexicographic order.
   * 
   * For clarity, A[0] is in lexicographic order (ie. A[0][0] <= A[0][1] <= ... <=
   * A[0][A[0].length - 1]), A[1] is in lexicographic order (ie. A[1][0] <=
   * A[1][1] <= ... <= A[1][A[1].length - 1]), and so on.
   * 
   * Return the minimum possible value of D.length.
   * 
   * https://leetcode.com/problems/delete-columns-to-make-sorted-iii/
   */
  public int minDeletionSize(String[] A) {
    int R = A.length, C = A[0].length(), min = C - 1;
    
    // dp[i] = length of longest increasing subsequence ending with A[][i]
    int[] dp = new int[C];
    Arrays.fill(dp, 1);
    
    for(int c = 0; c < C; c++) {
      for(int i = 0; i < c; i++) {
        // Check each String if lexicographically correct A[r][i] <= A[r][c]
        int r = 0;
        for(r = 0; r < R; r++) {
          if(A[r].charAt(i) > A[r].charAt(c))
            break;
        }
        if(r == R)
          dp[c] = Math.max(dp[c], dp[i] + 1);
      }
      min = Math.min(min, C - dp[c]);
    }
    return min;
  }
}
