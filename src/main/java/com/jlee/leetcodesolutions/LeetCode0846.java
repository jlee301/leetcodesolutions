package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode0846 {
  /*
   * Alice has a hand of cards, given as an array of integers.
   * 
   * Now she wants to rearrange the cards into groups so that each group is size
   * W, and consists of W consecutive cards.
   * 
   * Return true if and only if she can.
   * 
   * Note:
   * 1. 1 <= hand.length <= 10000
   * 2. 0 <= hand[i] <= 10^9
   * 3. 1 <= W <= hand.length
   * 
   * https://leetcode.com/contest/weekly-contest-87/problems/hand-of-straights/
   */
  public boolean isNStraightHand(int[] hand, int W) {
    // Can you split the hand W times containing W cards each?
    if(hand.length % W != 0 || hand.length / W != W)
      return false;
    
    // Generate counts
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int card : hand)
      map.put(card, map.getOrDefault(card, 0) + 1);
    
    while(!map.isEmpty()) {
      int key = map.firstKey();
      int value = map.get(key);
      // Last entry when used
      if(value == 1)
        map.remove(key);
      else
        map.put(key, value-1);
      
      // Now get W consecutive numbers
      for(int i = 1; i < W; i++) {
        int nextValue = map.getOrDefault(key+i, 0);
        if(nextValue == 0)
          return false;
        
        // Last entry when used
        if(nextValue == 1)
          map.remove(key+i);
        else
          map.put(key+i, nextValue-1);
      }
    }
    return true;
  }
}
