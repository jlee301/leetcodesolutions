package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0909 {
  /*
   * https://leetcode.com/problems/snakes-and-ladders/description/
   */
  public int snakesAndLadders(int[][] board) {
    // Transfer board to a 1D array to avoid confusion
    int[] straightBoard = new int[(board.length * board[0].length)+1];
    for(int i = 1; i < straightBoard.length;) {
      boolean rightToLeft = true;
      for(int r = board.length-1; r >= 0; r--) {
        if(rightToLeft) {
          for(int c = 0; c < board[0].length; c++)
            straightBoard[i++] = board[r][c];
        }
        else {
          for(int c = board[0].length-1; c >= 0; c--)
            straightBoard[i++] = board[r][c];
        }
        rightToLeft = !rightToLeft;
      }
    }
    
    // BFS
    Queue<Integer> queue = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    queue.add(1);
    visited.add(1);
    
    int target = straightBoard.length-1;
    int moves = 0;
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        int curr = queue.poll();
        if(curr == target)
          return moves;
        
        // check the next 6 moves ahead x+1 thru x+6
        for(int j = 1; j <= 6; j++) {
          int next = curr+j;
          if(visited.contains(next) || next > target)
             continue;
          
          visited.add(next);
          
          // if next move is a snake or ladder, advance to the position
          if(straightBoard[next] != -1) {
            if(!visited.contains(straightBoard[next]))
              queue.add(straightBoard[next]);
              // We do not add the jump as visited in case one of the [x+1 : x+6] moves lands
              // on the same spot and it has a snake or ladder
          }
          else {
            // Check make sure element was not added already because of snake or ladder
            if(!queue.contains(next))
              queue.add(next);     
          }
        }
      }
      moves++;
    }
    return -1;
  }
}
