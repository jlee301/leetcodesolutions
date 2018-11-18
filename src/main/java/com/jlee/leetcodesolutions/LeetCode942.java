package com.jlee.leetcodesolutions;

public class LeetCode942 {
  /*
   * Given a string S that only contains "I" (increase) or "D" (decrease), let N =
   * S.length.
   * 
   * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
   * 1. If S[i] == "I", then A[i] < A[i+1]
   * 2. If S[i] == "D", then A[i] > A[i+1]
   * 
   * https://leetcode.com/contest/weekly-contest-111/problems/di-string-match/
   */
  public int[] diStringMatch(String S) {
    int N = S.length();
    int left = 0, right = N;
    int[] result = new int[N+1];
    
    for(int i = 0; i < N; i++)
      result[i] = S.charAt(i) == 'I' ? left++ : right--;
    
    result[N] = left++;
    return result;
  }
}
