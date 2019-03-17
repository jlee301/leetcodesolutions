package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0134;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0134 {
  @Test
  public void testCompleteCircuit() {
    int[] gas = {4,5};
    int[] cost = {5,4};
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(1, solution.canCompleteCircuit(gas, cost));
  }

  @Test
  public void testCannotComplete() {
    int[] gas = {4,5};
    int[] cost = {5,5};
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
  }

  @Test
  public void testGasEmpty() {
    int[] gas = {};
    int[] cost = {5,5};
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
  }

  @Test
  public void testCostEmpty() {
    int[] gas = {4,5};
    int[] cost = {};
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
  }

  @Test
  public void testGasNull() {
    int[] gas = null;
    int[] cost = {5,5};
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
  }

  @Test
  public void testCostNull() {
    int[] gas = {4,5};
    int[] cost = null;
    LeetCode0134 solution = new LeetCode0134();
    Assert.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
  }
}
