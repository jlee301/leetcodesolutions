package com.jlee.leetcodesolutions;

public class LeetCode0335 {
  /*
   * You are given an array x of n positive numbers. You start at point (0,0) and
   * moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to
   * the south, x[3] metres to the east and so on. In other words, after each move
   * your direction changes counter-clockwise.
   * 
   * Write a one-pass algorithm with O(1) extra space to determine, if your path
   * crosses itself, or not.
   * 
   * https://leetcode.com/problems/self-crossing/description/
   */
  public boolean isSelfCrossing(int[] x) {
    // If there are not at least four lines, it is not possible to self cross
    if(x == null || x.length < 4)
      return false;
    
    for(int i = 3; i < x.length; i++) {
      // 1. Check if line 4 does not cross line 1
      //    Check if line 5 does not cross line 2
      //    Check if line 6 does not cross line 3
      //    etc etc etc
      if(x[i] >= x[i-2] && x[i-1] <= x[i-3])
        return true;
      
      // 2. Check if line 5 does not merge into line 1
      //    Check if line 6 does not merge into line 2
      //    Check if line 7 does not merge into line 3
      //    etc etc etc
      if(i > 3) {
        if(x[i-1] == x[i-3] && x[i] + x[i-4] >= x[i-2])
          return true;
      }
      
      // 3. Check if line 6 does not cross line 1
      //    Check if line 7 does not cross line 2
      //    Check if line 8 does not cross line 3
      //    i-4
      //    ┌──┐ 
      //    │i<┼─┐
      // i-3│ i-5│i-1
      //    └────┘
      //     i-2      
      if(i > 4) {
        if(x[i-2] >= x[i-4] && x[i] + x[i-4] >= x[i-2] && x[i-1] <= x[i-3] && x[i-1] + x[i-5] >= x[i-3])
            return true;
      }
    }
    return false;
  }
}
