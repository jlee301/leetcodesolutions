package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode495;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode495 {
  @Test
  public void testProblemCase1() {
    int[] timeSeries = {1,4};
    int duration = 2;
    LeetCode495 solution = new LeetCode495();
    Assert.assertEquals(4, solution.findPoisonedDuration(timeSeries, duration));
  }

  @Test
  public void testProblemCase2() {
    int[] timeSeries = {1,2};
    int duration = 2;
    LeetCode495 solution = new LeetCode495();
    Assert.assertEquals(3, solution.findPoisonedDuration(timeSeries, duration));
  }

  @Test
  public void testEmpty() {
    int[] timeSeries = {};
    int duration = 2;
    LeetCode495 solution = new LeetCode495();
    Assert.assertEquals(0, solution.findPoisonedDuration(timeSeries, duration));
  }

  @Test
  public void testNull() {
    int[] timeSeries = null;
    int duration = 2;
    LeetCode495 solution = new LeetCode495();
    Assert.assertEquals(0, solution.findPoisonedDuration(timeSeries, duration));
  }
}
