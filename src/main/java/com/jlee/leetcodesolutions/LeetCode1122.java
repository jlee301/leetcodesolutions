package com.jlee.leetcodesolutions;

public class LeetCode1122 {
  /*
   * https://leetcode.com/problems/relative-sort-array/
   */
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length];
    
    // 0 <= arr1[i], arr2[i] <= 1000
    int[] count = new int[1001];
    for(int n : arr1)
      count[n]++;
    
    int i = 0;
    for(int n : arr2) {
      while(count[n] > 0) {
        result[i++] = n;
        count[n]--;
      }
    }
    
    // Now scan what's remaining and populate
    for(int j = 0; j < count.length; j++) {
      while(count[j] > 0) {
        result[i++] = j;
        count[j]--;
      }
    }
    return result;
  }
}
