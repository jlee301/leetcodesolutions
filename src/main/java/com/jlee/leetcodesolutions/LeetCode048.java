package com.jlee.leetcodesolutions;

public class LeetCode048 {
  /*
   * You are given an n x n 2D matrix representing an image.
   * 
   * Rotate the image by 90 degrees (clockwise).
   * 
   * Note: You have to rotate the image in-place, which means you have to modify
   * the input 2D matrix directly. DO NOT allocate another 2D matrix and do the
   * rotation.
   * 
   * Example 1:
   * Given input matrix = 
   * [ [1,2,3], 
   *   [4,5,6], 
   *   [7,8,9] ]
   * 
   * rotate the input matrix in-place such that it becomes: 
   * [ [7,4,1], 
   *   [8,5,2],
   *   [9,6,3] ]
   * 
   * https://leetcode.com/problems/rotate-image/description/
   */
  public void rotate(int[][] matrix) {
    if(matrix == null || matrix.length < 1)
      return;
    
    /*
     * [1,2,3]       [1,4,7]
     * [4,5,6]  -->  [2,5,8]
     * [7,8,9]       [3,6,9]
     */
    for(int i = 0; i < matrix.length; i++) {
      for(int j = i; j < matrix[i].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    
    /*
     * [1,4,7]       [7,4,1]
     * [2,5,8]  -->  [8,5,2]
     * [3,6,9]       [9,6,3]
     */
    for(int i = 0; i < matrix.length; i++) {
      int start = 0, end = matrix.length-1;
      while(start < end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
        start++;
        end--;
      }
    }
  }
}
