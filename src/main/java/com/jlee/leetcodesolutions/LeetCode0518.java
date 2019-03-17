package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0518 {
  /*
   * You are given coins of different denominations and a total amount of money.
   * Write a function to compute the number of combinations that make up that
   * amount. You may assume that you have infinite number of each kind of coin.
   * 
   * https://leetcode.com/problems/coin-change-2/
   */
  public int change(int amount, int[] coins) {
    return change(amount, coins, 0, new HashMap<>());      
  }
  
  private int change(int amount, int[] coins, int pos, HashMap<String,Integer> memo) {
    if(amount == 0)
      return 1;
    
    if(pos == coins.length)
      return 0;
    
    String key = amount + "-" + pos;
    if(memo.containsKey(key))
      return memo.get(key);
    
    int currAmount = 0;
    int count = 0;
    while(currAmount <= amount) {
      count += change(amount - currAmount, coins, pos+1, memo);
      currAmount += coins[pos];
    }
    memo.put(key, count);
    return count;
  }
}
