package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.Iterator;

public class LeetCode0073 {
  /*
   * Given a m x n matrix, if an element is 0, set its entire row and column to 0.
   * Do it in place.
   * 
   * Follow up:
   * 1. Did you use extra space?
   * 2. A straight forward solution using O(mn) space is probably a bad idea.
   * 3. A simple improvement uses O(m + n) space, but still not the best solution.
   * 4. Could you devise a constant space solution?
   * 
   * https://leetcode.com/problems/set-matrix-zeroes/description/
   */
  public void setZeroes(int[][] matrix) {
    if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
      return;
    
    HashSet<Integer> rowSet = new HashSet<>(), colSet = new HashSet<>();
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == 0) {
          rowSet.add(i);
          colSet.add(j);
        }
      }
    }
    
    Iterator<Integer> iter = rowSet.iterator();
    while(iter.hasNext())
      matrix[iter.next()] = new int [matrix[0].length];
    
    iter = colSet.iterator();
    while(iter.hasNext()) {
      int col = iter.next();
      for(int i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
      }
    }
  }
}
