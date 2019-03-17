package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0970 {
  /*
   * https://leetcode.com/contest/weekly-contest-118/problems/powerful-integers/
   */
  public List<Integer> powerfulIntegers(int x, int y, int bound) {
    if(bound == 0)
      return new ArrayList<>();
    
    List<Integer> result = new ArrayList<>();
    int sum = 0;
    int xpow = 0;
    for(int i = 0; xpow < bound; i++) {
      xpow = (int) Math.pow(x, i);
      int ypow = 0;
      for(int j = 0; ypow < bound; j++) {
        ypow = (int) Math.pow(y, j);
        sum = xpow + ypow;
        if(sum <= bound && !result.contains(sum))
          result.add(sum);
        
        if(y == 1) {
          // avoid infinite loop
          break;
        }
      }
      if(x == 1) {
        // avoid infinite loop
        break;
      }
    }
    return result;
  }
}
