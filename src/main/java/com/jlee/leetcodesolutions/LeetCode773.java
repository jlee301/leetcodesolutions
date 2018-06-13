package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode773 {
  /*
   * On a 2x3 board, there are 5 tiles represented by the integers 1 through 5,
   * and an empty square represented by 0.
   * 
   * A move consists of choosing 0 and a 4-directionally adjacent number and
   * swapping it.
   * 
   * The state of the board is solved if and only if the board is
   * [[1,2,3],[4,5,0]].
   * 
   * Given a puzzle board, return the least number of moves required so that the
   * state of the board is solved. If it is impossible for the state of the board
   * to be solved, return -1.
   * 
   * Note:
   * 1. board will be a 2 x 3 array as described above.
   * 2. board[i][j] will be a permutation of [0, 1, 2, 3, 4, 5].
   * 
   * https://leetcode.com/problems/sliding-puzzle/description/
   */
  public int slidingPuzzle(int[][] board) {
    String target = "123450";
    String start = "";
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[i].length; j++)
        start = start + board[i][j];
    }
    
    Queue<String> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    queue.add(start);
    visited.add(start);
    int moves = 0;
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String next = queue.poll();
        if(next.equals(target))
          return moves;
        
        // Determine position of zero
        int j = next.indexOf("0");
        int[] dirs = { -3, 3, -1 , 1 };
        for(int d : dirs) {
          int k = j + d;
          // If the swap is out of bounds
          if(k < 0 || k > 5 || (j == 2 && k == 3) || (j == 3 && k == 2)) continue;
          char[] data = next.toCharArray();
          data[j] = data[k];
          data[k] = '0';
          String nei = String.valueOf(data);
          if(!visited.contains(nei)) {
            queue.add(nei);
            visited.add(nei);
          }
        }
      }
      moves++;
    }
    return -1;
  }
}
