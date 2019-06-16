package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class LeetCode1091 {
  /*
   * https://leetcode.com/problems/shortest-path-in-binary-matrix/
   */
  private int[][] moves = { {-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1} };
  
  public int shortestPathBinaryMatrix(int[][] grid) {
    // Not possible if top left or bottom right are blocked
    if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1)
      return -1;
    
    HashSet<String> visited = new HashSet<>();
    visited.add(0 + "_" + 0);
    
    // BFS
    Queue<GridCell> queue = new LinkedList<>();
    queue.add(new GridCell(0, 0));
    int length = 1;
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        GridCell curr = queue.poll();
        if(curr.r == grid.length-1 && curr.c == grid[0].length-1)
          return length;
        
        // Check each adjacent moves
        for(int[] move : moves) {
          int nextR = curr.r + move[0];
          int nextC = curr.c + move[1];
          String key = nextR + "_" + nextC;
          if (nextR < 0 || nextR == grid.length || nextC < 0 || nextC == grid[0].length || grid[nextR][nextC] == 1
              || visited.contains(key))
            continue;
          
          visited.add(key);
          queue.add(new GridCell(nextR, nextC));
        }
      }
      length++;
    }
    return -1;
  }
  
  private class GridCell {
    public int r;
    public int c;
    public GridCell(int r, int c) {
      this.r = r;
      this.c = c;
    }
  }
}
