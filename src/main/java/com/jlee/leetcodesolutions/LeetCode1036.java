package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1036 {
  /*
   * https://leetcode.com/problems/escape-a-large-maze/
   */
  private int max = 1_000_000;
  
  public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
    // Convert blocked into a String set for faster searches
    HashSet<String> roadBlocks = new HashSet<>();
    for(int[] block : blocked)
      roadBlocks.add(block[0] + "_" + block[1]);
    
    // If both sides are not enclosed, they should be able to reach each other
    return bfs(roadBlocks, source, target) && bfs(roadBlocks, target, source);
  }
  
  private boolean bfs(HashSet<String> roadBlocks, int[] source, int[] target) {
    int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
    HashSet<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    
    String start = source[0] + "_" + source[1];
    String end = target[0] + "_" + target[1];
    visited.add(start);
    queue.add(start);
    int count = 0;
    while(!queue.isEmpty()) {
      // If you are still able to move more than the number of blocks, then it is
      // possible to reach the target
      if(count == roadBlocks.size())
        return true;
      
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String curr = queue.poll();
        
        // The situation if the source and target are enclosed together
        if(curr.equals(end))
          return true;
        
        String[] sData = curr.split("_");
        int r = Integer.valueOf(sData[0]);
        int c = Integer.valueOf(sData[1]);
        for(int[] move : moves) {
          int nextR = r+move[0];
          int nextC = c+move[1];
          
          // Cannot enter boundary of the board
          if(nextR < 0 || nextR == max || nextC < 0 || nextC == max)
            continue;
          
          String key = nextR + "_" + nextC;
          if(visited.contains(key) || roadBlocks.contains(key))
            continue;
          
          visited.add(key);
          queue.add(key);
        }
      }
      count++;
    }
    return false;
  }
}
