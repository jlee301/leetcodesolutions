package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0873 {
  /*
   * A sequence X_1, X_2, ..., X_n is fibonacci-like if:
   * 1. n >= 3
   * 2. X_i + X_{i+1} = X_{i+2} for all i + 2 <= n
   * 
   * Given a strictly increasing array A of positive integers forming a sequence,
   * find the length of the longest fibonacci-like subsequence of A. If one does
   * not exist, return 0.
   * 
   * (Recall that a subsequence is derived from another sequence A by deleting any
   * number of elements (including none) from A, without changing the order of the
   * remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6,
   * 7, 8].)
   * 
   * Note:
   * 1. 3 <= A.length <= 1000
   * 2. 1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9
   * 
   * https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/
   */
  public int lenLongestFibSubseq(int[] A) {
    // Import all elements into a set for easier searching
    HashSet<Integer> set = new HashSet<>();
    for(int n : A)
      set.add(n);
    
    // For every two possible integers, check to see if the next fibonacci exist
    int N = A.length;
    int max = 0;
    for(int i = 0; i < N; i++) {
      for(int j = i+1; j < N; j++) {
        int count = 2;
        int next = A[i] + A[j];
        int prev = A[j];
        // count = length of the local fibonacci subsequence
        // Continue to loop until the next fibonacci element in the subsequence is not found
        while(set.contains(next)) {
          int temp = next;
          next = prev + next;
          prev = temp;
          count++;
        }
        max = Math.max(max, count);
      }
    }
    return max > 2 ? max : 0;
  }
}
