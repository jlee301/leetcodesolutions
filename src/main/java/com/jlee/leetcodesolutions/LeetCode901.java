package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode901 {
  /*
   * Write a class StockSpanner which collects daily price quotes for some stock,
   * and returns the span of that stock's price for the current day.
   * 
   * The span of the stock's price today is defined as the maximum number of
   * consecutive days (starting from today and going backwards) for which the
   * price of the stock was less than or equal to today's price.
   * 
   * For example, if the price of a stock over the next 7 days were [100, 80, 60,
   * 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
   * 
   * https://leetcode.com/contest/weekly-contest-101/problems/online-stock-span/
   */
  private List<Integer> prices;
  private List<Integer> consDays;
  
  public LeetCode901() {
    // price[i] = price of ith day
    // consDays[i] = consecutive days where price[i] is >= previous days
    prices = new ArrayList<>();
    consDays = new ArrayList<>();
  }
  
  public int next(int price) {
    int span = 1;
    int N = prices.size();
    // We sum the consecutive days where curr price > than previous prices
    // We skip ahead the previous' day span 
    while(N > 0 && price >= prices.get(N-1)) {
      span += consDays.get(N-1);
      N -= consDays.get(N-1);
    }
    prices.add(price);
    consDays.add(span);
    return span;
  }
}
