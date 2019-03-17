package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0122;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0122 {
  @Test
  public void testProblemCase1() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {7, 1, 5, 3, 6, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(7, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {7, 6, 4, 3, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {1, 7, 5, 8};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(9, result);
  }
  
  @Test
  public void testProblemCase4() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {7, 1, 5, 8};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(7, result);
  }
  
  @Test
  public void testProblemCase5() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {1, 2, 3, 4};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {4, 3, 2, 1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {1, 2, 3, 4, 3, 2, 1, 0};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {1};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0122 solution = new LeetCode0122();
    int[] prices = {};
    int result = solution.maxProfit(prices);
    Assert.assertEquals(0, result);
  }
}
