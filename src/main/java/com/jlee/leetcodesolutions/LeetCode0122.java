package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode0122 {
  /*
   * Say you have an array for which the ith element is the price of a given stock
   * on day i.
   * 
   * Design an algorithm to find the maximum profit. You may complete as many
   * transactions as you like (ie, buy one and sell one share of the stock
   * multiple times). However, you may not engage in multiple transactions at the
   * same time (ie, you must sell the stock before you buy again).
   * 
   * Input: [7, 1, 5, 3, 6, 4]
   * Output: 7
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
   */
  public int maxProfit(int[] prices) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    Stack<Integer> valleys = new Stack<>();
    Stack<Integer> peaks = new Stack<>();
    
    int low = 0, high = 0;
    while(low < prices.length-1) {
      // Find next lowest price
      while(low < prices.length-1 && prices[low] >= prices[low+1])
        low++;
      
      // Find next highest price
      high = low + 1;
      while(high < prices.length-1 && prices[high] <= prices[high+1])
        high++;
      
      if(high < prices.length) { 
        valleys.add(low);
        peaks.add(high);
        low = high + 1;
      }
    }
    
    // Store remaining low/high into pq
    while(!valleys.isEmpty())
      pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
    
    int profit = 0;
    while(!pq.isEmpty())
      profit += pq.poll();

    return profit;
  }
}
