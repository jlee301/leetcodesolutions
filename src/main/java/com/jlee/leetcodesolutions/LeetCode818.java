package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Queue;

public class LeetCode818 {
  /*
   * Your car starts at position 0 and speed +1 on an infinite number line. (Your
   * car can go into negative positions.)
   * 
   * Your car drives automatically according to a sequence of instructions A
   * (accelerate) and R (reverse).
   * 
   * When you get an instruction "A", your car does the following: position +=
   * speed, speed *= 2.
   * 
   * When you get an instruction "R", your car does the following: if your speed
   * is positive then speed = -1 , otherwise speed = 1. (Your position stays the
   * same.)
   * 
   * For example, after commands "AAR", your car goes to positions 0->1->3->3, and
   * your speed goes to 1->2->4->-1.
   * 
   * Now for some target position, say the length of the shortest sequence of
   * instructions to get there.
   * 
   * Note:
   * 1. 1 <= target <= 10000.
   * 
   * https://leetcode.com/problems/race-car/description/
   */
  private class RaceData {
    private int pos;
    private int speed;
    RaceData(int a, int b) {
      pos = a;
      speed = b;
    }
  }
  
  public int racecar(int target) {
    Queue<RaceData> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    // position -- speed
    queue.add(new RaceData(0, 1));
    visited.add("0 -- 1");

    int sequence = 0;
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        RaceData curr = queue.poll();
        
        if(curr.pos == target) 
          return sequence;
        
        // Proceeding you have two choices, A or R
        String A = (curr.pos+curr.speed) + " -- " + (2*curr.speed);
        String R = curr.pos + " -- " + (curr.speed > 0 ? -1 : 1);
        
        // If already past the target, we are not going further past
        if(Math.abs(curr.pos - target) <= target) {
          if(!visited.contains(A)) {
            queue.add(new RaceData(curr.pos+curr.speed, 2*curr.speed));
            visited.add(A);
          }
          
          if(!visited.contains(R)) {
            queue.add(new RaceData(curr.pos, curr.speed > 0 ? -1 : 1));
            visited.add(R);
          }          
        }
      }
      sequence++;
    }
    return -1;
  }
}
