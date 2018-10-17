package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode188 {
  /*
   * Say you have an array for which the ith element is the price of a given stock
   * on day i.
   * 
   * Design an algorithm to find the maximum profit. You may complete at most k
   * transactions.
   * 
   * Note:
   * You may not engage in multiple transactions at the same time (ie, you must
   * sell the stock before you buy again).
   * 
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/
   */
  public int maxProfit(int k, int[] prices) {
    // 1 transaction is a buy then sell
    // Find all the low -> max points, add the difference to the queue
    // Sum up the top k items in the queue for max profit
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    Stack<Integer> valleys = new Stack<>();
    Stack<Integer> peaks = new Stack<>();
    int low = 0, high = 1;
    while(low < prices.length-1) {
      // find next lowest point
      while(low < prices.length-1 && prices[low] >= prices[low+1]) {
        high = low+2;
        low = low+1;
      }
      
      // find next highest point
      while(high < prices.length-1 && prices[high] <= prices[high+1]) {
        high = high+1;
      }
      
      // check to see if there are any merges we can apply
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
    
    while(!valleys.isEmpty())
      pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
    
    int profit = 0;
    while(!pq.isEmpty() && k > 0) {
      profit += pq.poll();
      k--;
    }
    return profit;
  }
}
