package com.jlee.leetcodesolutions;

public class LeetCode1089 {
  /*
   * https://leetcode.com/problems/duplicate-zeros/
   */
  public void duplicateZeros(int[] arr) {
    // [1,0,2,3,0,4,5,0]
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == 0) {
        int j = arr.length-1;
        while(j > i+1) {
          arr[j] = arr[j-1];
          j--;
        }
        arr[j] = 0;
        i = j;
      }
    }
  }
}
