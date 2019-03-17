package com.jlee.leetcodesolutions;

public class LeetCode0309 {
  /*
   * Say you have an array for which the ith element is the price of a given stock
   * on day i.
   * 
   * Design an algorithm to find the maximum profit. You may complete as many
   * transactions as you like (ie, buy one and sell one share of the stock
   * multiple times) with the following restrictions:
   * 1. You may not engage in multiple transactions at the same time (ie, you must
   * sell the stock before you buy again).
   * 2. After you sell your stock, you cannot buy stock on next day. (ie, cooldown
   * 1 day)
   * 
   * Example:
   * prices = [1, 2, 3, 0, 2]
   * maxProfit = 3
   * transactions = [buy, sell, cooldown, buy, sell]
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
   */
  public int maxProfit(int[] prices) {
    if(prices == null || prices.length < 2)
      return 0;
    int buy = -prices[0], sell = 0, rest = 0;
    for(int i = 1; i < prices.length; i++) {
      int prevbuy = buy;
      // If we want you buy today, then i-1 is a rest, take the max(buy, rest-prices[i])
      buy = Math.max(buy, rest-prices[i]);
      // If we want to rest today, then i-1 is a rest or sell, take the max(rest, sell)
      rest = Math.max(rest,  sell);
      // If we want to sell today, then take the max(sell, i-1's buy + prices[i])
      sell = Math.max(sell, prevbuy+prices[i]);      
    }
    return sell > rest ? sell : rest;
  }
}
