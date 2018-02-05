package com.jlee.leetcodesolutions;

public class LeetCode063 {
  /*
   * Follow up for "Unique Paths":
   * 
   * Now consider if some obstacles are added to the grids. How many unique paths
   * would there be?
   * 
   * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
   * 
   * For example, There is one obstacle in the middle of a 3x3 grid as illustrated
   * below.
   * [ [0,0,0], 
   *   [0,1,0], 
   *   [0,0,0] ] 
   * 
   * The total number of unique paths is 2.
   * 
   * Note: m and n will be at most 100.
   * 
   * https://leetcode.com/problems/unique-paths-ii/description/
   */
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if(obstacleGrid == null || obstacleGrid.length < 1 || obstacleGrid[0].length < 1)
      return 0;
    
    int[][] matrix = new int[obstacleGrid.length][obstacleGrid[0].length];
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(obstacleGrid[i][j] == 1) continue;
        else if(i == 0 && j == 0)
          matrix[i][j] = 1;
        else if(i == 0)
          matrix[i][j] = matrix[i][j-1];
        else if(j == 0)
          matrix[i][j] = matrix[i-1][j];
        else
          matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
      }
    }
    return matrix[matrix.length-1][matrix[0].length-1];
  }
}
