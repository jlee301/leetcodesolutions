package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode542 {
  /*
   * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for
   * each cell.
   * 
   * The distance between two adjacent cells is 1.
   * 
   * Note:
   * 1. The number of elements of the given matrix will not exceed 10,000.
   * 2. There are at least one 0 in the given matrix.
   * 3. The cells are adjacent in only four directions: up, down, left and right.
   */
  public int[][] updateMatrix(int[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return matrix;

    int row = matrix.length;
    int col = matrix[0].length;
    int[][] result = new int[row][col];

    // Store all 0 positions into queue
    Queue<int[]> queue = new LinkedList<>();
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        if(matrix[i][j] == 0) {
          queue.add(new int[] {i,j});
          result[i][j] = 0;
        } else {
          result[i][j] = Integer.MAX_VALUE;
        }
      }
    }

    // adj[0] = up, adj[1] = down, adj[2] = left, adj[3] = right
    int[][] adj = { {-1,0}, {1,0}, {0,-1}, {0,1} };

    while(!queue.isEmpty()) {
      int[] pos = queue.poll();
      for(int[] dir : adj) {
        int r = pos[0] + dir[0];
        int c = pos[1] + dir[1];
        // If out of bounds, move to next adjacent direction
        if(r < 0 || r >= row || c < 0 || c >= col) continue;
        if(result[r][c] > result[pos[0]][pos[1]] + 1) {
          result[r][c] = result[pos[0]][pos[1]] + 1;
          // Push into queue to be evaluated as well
          queue.add(new int[] {r,c});
        }
      }
    }
    return result;
  }
}
