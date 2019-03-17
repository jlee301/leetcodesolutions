package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode0123 {
  /*
   * Say you have an array for which the ith element is the price of a given stock
   * on day i.
   * 
   * Design an algorithm to find the maximum profit. You may complete at most two
   * transactions.
   * 
   * Note: You may not engage in multiple transactions at the same time (i.e., you
   * must sell the stock before you buy again).
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
   */
  public int maxProfit(int[] prices) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    Stack<Integer> valleys = new Stack<>();
    Stack<Integer> peaks = new Stack<>();
    
    // find all low to high
    int low = 0, high = 1;
    while(low < prices.length-1) {
      // find lowest point
      while(low < prices.length-1 && prices[low] >= prices[low+1])
        low++;
      high = low + 1;
      
      // find highest point
      while(high < prices.length-1 && prices[high] <= prices[high+1])
        high++;
      
      // can we merge this with any previous rises
      if(high < prices.length) {
        while(!valleys.isEmpty() && prices[low] < prices[valleys.peek()])
          pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
        
        while(!valleys.isEmpty() && prices[high] >= prices[peaks.peek()]) {
          pq.add(prices[peaks.pop()] - prices[low]);
          low = valleys.pop();
        }
        valleys.add(low);
        peaks.add(high);
        
        low = high + 1;
        high = low + 1;
      }
    }
    
    // add remaining rises into queue
    while(!valleys.isEmpty())
      pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
    
    int profit = 0, k = 2;
    while(!pq.isEmpty() && k > 0) {
      profit += pq.poll();
      k--;
    }
    return profit;
  }
}
