package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class LeetCode1031 {
  /*
   * https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/
   */
  public int maxSumTwoNoOverlap(int[] A, int L, int M) {
    if(M < L)
      return maxSumTwoNoOverlap(A, M, L);
    
    // Create a sum array of A
    // Where sum[i+1] = sum[i] + A[i]
    int[] sum = new int[A.length+1];
    for(int i = 0; i < A.length; i++)
      sum[i+1] = sum[i] + A[i];
    
    // Store into the TreeMap sum of every M sized contiguous array
    // Its value will be the range of the M sized contiguous array in the form of {begin idx, end idx}
    // Because of this, we purposely storing max(M,L) sized contiguous array
    TreeMap<Integer, List<int[]>> map = new TreeMap<>();
    for(int i = 0; i < sum.length-M; i++) {
      int key = sum[i+M] - sum[i];
      map.computeIfAbsent(key, k -> new ArrayList<>()).add(new int[] {i, i+M-1});
    }
    
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < sum.length-L; i++) {
      int a = sum[i+L] - sum[i];
      boolean found = false;
      while(!found) {
        // We just need to find one largest sum that does not overlap
        Iterator<Integer> iter = map.descendingKeySet().iterator();
        search: while(iter.hasNext()) {
          int key = iter.next();
          List<int[]> ranges = map.get(key);
          for(int j = 0; j < ranges.size(); j++) {
            int[] range = ranges.get(j);
            
            // only process if the range does not overlap
            if(range[1] < i || range[0] > i+L-1) {
              // [2,6] -> 73  [3,5] -> 52
              // 6 < 3 || 2 > 5 
              max = Math.max(max, a+key);
              break search;              
            }
          }
        }
        found = true;
      }
    }
    return max;
  }
}
