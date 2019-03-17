package com.jlee.leetcodesolutions;

public class LeetCode0955 {
  /*
   * We are given an array A of N lowercase letter strings, all of the same
   * length.
   * 
   * Now, we may choose any set of deletion indices, and for each string, we
   * delete all the characters in those indices.
   * 
   * For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices
   * {0, 2, 3}, then the final array after deletions is ["bef","vyz"].
   * 
   * Suppose we chose a set of deletion indices D such that after deletions, the
   * final array has its elements in lexicographic order (A[0] <= A[1] <= A[2] ...
   * <= A[A.length - 1]).
   * 
   * Return the minimum possible value of D.length.
   * 
   * https://leetcode.com/problems/delete-columns-to-make-sorted-ii/
   */
  public int minDeletionSize(String[] A) {
    int count = 0;
    int R = A.length;
    int C = A[0].length();
    
    String[] curr = new String[R];
    for(int c = 0; c < C; c++) {
      // Add next column to each row
      String[] next = new String[R];
      for(int r = 0; r < R; r++)
        next[r] = curr[r] + A[r].charAt(c);
      
      // Check to see if all rows are still lexicographically ordered
      boolean isSorted = true;
      for(int i = 0; i < R-1; i++) {
        if(next[i].compareTo(next[i+1]) > 0) {
          isSorted = false;
          break;
        }
      }
      if(isSorted)
        curr = next;
      else
        count++;
    }
    return count;
  }
}
