package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1072 {
  /*
   * https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/
   */
  public int maxEqualRowsAfterFlips(int[][] matrix) {
    HashMap<String,Integer> map = new HashMap<>();
    
    for(int r = 0; r < matrix.length; r++) {
      String path1 = "";
      String path2 = "";
      
      // The column's pattern can either be flip or no flip
      for(int c = 0; c < matrix[0].length; c++) {
        // path1 == no flip
        // path2 == flip
        path1 += matrix[r][c];
        path2 += 1 - matrix[r][c];
      }
      
      map.put(path1, map.getOrDefault(path1, 0) + 1);
      map.put(path2, map.getOrDefault(path2, 0) + 1);
    }
    
    int max = 0;
    for(int count : map.values())
      max = Math.max(max, count);
    
    return max;
  }
}
