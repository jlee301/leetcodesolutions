package com.jlee.leetcodesolutions;

public class LeetCode0896 {
  /*
   * An array is monotonic if it is either monotone increasing or monotone
   * decreasing.
   * 
   * An array A is monotone increasing if for all i <= j, A[i] <= A[j]. An array A
   * is monotone decreasing if for all i <= j, A[i] >= A[j].
   * 
   * Return true if and only if the given array A is monotonic.
   * 
   * https://leetcode.com/contest/weekly-contest-100/problems/monotonic-array/
   */
  public boolean isMonotonic(int[] A) {
    if(A == null || A.length <= 1)
      return true;
    
    Boolean monoInc = null;
    for(int i = 1; i < A.length; i++) {
      // Have not determined yet if array is increasing or decreasing
      if(monoInc == null) {
        if(A[i-1] < A[i])
          monoInc = true;
        else if(A[i-1] > A[i])
          monoInc = false;
      }
      else if(monoInc) {
        // If increasing and next element is less --> false
        if(A[i-1] > A[i])
          return false;
      }
      else {
        // If decreasing and next element is greater --> false
        if(A[i-1] < A[i])
          return false;
      }
    }
    return true;
  }
}
