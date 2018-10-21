package com.jlee.leetcodesolutions;

public class LeetCode926 {
  /*
   * A string of '0's and '1's is monotone increasing if it consists of some
   * number of '0's (possibly 0), followed by some number of '1's (also possibly
   * 0.)
   * 
   * We are given a string S of '0's and '1's, and we may flip any '0' to a '1' or
   * a '1' to a '0'.
   * 
   * Return the minimum number of flips to make S monotone increasing.
   * 
   * https://leetcode.com/contest/weekly-contest-107/problems/flip-string-to-monotone-increasing/
   */
  public int minFlipsMonoIncr(String S) {
    int N = S.length();
    char[] sData = S.toCharArray();
    
    // flipToZero is traversed from left to right
    // flipToOne is traversed from right to left
    int[] flipToZero = new int[N+1];
    int[] flipToOne = new int[N+1];
    for(int i = 0; i < N; i++) {
      flipToZero[i+1] = flipToZero[i] + (sData[i] == '1' ? 1 : 0);
      flipToOne[N-i-1] = flipToOne[N-i] + (sData[N-i-1] == '0' ? 1 : 0);
    }
    
    int min = Integer.MAX_VALUE;
    for(int i = 0; i <= N; i++) {
      min = Math.min(min, flipToZero[i] + flipToOne[i]);
    }
    return min;
  }
}
