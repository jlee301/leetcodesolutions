package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode1046 {
  /*
   * https://leetcode.com/problems/last-stone-weight/
   */
  public int lastStoneWeight(int[] stones) {
    // Dump all stones into a priority queue in descending order
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    for(int stone : stones)
      pq.add(stone);
    
    while(pq.size() > 1) {
      int y = pq.poll();
      int x = pq.poll();
      if(x < y)
        pq.add(y - x);
      
      // If x == y, both are eliminated
    }
    return pq.isEmpty() ? 0 : pq.poll();
  }
}
