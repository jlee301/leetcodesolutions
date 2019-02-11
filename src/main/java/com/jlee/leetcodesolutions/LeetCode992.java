package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode992 {
  /*
   * https://leetcode.com/problems/subarrays-with-k-different-integers/
   */
  public int subarraysWithKDistinct(int[] A, int K) {
    // A = {1,2,1,2,3}   K = 2
    HashSet<Integer> set = new HashSet<>();
    int i = 0, j = 0, count = 0;
    while(j < A.length) {
      set.add(A[j]);
      
      if(set.size() == K) {
        count++;
        j++;
        if(j == A.length) {
          set.clear();
          i++;
          j = i;
        }
      }
      else if(set.size() > K) {
        set.clear();
        i++;
        j = i;
      }
      else {
        j++;
      }
    }
    return count;
  }
}
