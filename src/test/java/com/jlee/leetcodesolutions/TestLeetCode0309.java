package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0309;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0309 {
  @Test
  public void testProblemCase() {
    int[] prices = {1, 2, 3, 0, 2};
    LeetCode0309 solution = new LeetCode0309();
    Assert.assertEquals(3, solution.maxProfit(prices));
  }

  @Test
  public void testNoProfits() {
    int[] prices = {5, 4, 3, 2, 1};
    LeetCode0309 solution = new LeetCode0309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }

  @Test
  public void testEmpty() {
    int[] prices = {};
    LeetCode0309 solution = new LeetCode0309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }

  @Test
  public void testNull() {
    int[] prices = null;
    LeetCode0309 solution = new LeetCode0309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }
}
