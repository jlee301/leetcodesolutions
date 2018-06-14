package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode765 {
  /*
   * N couples sit in 2N seats arranged in a row and want to hold hands. We want
   * to know the minimum number of swaps so that every couple is sitting side by
   * side. A swap consists of choosing any two people, then they stand up and
   * switch seats.
   * 
   * The people and seats are represented by an integer from 0 to 2N-1, the
   * couples are numbered in order, the first couple being (0, 1), the second
   * couple being (2, 3), and so on with the last couple being (2N-2, 2N-1).
   * 
   * The couples' initial seating is given by row[i] being the value of the person
   * who is initially sitting in the i-th seat.
   * 
   * https://leetcode.com/problems/couples-holding-hands/description/
   */
  public int minSwapsCouples(int[] row) {
    int N = row.length;
    
    // Map every current pairing
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < N; i = i + 2) {
      map.put(row[i], row[i+1]);
      map.put(row[i+1], row[i]);
    }
    
    int swap = 0;
    for(int i = 0; i < N; i = i + 2) {
      int curr = map.get(i);
      if(curr != i+1) {
        // Swap data around
        int next = map.get(i+1);
        map.put(i, i+1);
        map.put(i+1, i);
        map.put(curr, next);
        map.put(next, curr);
        swap++;
      }
    }
    return swap;
  }
}
