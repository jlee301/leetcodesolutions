package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0885 {
  /*
   * https://leetcode.com/contest/weekly-contest-97/problems/spiral-matrix-iii/
   */
  public int[][] spiralMatrixIII(int R, int C, int r0, int c0){
    // moves[0] == moves east
    // moves[1] == moves south
    // moves[2] == moves west
    // moves[3] == moves north
    // every east and west, the distance to travel in that direction will increase by 1
    int dist = 0;
    int[][] moves = { {0,1}, {1,0}, {0,-1}, {-1,0} };
    int target = R*C;
    List<int[]> result = new ArrayList<>();
    result.add(new int[] {r0,c0});
    while(result.size() < target) {
      for(int i = 0; i < 4; i++) {
        // Increase distance to travel by 1 for every east and west direction
        if(i == 0 || i == 2)
          dist++;
        // Travel in this direction dist times
        for(int j = 0; j < dist; j++) {
          r0 += moves[i][0];
          c0 += moves[i][1];
          // If out of bounds, do not need to record
          if(r0 < 0 || r0 >= R || c0 < 0 || c0 >= C)
            continue;
          
          result.add(new int[] {r0,c0});
        }
      }
    }
    return result.toArray(new int[target][]);
  }
}
