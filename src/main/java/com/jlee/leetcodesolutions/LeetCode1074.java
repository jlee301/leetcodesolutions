package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1074 {
  /*
   * https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
   */
  public int numSubmatrixSumTarget(int[][] matrix, int target) {
    int m = matrix.length, n = matrix[0].length;
    
    // Convert the matrix into a prefix sum matrix for each row
    // [1,2,3,4]  --> [ 1, 3, 6,10]
    // [5,6,7,8]      [ 5,11,18,26]
    for(int i = 0; i < m; i++) {
      for(int j = 1; j < n; j++)
        matrix[i][j] += matrix[i][j-1];
    }
    
    int count = 0;
    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        
        for(int k = 0; k < m; k++) {
          sum += matrix[k][j] - (i > 0 ? matrix[k][i - 1] : 0);
          
          // Check to see if there is an existing row valued at sum - target
          count += map.getOrDefault(sum - target, 0);
          map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
      }
    }
    return count;
  }
}
