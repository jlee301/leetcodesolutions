package com.jlee.leetcodesolutions;

public class LeetCode835 {
  /*
   * Two images A and B are given, represented as binary, square matrices of the
   * same size. (A binary matrix has only 0s and 1s as values.)
   * 
   * We translate one image however we choose (sliding it left, right, up, or down
   * any number of units), and place it on top of the other image. After, the
   * overlap of this translation is the number of positions that have a 1 in both
   * images.
   * 
   * (Note also that a translation does not include any kind of rotation.)
   * 
   * What is the largest possible overlap?
   * 
   * Notes:
   * 1. 1 <= A.length = A[0].length = B.length = B[0].length <= 30
   * 2. 0 <= A[i][j], B[i][j] <= 1
   * 
   * https://leetcode.com/problems/image-overlap/description/
   */
  public int largestOverlap(int[][] A, int[][] B) {
    // Expand A to be three times the size
    //
    //  {1,1,0},   {0,0,0,0,0,0,0,0,0}
    //  {0,1,0},   {0|0,0,0,0,0,0,0|0}
    //  {0,1,0}    {0|0,0,0,0,0,0,0|0}
    //             {0|0,0|1,1,0|0,0|0}
    //             {0|0,0|0,1,0|0,0|0}
    //             {0|0,0|0,1,0|0,0|0}
    //             {0|0,0,0,0,0,0,0|0}
    //             {0|0,0,0,0,0,0,0|0}
    //             {0,0,0,0,0,0,0,0,0}
    int N = A.length;
    int[][] AA = new int[3*N][3*N];
    for(int i = N; i < 2*N; i++) {
      for(int j = N; j < 2*N; j++) {
        AA[i][j] = A[i-N][j-N];
      }
    }
    
    int overlap = 0;
    // i and j are used to shift the starting point for AA to start comparison
    for(int i = 1; i < 2*N; i++) {
      for(int j = 1; j < 2*N; j++)
        overlap = Math.max(overlap, compare(AA, B, i, j));
    }
    return overlap;
  }
  
  private int compare(int[][] A, int[][] B, int ipad, int jpad) {
    int overlap = 0;
    for(int i = 0; i < B.length; i++) {
      for(int j = 0; j < B[i].length; j++)
        overlap += B[i][j] * A[i+ipad][j+jpad];
    }
    return overlap;
  }
}
