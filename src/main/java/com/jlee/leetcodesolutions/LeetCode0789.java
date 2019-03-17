package com.jlee.leetcodesolutions;

public class LeetCode0789 {
  /*
   * You are playing a simplified Pacman game. You start at the point (0, 0), and
   * your destination is (target[0], target[1]). There are several ghosts on the
   * map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).
   * 
   * Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal
   * directions: north, east, west, or south, going from the previous point to a
   * new point 1 unit of distance away.
   * 
   * You escape if and only if you can reach the target before any ghost reaches
   * you (for any given moves the ghosts may take.) If you reach any square
   * (including the target) at the same time as a ghost, it doesn't count as an
   * escape.
   * 
   * Return True if and only if it is possible to escape.
   * 
   * Note:
   * 1. All points have coordinates with absolute value <= 10000.
   * 2. The number of ghosts will not exceed 100.
   * 
   * https://leetcode.com/problems/escape-the-ghosts/description/
   */
  public boolean escapeGhosts(int[][] ghosts, int[] target) {
    // Calculate the min distance to travel to get to the target
    int dist = Math.abs(target[0]) + Math.abs(target[1]);
    
    // Calculate the min distance to travel for each ghost
    for(int[] ghost : ghosts) {
      // If any ghost has same min distance or less, then it is not possible
      if(dist >= Math.abs(ghost[0] - target[0]) + Math.abs(ghost[1] - target[1]))
        return false;
    }
    return true;
  }
}
