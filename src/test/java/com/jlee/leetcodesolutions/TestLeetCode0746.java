package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0746;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0746 {
  @Test
  public void testProblemCase1() {
    int[] cost = {10, 15, 20};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(15, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testProblemCase2() {
    int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(6, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testCostLessToTakeMoreSteps() {
    int[] cost = {1, 5, 1};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(2, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testSameBothWays() {
    int[] cost = {1, 2, 1};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(2, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testCostNothing() {
    int[] cost = {0, 0, 0};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(0, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testTwoSteps1() {
    int[] cost = {1, 1};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(1, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testTwoSteps2() {
    int[] cost = {1, 2};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(1, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testTwoSteps3() {
    int[] cost = {2, 1};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(1, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testEmpty() {
    int[] cost = {};
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(0, solution.minCostClimbingStairs(cost));
  }

  @Test
  public void testNull() {
    int[] cost = null;
    LeetCode0746 solution = new LeetCode0746();
    Assert.assertEquals(0, solution.minCostClimbingStairs(cost));
  }
}
