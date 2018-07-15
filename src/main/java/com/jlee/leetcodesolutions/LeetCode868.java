package com.jlee.leetcodesolutions;

public class LeetCode868 {
  /*
   * Given a positive integer N, find and return the longest distance between two
   * consecutive 1's in the binary representation of N.
   * 
   * If there aren't two consecutive 1's, return 0.
   * 
   * https://leetcode.com/contest/weekly-contest-93/problems/binary-gap/
   */
  public int binaryGap(int N) {
    int max = 0;
    int prev = -1;
    // Check every binary digit of the integer
    // Every time a 1 is found, we set prev to it's index location
    for(int i = 0; i < 32; i++) {
      int temp = N & 1;
      if(temp == 1) {
        if(prev != -1)
          max = Math.max(max, i-prev);
        prev = i;
      }
      N = N >> 1;
    }
    return max;
  }
}
