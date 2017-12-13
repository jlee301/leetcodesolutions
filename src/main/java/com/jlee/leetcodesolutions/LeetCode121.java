package com.jlee.leetcodesolutions;

public class LeetCode121 {
  /*
   * Say you have an array for which the ith element is the price of a given stock
   * on day i.
   * 
   * If you were only permitted to complete at most one transaction (ie, buy one
   * and sell one share of the stock), design an algorithm to find the maximum
   * profit.
   * 
   * Input: [7, 1, 5, 3, 6, 4]
   * Output: 5
   * 
   * Input: [7, 6, 4, 3, 1]
   * Output: 0
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
   */
  public int maxProfit(int[] prices) {
    int result = 0;
    if(prices == null || prices.length == 0)
      return result;
    
    for(int i = 0; i < prices.length - 1; i++) {
      // We use prices.length - 1 because we will not be buying on last day
      for(int j = i + 1; j < prices.length; j++) {
        int profit = prices[j] - prices[i];
        if(profit > 0 && profit > result)
          result = profit;
        
        // System.out.println("buy: " + prices[i]);
        // System.out.println("sell: " + prices[j]);
        // System.out.println("maxProfit: " + result);
      }
    }
    return result;
  }
}
