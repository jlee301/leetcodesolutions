package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0994 {
  /*
   * https://leetcode.com/contest/weekly-contest-124/problems/rotting-oranges/
   */
  public int orangesRotting(int[][] grid) {
    // Obtain queue of all fresh orange locations
    Queue<String> fresh = new LinkedList<>(); 
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(grid[i][j] == 1)
          fresh.add(i + "_" + j);
      }
    }
    
    int[][] moves = { {0,-1}, {0,1}, {-1,0}, {1,0} };
    int count = 0;
    while(!fresh.isEmpty()) {
      Queue<String> rotten = new LinkedList<>();
      int N = fresh.size();
      for(int i = 0; i < N; i++) {
        String[] curr = fresh.poll().split("_");
        int r = Integer.valueOf(curr[0]);
        int c = Integer.valueOf(curr[1]);
        String key = r + "_" + c;
        
        // check all adjacent cells for rotten oranges
        for(int[] move : moves) {
          int rNext = r+move[0];
          int cNext = c+move[1];
          
          // Cannot go outside the grid
          if(rNext < 0 || rNext == grid.length || cNext < 0 || cNext == grid[0].length)
            continue;
          
          if(grid[rNext][cNext] == 2) {
            rotten.add(key);
            break;
          }
        }
        
        // Readd back into queue
        if(!rotten.contains(key))
          fresh.add(key);
      }
      
      if(rotten.size() == 0) {
        // no change, will stay like this forever
        return -1;
      }
      
      // mark all newly rotten oranges onto the grid
      while(!rotten.isEmpty()) {
        String[] curr = rotten.poll().split("_");
        int r = Integer.valueOf(curr[0]);
        int c = Integer.valueOf(curr[1]);
        grid[r][c] = 2;
      }
      count++;
    }
    return count;
  }
}
