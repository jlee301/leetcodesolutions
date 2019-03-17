package com.jlee.leetcodesolutions;

public class LeetCode0714 {
  /*
   * Your are given an array of integers prices, for which the i-th element is the
   * price of a given stock on day i; and a non-negative integer fee representing
   * a transaction fee.
   * 
   * You may complete as many transactions as you like, but you need to pay the
   * transaction fee for each transaction. You may not buy more than 1 share of a
   * stock at a time (ie. you must sell the stock share before you buy again.)
   * 
   * Return the maximum profit you can make.
   * 
   * Note:
   * 1. 0 < prices.length <= 50000.
   * 2. 0 < prices[i] < 50000.
   * 3. 0 <= fee < 50000.
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
   */
  public int maxProfit(int[] prices, int fee) {
    // hold[i] = max price I have paid for stock on ith day
    // sell[i] = max profit I have for selling stock on ith day
    int[] hold = new int[prices.length];
    int[] sell = new int[prices.length];
    hold[0] = -prices[0]; // Assume I buy on day 1
    for(int i = 1; i < prices.length; i++) {
      hold[i] = Math.max(hold[i-1], sell[i-1]-prices[i]);
      sell[i] = Math.max(sell[i-1], hold[i-1]+prices[i]-fee);
    }
    return sell[prices.length-1];
  }
}
