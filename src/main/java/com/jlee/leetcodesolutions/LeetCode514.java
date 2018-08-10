package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode514 {
  /*
   * https://leetcode.com/problems/freedom-trail/description/
   */
  public int findRotateSteps(String ring, String key) {
    return findRotateSteps(ring, key, 0, new HashMap<>());
  }
  
  private int findRotateSteps(String ring, String key, int pos, HashMap<String, HashMap<Integer,Integer>> memo) {
    if(pos == key.length())
      return 0;
    
    // memoization
    if(memo.containsKey(ring) && memo.get(ring).containsKey(pos))
      return memo.get(ring).get(pos);
    //
    
    // Find index going clockwise from current position
    // Find index going counter clockwise from current position
    char ch = key.charAt(pos);
    int fIdx = ring.indexOf(ch);
    int bIdx = findCounterChar(ring, ch);
    
    // Which requires less steps, going forward or backward?
    // + 1 == button press
    int forward = findRotateSteps(ring.substring(fIdx) + ring.substring(0, fIdx), key, pos+1, memo) + fIdx + 1;
    int backward = findRotateSteps(ring.substring(bIdx) + ring.substring(0, bIdx), key, pos+1, memo) + ring.length() - bIdx + 1;
    int steps = Math.min(forward, backward);
    
    // memoization
    HashMap<Integer,Integer> data = memo.getOrDefault(ring, new HashMap<>());
    data.put(pos, steps);
    memo.put(ring, data);
    //
    
    return steps;
  }
  
  // The ch should ALWAYS be found in ring, if not this will infinitely loop
  private int findCounterChar(String ring, char ch) {
    // Already sitting on top of the desired ch
    if(ring.charAt(0) == ch)
      return 0;
    
    int i = ring.length()-1;
    while(true) {
      if(ring.charAt(i) == ch)
        break;
      i--;
    }
    return i;
  }
}
