package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode1033 {
  /*
   * https://leetcode.com/contest/weekly-contest-134/problems/moving-stones-until-consecutive/
   */
  public int[] numMovesStones(int a, int b, int c) {
    // a = 1, b = 3, c = 5
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(a);
    pq.add(b);
    pq.add(c);
    a = pq.poll();
    b = pq.poll();
    c = pq.poll();
    
    if(b == a+1 && c == b+1)
      return new int[] {0,0};
    
    int min = 0;
    int max = b - a - 1;
    max += c - b - 1;
    
    if(b == a+1 || c == b+1 || b-a == 2 || c-b == 2)
      min = 1;
    else
      min = 2;
    
    return new int[] {min, max};
  }
}
