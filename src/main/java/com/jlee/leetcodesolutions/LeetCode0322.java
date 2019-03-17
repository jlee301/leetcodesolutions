package com.jlee.leetcodesolutions;

public class LeetCode0322 {
  /*
   * You are given coins of different denominations and a total amount of money
   * amount. Write a function to compute the fewest number of coins that you need
   * to make up that amount. If that amount of money cannot be made up by any
   * combination of the coins, return -1.
   * 
   * Example 1:
   * coins = [1, 2, 5], amount = 11
   * return 3 (11 = 5 + 5 + 1)
   * 
   * Example 2:
   * coins = [2], amount = 3
   * return -1.
   * 
   * Note:
   * You may assume that you have an infinite number of each kind of coin.
   * 
   * https://leetcode.com/problems/coin-change/description/
   */
  public int coinChange(int[] coins, int amount) {
    return coinChange(coins, amount, new int[amount+1]);
  }
  
  // If you comment out the memo caching, the function would run into a recursion
  // memory issue for larger sets of coins
  private int coinChange(int[] coins, int amount, int[] memo) {
    if(amount < 0)
      return -1;
    if(amount == 0)
      return 0;
    // Added for caching
    // memo[i] represents the minimum number of coins that add up to i amount
    if(memo[amount] != 0)
      return memo[amount];

    int minCount = Integer.MAX_VALUE;
    for(int coin : coins) {
      int count = coinChange(coins, amount-coin, memo);
      if(count != -1)
        minCount = Math.min(minCount, count+1);
    }
    // Added for caching
    memo[amount] = minCount == Integer.MAX_VALUE ? -1 : minCount;
    return memo[amount];
  }
}
