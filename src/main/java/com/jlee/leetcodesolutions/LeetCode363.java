package com.jlee.leetcodesolutions;

import java.util.TreeSet;

public class LeetCode363 {
  /*
   * Given a non-empty 2D matrix matrix and an integer k, find the max sum of a
   * rectangle in the matrix such that its sum is no larger than k.
   * 
   * Note:
   * 1. The rectangle inside the matrix must have an area > 0.
   * 2. What if the number of rows is much larger than the number of columns?
   * 
   * https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/description/
   */
  public int maxSumSubmatrix(int[][] matrix, int k) {
    int max = Integer.MIN_VALUE;
    int R = matrix.length;
    int C = matrix[0].length;
    
    for(int l = 0; l < C; l++) {
      int[] sums = new int[R];
      for(int r = l; r < C; r++) {
        for(int i = 0; i < R; i++) {
          sums[i] += matrix[i][r];
        }
        
        // We use a TreeSet to help us quickly find rectangle >= k
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int currSum = 0;
        for(int sum : sums) {
          currSum += sum;
          // k >= currSum - num
          // num >= currSum - k
          Integer num = set.ceiling(currSum - k);
          if(num != null)
            max = Math.max(max, currSum - num);
          
          set.add(currSum);
        }
      }
    }
    return max;
  }
}
