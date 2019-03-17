package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode0464 {
  /*
   * In the "100 game," two players take turns adding, to a running total, any
   * integer from 1..10. The player who first causes the running total to reach or
   * exceed 100 wins.
   * 
   * What if we change the game so that players cannot re-use integers?
   * 
   * For example, two players might take turns drawing from a common pool of
   * numbers of 1..15 without replacement until they reach a total >= 100.
   * 
   * Given an integer maxChoosableInteger and another integer desiredTotal,
   * determine if the first player to move can force a win, assuming both players
   * play optimally.
   * 
   * You can always assume that maxChoosableInteger will not be larger than 20 and
   * desiredTotal will not be larger than 300.
   * 
   * https://leetcode.com/problems/can-i-win/description/
   */
  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    int sum = 0;
    for(int i = 1; i <= maxChoosableInteger; i++)
      sum += i;
    if(sum < desiredTotal)
      return false;
    if(desiredTotal <= 0)
      return true;
    
    // boolean[] used will be used as the key for the HashMap to keep track which
    // numbers have been used
    boolean[] used = new boolean[maxChoosableInteger+1];
    HashMap<String,Boolean> memo = new HashMap<>();
    return canIWin(desiredTotal, used, memo);
  }
  
  private boolean canIWin(int desiredTotal, boolean[] used, HashMap<String,Boolean> memo) {
    if(desiredTotal <= 0)
      return false;
    String key = Arrays.toString(used);
    if(!memo.containsKey(key)) {
      for(int i = 1; i < used.length; i++) {
        if(!used[i]) {
          used[i] = true;
          if(!canIWin(desiredTotal-i, used, memo)) {
            memo.put(key, true);
            used[i] = false;
            return true;
          }
          used[i] = false;
        }
      }
      memo.put(key, false);
    }
    return memo.get(key);
  }
}
