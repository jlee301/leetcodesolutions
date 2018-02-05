package com.jlee.leetcodesolutions;

import java.util.HashMap;
import javafx.util.Pair;

public class LeetCode064 {
  /*
   * Given a m x n grid filled with non-negative numbers, find a path from top
   * left to bottom right which minimizes the sum of all numbers along its path.
   * 
   * Note: You can only move either down or right at any point in time.
   * 
   * Example 1: 
   * [ [1,3,1], 
   *   [1,5,1], 
   *   [4,2,1] ]
   * 
   * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the
   * sum.
   * 
   * https://leetcode.com/problems/minimum-path-sum/description/
   */
  public int minPathSum(int[][] grid) {
    if(grid == null || grid.length < 1 || grid[0].length < 1)
      return 0;
    
    HashMap<Pair<Integer,Integer>,Integer> map = new HashMap<>();
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(i == 0 && j == 0)
          map.put(new Pair(i,j), grid[i][j]);
        else if(i == 0)
          map.put(new Pair(i,j), map.get(new Pair(i,j-1)) + grid[i][j]);
        else if(j == 0)
          map.put(new Pair(i,j), map.get(new Pair(i-1,j)) + grid[i][j]);
        else {
          int min = Math.min(map.get(new Pair(i-1,j)), map.get(new Pair(i,j-1)));
          map.put(new Pair(i,j), min + grid[i][j]);
        }
      }
    }
    return map.get(new Pair(grid.length-1,grid[0].length-1));
  }
}
