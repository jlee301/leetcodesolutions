package com.jlee.leetcodesolutions;

public class LeetCode944 {
  /*
   * https://leetcode.com/contest/weekly-contest-111/problems/delete-columns-to-make-sorted/
   */
  public int minDeletionSize(String[] A) {
    int del = 0;
    boolean[] col = new boolean[A[0].length()];
    for(int i = 0; i < A.length-1; i++) {
      for(int j = 0; j < A[0].length(); j++) {
        if(col[j])
          continue;
        
        if(A[i].charAt(j) > A[i+1].charAt(j)) {
          col[j] = true;
          del++;
        }
      }
    }
    return del;
  }
}
