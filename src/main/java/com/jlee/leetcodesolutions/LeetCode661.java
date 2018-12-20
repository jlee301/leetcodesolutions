package com.jlee.leetcodesolutions;

public class LeetCode661 {
  /*
   * Given a 2D integer matrix M representing the gray scale of an image, you need
   * to design a smoother to make the gray scale of each cell becomes the average
   * gray scale (rounding down) of all the 8 surrounding cells and itself. If a
   * cell has less than 8 surrounding cells, then use as many as you can.
   * 
   * Example 1:
   * Input: 
   * [[1,1,1], 
   *  [1,0,1], 
   *  [1,1,1]]
   * 
   * Output: 
   * [[0, 0, 0], 
   *  [0, 0, 0], 
   *  [0, 0, 0]]
   * 
   * Explanation:
   * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
   * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
   * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
   * 
   * Note:
   * 1. The value in the given matrix is in the range of [0, 255].
   * 2. The length and width of the given matrix are in the range of [1, 150].
   * 
   * https://leetcode.com/problems/image-smoother/description/
   */
  public int[][] imageSmoother(int[][] M) {
    int[][] result = new int[M.length][M[0].length];
    int[][] moves = { {-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1} };
    for(int i = 0; i < M.length; i++) {
      for(int j = 0; j < M[i].length; j++) {        
        // Check adjacent cells
        int count = 1;
        int sum = M[i][j];
        for(int[] move : moves) {
          int nextI = i + move[0];
          int nextJ = j + move[1];
          if(nextI < 0 || nextI == M.length || nextJ < 0 || nextJ == M[0].length)
            continue;
          
          sum += M[nextI][nextJ];
          count++;
        }
        result[i][j] = sum / count;
      }
    }
    return result;
  }
}
