package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0752 {
  /*
   * You have a lock in front of you with 4 circular wheels. Each wheel has 10
   * slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can
   * rotate freely and wrap around: for example we can turn '9' to be '0', or '0'
   * to be '9'. Each move consists of turning one wheel one slot.
   * 
   * The lock initially starts at '0000', a string representing the state of the 4
   * wheels.
   * 
   * You are given a list of deadends dead ends, meaning if the lock displays any
   * of these codes, the wheels of the lock will stop turning and you will be
   * unable to open it.
   * 
   * Given a target representing the value of the wheels that will unlock the
   * lock, return the minimum total number of turns required to open the lock, or
   * -1 if it is impossible.
   * 
   * Note:
   * 1. The length of deadends will be in the range [1, 500].
   * 2. target will not be in the list deadends.
   * 3. Every string in deadends and the string target will be a string of 4
   * digits from the 10,000 possibilities '0000' to '9999'.
   *
   * https://leetcode.com/problems/open-the-lock/description/
   */
  public int openLock(String[] deadends, String target) {
    // Make deadends easily searchable
    HashSet<String> dead = new HashSet<>(Arrays.asList(deadends));
    HashSet<String> used = new HashSet<>();
    Queue<String> queue = new LinkedList<>();

    // This should only occur if 0000 is a dead code
    if(dead.contains("0000")) return -1;
    
    queue.add("0000");
    used.add("0000");
    // Generate all possible turn combinations
    // turn 1: 0000 -> 1000, 0100, 0010, 0001, 9000, 0900, 0090, 0009
    //
    // turn 2: 1000 -> 2000, 1100, 1010, 1001, 0000, 1900, 1090, 1009
    //         0100 -> 1100, 0200, 0110, 0101, 9100, 0000, 0190, 0109
    //         0010 -> etc etc etc
    int turns = 0;
    while(!queue.isEmpty()) {
      // Keep track of all possible combinations from previous turn
      int prev = queue.size();
      while(prev > 0) {
        String temp = queue.poll();
        if(temp.equals(target)) 
          return turns;
        
        for(int i = 0; i < 4; i++) {
          char ch = temp.charAt(i);
          String add = temp.substring(0, i) + (ch == '9' ? 0 : ch - '0' + 1) + temp.substring(i+1);
          String sub = temp.substring(0, i) + (ch == '0' ? 9 : ch - '0' - 1) + temp.substring(i+1);
          
          if(!dead.contains(add) && !used.contains(add)) {
            queue.add(add);
            used.add(add);
          }
          
          if(!dead.contains(sub) && !used.contains(sub)) {
            queue.add(sub);
            used.add(sub);
          }
        }
        prev--;        
      }
      turns++;
    }
    return -1;
  }
}
