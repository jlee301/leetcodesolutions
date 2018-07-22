package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode874 {
  /*
   * A robot on an infinite grid starts at point (0, 0) and faces north. The robot
   * can receive one of three possible types of commands:
   * 1. -2: turn left 90 degrees
   * 2. -1: turn right 90 degrees
   * 3. 1 <= x <= 9: move forward x units
   * 
   * Some of the grid squares are obstacles.
   * 
   * The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
   * 
   * If the robot would try to move onto them, the robot stays on the previous
   * grid square instead (but still continues following the rest of the route.)
   * 
   * Return the square of the maximum Euclidean distance that the robot will be
   * from the origin.
   * 
   * https://leetcode.com/contest/weekly-contest-94/problems/walking-robot-simulation/
   */
  public int robotSim(int[] commands, int[][] obstacles) {
    // Put all the the obstacles into a map for easier searches
    HashMap<Integer, HashSet<Integer>> obs = new HashMap<>();
    for(int[] obstacle : obstacles) {
      if(!obs.containsKey(obstacle[0]))
        obs.put(obstacle[0], new HashSet<>());
      obs.get(obstacle[0]).add(obstacle[1]);
    }
    
    int x = 0, y = 0;
    // Up, down, left, right
    int[][] moves = { {0,1}, {0,-1}, {-1,0}, {1,0} };
    int dir = 0;
    int move = 0;
    int result = 0;
    for(int com : commands) {
      if(com != -2 && com != -1) {
        for(int i = 0; i < com; i++) {
          int nextx = x + moves[move][0];
          int nexty = y + moves[move][1];
          // If the next move is an obstacle, stop moving
          if(obs.containsKey(nextx) && obs.get(nextx).contains(nexty))
            break;
          
          x = nextx;
          y = nexty;
          // We want the MAX Euclidean distance that the robot will travel
          result = Math.max(result, (x*x) + (y*y));
        }
        continue;
      }
      
      // turn left
      if(com == -2)
        dir -= 90;
      // turn right
      else
        dir += 90;
      
      // Move left
      if(dir == -90 || dir == 270)
        move = 2;
      // Move right
      else if(dir == 90 || dir == -270)
        move = 3;
      // Move down
      else if (dir == 180 || dir == -180)
        move = 1;
      // Move up
      else {
        move = 0;
        dir = 0;
      }
    }    
    return result;
  }
}
