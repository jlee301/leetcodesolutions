package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0934 {
  /*
   * In a given 2D binary array A, there are two islands. (An island is a
   * 4-directionally connected group of 1s not connected to any other 1s.)
   * 
   * Now, we may change 0s to 1s so as to connect the two islands together to form
   * 1 island.
   * 
   * Return the smallest number of 0s that must be flipped. (It is guaranteed that
   * the answer is at least 1.)
   * 
   * https://leetcode.com/problems/shortest-bridge/
   */
  public int shortestBridge(int[][] A) {
    // up, down, left, right
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    
    // Find first point on an island
    int i = 0, j = 0;
    boolean islandFound = false;
    findisland: 
      for(i = 0; i < A.length; i++) {
        for(j = 0; j < A[i].length; j++) {
          if(A[i][j] == 1) {
            islandFound = true;
            break findisland;
          }
        }
      }
    
    if(!islandFound)
      return Integer.MAX_VALUE;
    
    // DFS dive from i, j to determine all points of the first island (firstIsland)
    // and all of it's surrounding zeros (zeroVisited, queue) for the starting point
    // of the BFS
    boolean[][] firstIsland = new boolean[A.length][A[0].length];
    firstIsland[i][j] = true;
    boolean[][] zeroVisited = new boolean[A.length][A[0].length];
    Queue<int[]> queue = new LinkedList<>();    
    dfs(i, j, A, firstIsland, zeroVisited, queue, moves);
    
    // If the 0 point that is flipped leads to a 1 that's not part of the first
    // island, then we found the min
    int flipped = 1;
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int k = 0; k < N; k++) {
        int[] curr = queue.poll();
        for(int[] move : moves) {
          int nextI = curr[0] + move[0];
          int nextJ = curr[1] + move[1];

          // cannot be out of bounds
          if(nextI < 0 || nextI == A.length || nextJ < 0 || nextJ == A[0].length)
            continue;
          
          // this leads to a connection to the second island
          if(A[nextI][nextJ] == 1 && !firstIsland[nextI][nextJ])
            return flipped;
          
          if(A[nextI][nextJ] == 0 && !zeroVisited[nextI][nextJ]) {
            zeroVisited[nextI][nextJ] = true;
            queue.add(new int[] {nextI, nextJ});
          }
        }
      }
      flipped++;
    }
    return Integer.MAX_VALUE;
  }
  
  private void dfs(int i, int j, int[][] A, boolean[][] firstIsland, boolean[][] zeroVisited, Queue<int[]> queue, int[][] moves) {
    // check adjacent points
    for(int[] move : moves) {
      int nextI = i + move[0];
      int nextJ = j + move[1];
      
      // cannot be out of bounds
      if(nextI < 0 || nextI == A.length || nextJ < 0 || nextJ == A[0].length)
        continue;
      
      if(A[nextI][nextJ] == 1 && !firstIsland[nextI][nextJ]) {
        firstIsland[nextI][nextJ] = true;
        dfs(nextI, nextJ, A, firstIsland, zeroVisited, queue, moves);
      }
      // Each one of points, take note of all possible 0's surrounding it
      // These 0 points will be used as a starting point for BFS
      else if(A[nextI][nextJ] == 0 && !zeroVisited[nextI][nextJ]){
        zeroVisited[nextI][nextJ] = true;
        queue.add(new int[] {nextI, nextJ});
      }
    }
  }
}
