package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode309;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode309 {
  @Test
  public void testProblemCase() {
    int[] prices = {1, 2, 3, 0, 2};
    LeetCode309 solution = new LeetCode309();
    Assert.assertEquals(3, solution.maxProfit(prices));
  }

  @Test
  public void testNoProfits() {
    int[] prices = {5, 4, 3, 2, 1};
    LeetCode309 solution = new LeetCode309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }

  @Test
  public void testEmpty() {
    int[] prices = {};
    LeetCode309 solution = new LeetCode309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }

  @Test
  public void testNull() {
    int[] prices = null;
    LeetCode309 solution = new LeetCode309();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }
}
