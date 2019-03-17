package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0980 {
  /*
   * https://leetcode.com/problems/unique-paths-iii/
   */
  private class Status {
    public int[] pos;
    public HashSet<String> visited;
    Status(int[] pos, HashSet<String> visited) {
      this.pos = pos;
      this.visited = visited;
    }
  }
    
  public int uniquePathsIII(int[][] grid) {
    HashSet<String> visited = new HashSet<>();
    int[] start = new int[2];
    int[] end = new int[2];
    int nonObstacleCount = 0;
    
    // Review the grid, find starting point, ending point, and count all non
    // obstacles
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(grid[i][j] == -1)
          continue;
        else if(grid[i][j] == 1)
          start = new int[] {i,j};
        else if(grid[i][j] == 2)
          end = new int[] {i,j};
        
        nonObstacleCount++;
      }
    }
    
    // BFS
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    Queue<Status> queue = new LinkedList<>();
    visited.add(start[0] + "_" + start[1]);
    queue.add(new Status(start, visited));
    int result = 0;
    while(nonObstacleCount > 0) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        Status curr = queue.poll();
        
        if(nonObstacleCount == 1 && curr.pos[0] == end[0] && curr.pos[1] == end[1])
          result++;
        
        for(int[] move : moves) {
          int[] nextPos = { curr.pos[0]+move[0], curr.pos[1]+move[1] };
          String key = nextPos[0] + "_" + nextPos[1];
          
          // Cannot go outside the grid, hit an obstacle, or already visited
          if(nextPos[0] < 0 || nextPos[0] == grid.length || nextPos[1] < 0 || nextPos[1] == grid[0].length
              || grid[nextPos[0]][nextPos[1]] == -1 || curr.visited.contains(key))
            continue;
          
          curr.visited.add(key);
          queue.add(new Status(nextPos, new HashSet<>(curr.visited)));
          curr.visited.remove(key);
        }
      }
      nonObstacleCount--;
    }
    return result;
  }
}
