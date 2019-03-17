package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0933 {
  /*
   * https://leetcode.com/contest/weekly-contest-109/problems/number-of-recent-calls/
   */
  private Queue<Integer> queue;
  
  public LeetCode0933() {
    // queue stores t values
    queue = new LinkedList<>();
  }
  
  public int ping(int t) {
    // evict all t values less than t - 3000
    int eviction = t - 3000;
    while(!queue.isEmpty() && queue.peek() < eviction)
      queue.poll();
    queue.add(t);
        
    return queue.size();
  }
}
