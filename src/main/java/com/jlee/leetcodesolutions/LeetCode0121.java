package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode0121 {
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
      
      // Can any previous low/high be merged with the current
      // First clear any previous entries that cannot be merge
      if(high < prices.length) { 
        while(!valleys.isEmpty() && prices[low] < prices[valleys.peek()])
          pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
        
        // Second actual merging (where I have lower buying price than current)
        while(!valleys.isEmpty() && prices[high] >= prices[peaks.peek()]) {
          pq.add(prices[peaks.pop()] - prices[low]);
          low = valleys.pop();
        }
        valleys.add(low);
        peaks.add(high);
        low = high + 1;
      }
    }
    
    // Store remaining low/high into pq
    while(!valleys.isEmpty())
      pq.add(prices[peaks.pop()] - prices[valleys.pop()]);
    
    return pq.isEmpty() ? 0 : pq.poll();
  }
}
