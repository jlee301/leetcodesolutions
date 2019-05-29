package com.jlee.leetcodesolutions;

public class LeetCode1053 {
  /*
   * https://leetcode.com/problems/previous-permutation-with-one-swap/
   */
  public int[] prevPermOpt1(int[] A) {
    // Time: O(n^2)
    // Space: O(1)
    int i = A.length-1, j = 0;
    boolean found = false;
    // [1,9,4,6,7] --> [1,7,4,6,9]
    //   [3,1,1,3] --> [1,3,1,3]
    while(i >= 0) {
      int max = 0;
      for(int k = i+1; k < A.length; k++) {
        // Find the max number the right of A[i] to swap with
        if(A[i] > A[k] && A[k] > max) {
          max = A[k];
          j = k;
          found = true;
        }
      }
      if(found)
        break;
      
      i--;
    }
    if(found)
      swap(A, i, j);
    
    return A;
  }
  
  private void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}
