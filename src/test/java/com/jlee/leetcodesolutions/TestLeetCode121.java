package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode121;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode121 {
  @Test
  public void testProblemProfitCase() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {7, 1, 5, 3, 6, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemNoProfitCase() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {7, 6, 4, 3, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testAsendingPrices() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {1, 2, 3, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testDesendingPrices() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {4, 3, 2, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testDotComCrisis() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {1, 2, 3, 4, 3, 2, 1, 0};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testOneDay() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testEmpty() {
    LeetCode121 solution = new LeetCode121();
    int[] prices = {};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNull() {
    LeetCode121 solution = new LeetCode121();
    int result = solution.maxProfit(null);
    Assert.assertEquals(0, result);
  }
}
