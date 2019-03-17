package com.jlee.leetcodesolutions;

public class LeetCode0845 {
  /*
   * Let's call any (contiguous) subarray B (of A) a mountain if the following
   * properties hold:
   * 1. B.length >= 3
   * 2. There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1]
   * < B[i] > B[i+1] > ... > B[B.length - 1] (Note that B could be any subarray of
   * A, including the entire array A.)
   * 
   * Given an array A of integers, return the length of the longest mountain.
   * 
   * Return 0 if there is no mountain.
   * 
   * https://leetcode.com/contest/weekly-contest-87/problems/longest-mountain-in-array/
   */
  public int longestMountain(int[] A) {
    int max = 0;
    for(int i = 0; i < A.length; i++)
      max = Math.max(max, longestMountain(A, i));
    return max;
  }
  
  private int longestMountain(int[] A, int pos) {
    // Determine length of left side of mountain
    int left = 0;
    for(int i = pos; i > 0; i--) {
      if(A[i-1] < A[i]) left++;
      else break;
    }
    if(left == 0) return 0;
    
    // Determine length of right side of mountain
    int right = 0;
    for(int i = pos; i < A.length-1; i++) {
      if(A[i] > A[i+1]) right++;
      else break;
    }
    if(right == 0) return 0;
    
    return left+right+1;
  }
}
