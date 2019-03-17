package com.jlee.leetcodesolutions;

public class LeetCode0978 {
  /*
   * https://leetcode.com/contest/weekly-contest-120/problems/longest-turbulent-subarray/
   */
  public int maxTurbulenceSize(int[] A) {
    if(A == null || A.length == 0)
      return 0;
    
    if(A.length == 1)
      return 1;
    
    int max = 1;
    int left = 0;
    while(left < A.length-1) {
      // figure out the initial comparison
      boolean cmp = false;
      if(A[left] > A[left+1])
        cmp = false;
      else if(A[left] < A[left+1])
        cmp = true;
      else {
        left++;
        continue;
      }
      
      // find how long the subarray alternates (turbulent)
      int right = left;
      while(right < A.length-1) {
        if(!cmp) {
          if(A[right] > A[right+1]) {
            right++;
            cmp = true;
          }
          else {
            break;
          }
        }
        else {
          if(A[right] < A[right+1]) {
            right++;
            cmp = false;
          }
          else {
            break;
          }
        }
      }
      int len = right - left + 1;
      max = Math.max(max, len);
      left = right;
    }
    return max;
  }
}
