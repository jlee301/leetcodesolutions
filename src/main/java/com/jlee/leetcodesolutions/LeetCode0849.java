package com.jlee.leetcodesolutions;

import java.util.TreeSet;

public class LeetCode0849 {
  /*
   * In a row of seats, 1 represents a person sitting in that seat, and 0
   * represents that the seat is empty.
   * 
   * There is at least one empty seat, and at least one person sitting.
   * 
   * Alex wants to sit in the seat such that the distance between him and the
   * closest person to him is maximized.
   * 
   * Return that maximum distance to closest person.
   * 
   * https://leetcode.com/contest/weekly-contest-88/problems/maximize-distance-to-closest-person/
   */
  public int maxDistToClosest(int[] seats) {
    // Store location of every seat taken
    TreeSet<Integer> set = new TreeSet<>();
    for(int i = 0; i < seats.length; i++) {
      if(seats[i] == 1)
        set.add(i);
    }
    
    int max = 0;
    // Scan each empty seat for distance to nearest person
    for(int i = 0; i < seats.length; i++) {
      if(seats[i] == 0) {
        int dist = 0;
        Integer floor = set.floor(i);
        Integer ceil = set.ceiling(i);
        
        if(floor == null)
          dist = ceil - i;
        else if (ceil == null)
          dist = i - floor;
        else // Take the closest of the two
          dist = Math.min(ceil-i, i-floor);
        
        max = Math.max(max, dist);
      }
    }
    return max;
  }
}
