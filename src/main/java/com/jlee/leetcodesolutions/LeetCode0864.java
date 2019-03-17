package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0864 {
  /*
   * We are given a 2-dimensional grid. "." is an empty cell, "#" is a wall, "@"
   * is the starting point, ("a", "b", ...) are keys, and ("A", "B", ...) are
   * locks.
   * 
   * We start at the starting point, and one move consists of walking one space in
   * one of the 4 cardinal directions. We cannot walk outside the grid, or walk
   * into a wall. If we walk over a key, we pick it up. We can't walk over a lock
   * unless we have the corresponding key.
   * 
   * For some 1 <= K <= 6, there is exactly one lowercase and one uppercase letter
   * of the first K letters of the English alphabet in the grid. This means that
   * there is exactly one key for each lock, and one lock for each key; and also
   * that the letters used to represent the keys and locks were chosen in the same
   * order as the English alphabet.
   * 
   * Return the lowest number of moves to acquire all keys. If it's impossible,
   * return -1.
   * 
   * https://leetcode.com/problems/shortest-path-to-get-all-keys/description/
   */
  public int shortestPathAllKeys(String[] grid) {
    // Scan the grid for the starting point and max key
    int x = 0, y = 0, target = 0, R = grid.length, C = grid[0].length();
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++) {
        char ch = grid[r].charAt(c);
        if(ch == '@') {
          x = r;
          y = c;
        }
        // We will be using binary representation of the keys we obtained.
        if(ch >= 'a' && ch <= 'f')
          target |= 1 << (ch - 'a');
      }
    }
    
    // BFS
    Queue<State> queue = new LinkedList<>();
    queue.add(new State(0, x, y));
    HashSet<String> visited = new HashSet<>();
    visited.add(0 + "-" + x + "-" + y);
    int[][] moves = { {0,1}, {0,-1}, {-1,0}, {1,0} };
    int steps = 0;
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        State curr = queue.poll();
        if(curr.keys == target)
          return steps;
        
        // Check cardinal directions for next move
        for(int[] move : moves) {
          x = curr.x + move[0];
          y = curr.y + move[1];

          // Out of bounds
          if(x < 0 || x == R || y < 0 || y == C) 
            continue;

          char ch = grid[x].charAt(y);
          // Wall, cannot advance this direction
          if(ch == '#') 
            continue;
          
          int keys = curr.keys;
          if(ch >= 'A' && ch <= 'F') {
            // I do not have the key to open the lock
            if(((keys >> (ch - 'A')) & 1) == 0)
              continue;
          }
          
          // Found a key, add to current set of keys
          if(ch >= 'a' && ch <= 'f')
            keys |= 1 << (ch - 'a');
          
          if(!visited.contains(keys + "-" + x + "-" + y)) {
            queue.add(new State(keys, x, y));
            visited.add(keys + "-" + x + "-" + y);
          }
        }
      }
      steps++;
    }
    return -1;
  }
  
  private class State {
    public int keys;
    public int x;
    public int y;
    
    State(int keys, int x, int y) {
      this.keys = keys;
      this.x = x;
      this.y = y;
    }
  }
}
