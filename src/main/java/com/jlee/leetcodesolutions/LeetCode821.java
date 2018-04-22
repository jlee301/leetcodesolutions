package com.jlee.leetcodesolutions;

import java.util.TreeSet;

public class LeetCode821 {
  public int[] shortestToChar(String S, char C) {
    // Store all char C positions. Using TreeSet to utilize the built in ceiling and
    // floor functions.
    TreeSet<Integer> set = new TreeSet<>();
    for(int i = 0; i < S.length(); i++)
      if(S.charAt(i) == C)
        set.add(i);
    
    int[] result = new int[S.length()];
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(ch == C)
        result[i] = 0;
      else {
        // Least element greater than i
        Integer ceil = set.ceiling(i);
        // Greatest element less than i
        Integer floor = set.floor(i);
        
        if(ceil == null)
          result[i] = i - floor;
        else if(floor == null)
          result[i] = ceil - i;
        else {
          result[i] = Math.min(i - floor, ceil - i);
        }
      }
    }
    return result;
  }
}
