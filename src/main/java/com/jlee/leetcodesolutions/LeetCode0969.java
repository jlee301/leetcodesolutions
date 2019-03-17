package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0969 {
  /*
   * https://leetcode.com/contest/weekly-contest-118/problems/pancake-sorting/
   */
  public List<Integer> pancakeSort(int[] A) {
    List<Integer> result = new ArrayList<>();
    // 3,2,4,1
    // 4,2,3,1 k = 3, max = 4, send to front
    // 1,3,2,4 k = 4, max = 4, send to back
    // 3,1,2,4 k = 2, max = 3, send to front
    // 2,1,3,4 k = 3, max = 3, send to back
    // 1,2,3,4 k = 2, max = 2, send to back
    
    int k = A.length;
    while(k > 0) {
      // find the max integer and its index position
      int max = Integer.MIN_VALUE;
      int pos = 0;
      for(int i = 0; i < k; i++) {
        if(A[i] > max) {
          max = A[i];
          pos = i;
        }
      }
      
      // max number is already in the desired position at the end
      if(pos == k-1) {
        k--;
        continue;
      }
      
      // flip max to front
      if(pos != 0) {
        result.add(pos+1);
        flip(A, 0, pos);
      }
        
      // then flip max to the end
      result.add(k);
      flip(A, 0, k-1);
      
      k--;
    }
    return result;
  }
  
  private void flip(int[] A, int left, int right) {
    while(left < right) {
      int temp = A[left];
      A[left] = A[right];
      A[right] = temp;
      left++;
      right--;
    }
  }
}
