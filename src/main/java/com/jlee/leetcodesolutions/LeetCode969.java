package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode969 {
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
      
      int[] temp = new int[A.length];
      // flip max to front
      if(pos != 0) {
        result.add(pos+1);
        for(int j = 0, l = pos; j <= pos; j++, l--)
          temp[j] = A[l];
        
        for(int j = pos+1; j < k; j++)
          temp[j] = A[j];
        
        A = temp;
      }
        
      // then flip max to the end
      temp = new int[A.length];
      result.add(k);
      for(int j = 0, l = k-1; j < k; j++, l--)
        temp[j] = A[l];
      
      A = temp;
      
      k--;
    }
    return result;
  }
}
