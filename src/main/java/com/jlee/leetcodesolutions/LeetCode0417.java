package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0417 {
  /*
   * Given an m x n matrix of non-negative integers representing the height of
   * each unit cell in a continent, the "Pacific ocean" touches the left and top
   * edges of the matrix and the "Atlantic ocean" touches the right and bottom
   * edges.
   * 
   * Water can only flow in four directions (up, down, left, or right) from a cell
   * to another one with height equal or lower.
   * 
   * Find the list of grid coordinates where water can flow to both the Pacific
   * and Atlantic ocean.
   * 
   * Note:
   * The order of returned grid coordinates does not matter.
   * Both m and n are less than 150.
   * 
   * Example:
   * Given the following 5x5 matrix:
   * Pacific  ~   ~   ~   ~   ~
   *       ~  1   2   2   3  (5) *
   *       ~  3   2   3  (4) (4) *
   *       ~  2   4  (5)  3   1  *
   *       ~ (6) (7)  1   4   5  *
   *       ~ (5)  1   1   2   4  *
   *          *   *   *   *   *  Atlantic
   * 
   * Return:
   * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with
   * parentheses in above matrix).
   * 
   * https://leetcode.com/problems/pacific-atlantic-water-flow/description/
   */
  public List<int[]> pacificAtlantic(int[][] matrix) {
    List<int[]> result = new ArrayList<>();
    if(matrix == null || matrix.length == 0)
      return result;
    
    boolean[][] pac = new boolean[matrix.length][matrix[0].length];
    boolean[][] atl = new boolean[matrix.length][matrix[0].length];
    // Check vertical edges
    for(int i = 0; i < matrix.length; i++) {
      paHelper(matrix, i, 0, matrix[i][0], pac);
      paHelper(matrix, i, matrix[0].length-1, matrix[i][matrix[0].length-1], atl);
    }

    // Check horizontal edges
    for(int j = 0; j < matrix[0].length; j++) {
      paHelper(matrix, 0, j, matrix[0][j], pac);
      paHelper(matrix, matrix.length-1, j, matrix[matrix.length-1][j], atl);
    }

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(pac[i][j] && atl[i][j])
          result.add(new int[] {i,j});
      }
    }
    return result;
  }
  
  private void paHelper(int[][] matrix, int i, int j, int prev, boolean[][] map) {
    if(i < 0 || j < 0 || i > matrix.length-1 || j > matrix[i].length-1)
      return;
    if(map[i][j]) 
      // Checked previously, keep going
      return;
    if(prev > matrix[i][j]) 
      // If prev is greater, then water cannot flow through
      return;
    
    map[i][j] = true;
    paHelper(matrix, i-1, j, matrix[i][j], map); // Check up
    paHelper(matrix, i+1, j, matrix[i][j], map); // Check down
    paHelper(matrix, i, j-1, matrix[i][j], map); // Check left
    paHelper(matrix, i, j+1, matrix[i][j], map); // Check right
  }
}
