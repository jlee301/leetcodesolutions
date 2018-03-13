package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode322;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode322 {
  @Test
  public void testProblemCase1() {
    int[] coins = {1,2,5};
    int amount = 11;
    LeetCode322 solution = new LeetCode322();
    Assert.assertEquals(3, solution.coinChange(coins, amount));
  }

  @Test
  public void testProblemCase2() {
    int[] coins = {2};
    int amount = 3;
    LeetCode322 solution = new LeetCode322();
    Assert.assertEquals(-1, solution.coinChange(coins, amount));
  }

  @Test
  public void testProblemCase3() {
    int[] coins = {4,5};
    int amount = 12;
    LeetCode322 solution = new LeetCode322();
    Assert.assertEquals(3, solution.coinChange(coins, amount));
  }

  @Test
  public void testProblemCase4() {
    int[] coins = {3};
    int amount = 2;
    LeetCode322 solution = new LeetCode322();
    Assert.assertEquals(-1, solution.coinChange(coins, amount));
  }

  @Test
  public void testTLE() {
    int[] coins = {346,29,395,188,155,109};
    int amount = 9401;
    LeetCode322 solution = new LeetCode322();
    Assert.assertEquals(26, solution.coinChange(coins, amount));
  }
}
