package com.jlee.leetcodesolutions;

import java.util.List;

public class LeetCode0841 {
  /*
   * There are N rooms and you start in room 0. Each room has a distinct number in
   * 0, 1, 2, ..., N-1, and each room may have some keys to access the next room.
   * 
   * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j]
   * is an integer in [0, 1, ..., N-1] where N = rooms.length. A key rooms[i][j] =
   * v opens the room with number v.
   * 
   * Initially, all the rooms start locked (except for room 0).
   * 
   * You can walk back and forth between rooms freely.
   * 
   * Return true if and only if you can enter every room.
   * 
   * https://leetcode.com/contest/weekly-contest-86/problems/keys-and-rooms/
   */
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    dfs(rooms, visited, 0);
    
    // Check to see if all rooms were visited
    for(boolean room : visited) {
      if(!room) return false;
    }
    return true;
  }
  
  private void dfs(List<List<Integer>> rooms, boolean[] visited, int pos) {
    visited[pos] = true;
    for(int next : rooms.get(pos)) {
      if(visited[next]) continue;
      dfs(rooms, visited, next);
    }
  }
}
