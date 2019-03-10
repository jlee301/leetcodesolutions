package com.jlee.leetcodesolutions;

public class LeetCode1007 {
  /*
   * https://leetcode.com/contest/weekly-contest-127/problems/minimum-domino-rotations-for-equal-row/
   */
  public int minDominoRotations(int[] A, int[] B)  {
    // if A[i] and B[i] are the same, no need to rotate
    // You want the min(A count, B count);
    int[] Acount = new int[7];
    int[] Bcount = new int[7];
    int[] total = new int[7];
    int N = A.length;
    int dupes = 0;
    for(int i = 0; i < N; i++) {
      // Count how many times an element appears A side and B side
      Acount[A[i]]++;
      Bcount[B[i]]++;
      
      // If both A side and B side are the same, only add to the total once
      if(A[i] == B[i]) {
        total[A[i]]++;
        dupes++;
      }
      else {
        total[A[i]]++;
        total[B[i]]++;
      }
    }
    
    for(int i = 1; i < 7; i++) {
      // Now check total to see if we have an element that can appear on each tile
      if(total[i] == N)
        return Math.min(Acount[i] - dupes, Bcount[i] - dupes);
    }
    return -1;
  }
}
