package com.jlee.leetcodesolutions;

public class LeetCode832 {
  /*
   * Given a binary matrix A, we want to flip the image horizontally, then invert
   * it, and return the resulting image.
   * 
   * To flip an image horizontally means that each row of the image is reversed.
   * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
   * 
   * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
   * by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
   * 
   * https://leetcode.com/contest/weekly-contest-84/problems/flipping-an-image/
   */
  public int[][] flipAndInvertImage(int[][] A) {
    int[][] result = new int[A.length][A[0].length];
    for(int i = 0; i < result.length; i++) {
        // Starting with pos at the end will flip horizontally
        for(int j = 0, k = A.length-1; j < result[i].length; j++, k--) {
          // Check to invert values
          result[i][j] = A[i][k] == 0 ? 1 : 0;
        }
    }
    return result;
  }
}
