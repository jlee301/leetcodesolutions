package com.jlee.leetcodesolutions;

public class LeetCode1094 {
  /*
   * https://leetcode.com/problems/car-pooling/
   */
  public boolean carPooling(int[][] trips, int capacity) {
    int[] load = new int[1001];
    for(int[] trip : trips) {
      for(int i = trip[1]; i < trip[2]; i++)
        load[i] += trip[0];
    }
    
    // Check to see if you exceed capacity at any point
    for(int i = 0; i < load.length; i++)
      if(load[i] > capacity)
        return false;
    
    return true;
  }
}
