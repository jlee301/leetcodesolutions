package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode954 {
  /*
   * Given an array of integers A with even length, return true if and only if it
   * is possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every 0
   * <= i < len(A) / 2.
   * 
   * https://leetcode.com/problems/array-of-doubled-pairs/
   */
  public boolean canReorderDoubled(int[] A) {
    // Add all integers into queue
    // Sort by absolute ascending order
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Math.abs(a) - Math.abs(b));
    for(int n : A)
      pq.add(n);
    
    while(!pq.isEmpty()) {
      // x = current lowest absolute integer in the queue
      int x = pq.poll();
      
      // Now find it's corresponding pair y (2x)
      int y = 2 * x;
      if(!pq.remove(y))
        return false;
    }
    return true;
  }
}
