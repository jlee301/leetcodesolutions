package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode122;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode122 {
  @Test
  public void testProblemProfitCase() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {7, 1, 5, 3, 6, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(7, result);
  }

  @Test
  public void testProblemNoProfitCase() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {7, 6, 4, 3, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testLowHighLowHigh() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {1, 7, 5, 8};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(9, result);
  }
  
  @Test
  public void testHighLowHighLow() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {7, 1, 5, 8};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(7, result);
  }
  
  @Test
  public void testAsendingPrices() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {1, 2, 3, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testDesendingPrices() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {4, 3, 2, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testDotComCrisis() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {1, 2, 3, 4, 3, 2, 1, 0};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testOneDay() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testEmpty() {
    LeetCode122 solution = new LeetCode122();
    int[] prices = {};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNull() {
    LeetCode122 solution = new LeetCode122();
    int result = solution.maxProfit(null);
    Assert.assertEquals(0, result);
  }
}
