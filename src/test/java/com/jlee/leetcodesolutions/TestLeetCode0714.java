package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0714;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0714 {
  @Test
  public void testProblemCase() {
    int[] prices = {1, 3, 2, 8, 4, 9};
    int fee = 2;
    LeetCode0714 solution = new LeetCode0714();
    Assert.assertEquals(8, solution.maxProfit(prices, fee));
  }

  @Test
  public void testStockFlat() {
    int[] prices = {1, 1, 1, 1, 1, 1};
    int fee = 2;
    LeetCode0714 solution = new LeetCode0714();
    Assert.assertEquals(0, solution.maxProfit(prices, fee));
  }

  @Test
  public void testStockDecline() {
    int[] prices = {6, 5, 4, 3, 2, 1};
    int fee = 2;
    LeetCode0714 solution = new LeetCode0714();
    Assert.assertEquals(0, solution.maxProfit(prices, fee));
  }
}
