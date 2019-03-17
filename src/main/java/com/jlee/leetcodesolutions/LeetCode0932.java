package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0932 {
  /*
   * For some fixed N, an array A is beautiful if it is a permutation of the
   * integers 1, 2, ..., N, such that:
   * 
   * For every i < j, there is no k with i < k < j such that A[k] * 2 = A[i] +
   * A[j].
   * 
   * Given N, return any beautiful array A. (It is guaranteed that one exists.)
   * 
   * https://leetcode.com/problems/beautiful-array/
   */
  public int[] beautifulArray(int N) {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    
    while(result.size() < N) {
      List<Integer> temp = new ArrayList<>();
      // 1. Store first half all odds as a result of 2*A[i] - 1
      for(int n : result) {
        if(2*n - 1 <= N)
          temp.add(2*n - 1);
      }
      
      // 2. Store second half all evens as a result of 2*A[i]
      for(int n : result) {
        if(2*n <= N)
          temp.add(2*n);
      }
      result = temp;
    }

    // Convert to an array
    int[] ans = new int[result.size()];
    for(int i = 0; i < ans.length; i++)
      ans[i] = result.get(i);
    
    return ans;
  }
}
