package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode947 {
  /*
   * On a 2D plane, we place stones at some integer coordinate points. Each
   * coordinate point may have at most one stone.
   * 
   * Now, a move consists of removing a stone that shares a column or row with
   * another stone on the grid.
   * 
   * What is the largest possible number of moves we can make?
   * 
   * https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
   */
  public int removeStones(int[][] stones) {
    // Map all points for easier searching
    HashMap<Integer,HashSet<Integer>> cols = new HashMap<>();
    HashMap<Integer,HashSet<Integer>> rows = new HashMap<>();
    for(int[] pt : stones) {
      cols.computeIfAbsent(pt[0], k -> new HashSet<>()).add(pt[1]);
      rows.computeIfAbsent(pt[1], k -> new HashSet<>()).add(pt[0]);
    }
    
    // count represents the number of points that cannot be moved
    int count = 0;
    HashSet<String> visited = new HashSet<>();
    for(int[] pt : stones) {
      // We will go through each point and mark it as the sole point that cannot be moved
      // DFS expands visited to all connected points
      String key = pt[0] + "_" + pt[1];
      if(!visited.contains(key)) {
        visited.add(key);
        count++;
        dfs(pt[0], pt[1], rows, cols, visited);
      }
    }
    return stones.length - count;
  }
  
  // The DFS marks all points connected to (x,y) as visited
  private void dfs(int x, int y, HashMap<Integer,HashSet<Integer>> rows, HashMap<Integer,HashSet<Integer>> cols, HashSet<String> visited) {
    // Check all points connected by the same x
    for(int nextY : cols.get(x)) {
      String key = x + "_" + nextY;
      if(!visited.contains(key)) {
        visited.add(key);
        dfs(x, nextY, rows, cols, visited);
      }
    }
    
    // Check all points connected by the same y
    for(int nextX : rows.get(y)) {
      String key = nextX + "_" + y;
      if(!visited.contains(key)) {
        visited.add(key);
        dfs(nextX, y, rows, cols, visited);
      }
    }
  }
}
