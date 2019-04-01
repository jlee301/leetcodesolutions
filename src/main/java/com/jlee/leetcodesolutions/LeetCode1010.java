package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1010 {
  /*
   * https://leetcode.com/contest/weekly-contest-128/problems/pairs-of-songs-with-total-durations-divisible-by-60/
   */
  public int numPairsDivisibleBy60(int[] time) {
    // 30,20,150,100,40
    // 60, 120, 180, 240, 300, 360, 420, 480, 540, 600, 660, 720, 780, 840, 900, 960
    int count = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int t : time) {
      // Check each increment of 60 to see if I have a value that is divisible
      for(int inc = 60; inc <= 960; inc += 60)
        count += map.getOrDefault(inc - t, 0);
      
      map.put(t, map.getOrDefault(t, 0) + 1);
    }
    
    return count;
  }
}
