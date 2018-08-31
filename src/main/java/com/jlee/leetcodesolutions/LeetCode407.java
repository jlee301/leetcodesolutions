package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode407 {
  /*
   * Given an m x n matrix of positive integers representing the height of each
   * unit cell in a 2D elevation map, compute the volume of water it is able to
   * trap after raining.
   * 
   * Note:
   * Both m and n are less than 110. The height of each unit cell is greater than
   * 0 and is less than 20,000.
   * 
   * https://leetcode.com/problems/trapping-rain-water-ii/description/
   */
  public int trapRainWater(int[][] heightMap) {
    if(heightMap == null || heightMap.length <= 2 || heightMap[0].length <= 2)
      return 0;
    
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
    int MAX_i = heightMap.length;
    int MAX_j = heightMap[0].length;
    boolean[][] visited = new boolean[MAX_i][MAX_j];
    
    // Add outer edges to the queue
    // 1. First row
    for(int j = 0; j < MAX_j; j++) {
      pq.add(new int[] {heightMap[0][j], 0, j});
      visited[0][j] = true;
    }
    
    // 2. Remaining of the first and last column
    for(int i = 1; i < MAX_i; i++) {
      pq.add(new int[] {heightMap[i][0], i, 0});
      visited[i][0] = true;
      pq.add(new int[] {heightMap[i][MAX_j - 1], i, MAX_j - 1});
      visited[i][MAX_j-1] = true;
    }
    
    // 3. Remaining of the last row
    for(int j = 1; j < MAX_j - 1; j++) {
      pq.add(new int[] {heightMap[MAX_i - 1][j], MAX_i - 1, j});
      visited[MAX_i-1][j] = true;
    }
    
    // moves[0] == up    moves[2] == left
    // moves[1] == down  moves[3] == right
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    int trap = 0;
    while(!pq.isEmpty()) {
      int[] node = pq.poll();

      // Check adjacent nodes to see if water can flow that direction
      for(int[] move : moves) {
        int nexti = node[1] + move[0];
        int nextj = node[2] + move[1];
        
        // If out of bounds or already visited, move on to next
        if(nexti < 0 || nexti == MAX_i || nextj < 0 || nextj == MAX_j || visited[nexti][nextj])
          continue;
        
        pq.add(new int[] {Math.max(node[0], heightMap[nexti][nextj]), nexti, nextj});
        visited[nexti][nextj] = true;
        
        // There is a downflow, water can be trapped here
        trap += Math.max(0, node[0] - heightMap[nexti][nextj]);
      }
    }
    return trap;
  }
}
