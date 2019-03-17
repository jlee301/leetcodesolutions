package com.jlee.leetcodesolutions;

public class LeetCode0546 {
  /*
   * Given several boxes with different colors represented by different positive
   * numbers.
   * 
   * You may experience several rounds to remove boxes until there is no box left.
   * Each time you can choose some continuous boxes with the same color (composed
   * of k boxes, k >= 1), remove them and get k*k points.
   * 
   * Find the maximum points you can get.
   * 
   * Note: The number of boxes n would not exceed 100.
   * 
   * https://leetcode.com/problems/remove-boxes/description/
   */
  public int removeBoxes(int[] boxes) {
    int N = boxes.length;
    return removeBoxes(boxes, 0, N-1, 0, new int[N][N][N]);
  }
  
  private int removeBoxes(int[] boxes, int l, int r, int k, int[][][] memo) {
    if(l > r)
      return 0;
    
    if(memo[l][r][k] != 0)
      return memo[l][r][k];
    
    while(l+1 <= r && boxes[l] == boxes[l+1]) {
      // Group all continuous boxes of same color as boxes[l]
      l++;
      k++;
    }
    
    int points = (k+1) * (k+1) + removeBoxes(boxes, l+1, r, 0, memo);    
    // If the same color box exist later on, determine if removing other boxes in
    // between to create a longer continuous would give more points
    for(int i = l+1; i <= r; i++) {
      if(boxes[l] == boxes[i]) {
        // points in between + points to create longer continuous removal
        points = Math.max(points, removeBoxes(boxes, l+1, i-1, 0, memo) + removeBoxes(boxes, i, r, k+1, memo));
      }
    }
    
    memo[l][r][k] = points;
    return points;
  }
}
