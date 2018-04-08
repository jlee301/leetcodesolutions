package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode494;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode494 {
  @Test
  public void testProblemCase() {
    int[] nums = {1, 1, 1, 1, 1};
    int S = 3;
    LeetCode494 solution = new LeetCode494();
    Assert.assertEquals(5, solution.findTargetSumWays(nums, S));
  }

  @Test
  public void testAllNegative() {
    int[] nums = {1, 1, 1, 1, 1};
    int S = -5;
    LeetCode494 solution = new LeetCode494();
    Assert.assertEquals(1, solution.findTargetSumWays(nums, S));
  }

  @Test
  public void testAllPositive() {
    int[] nums = {1, 1, 1, 1, 1};
    int S = 5;
    LeetCode494 solution = new LeetCode494();
    Assert.assertEquals(1, solution.findTargetSumWays(nums, S));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int S = 3;
    LeetCode494 solution = new LeetCode494();
    Assert.assertEquals(0, solution.findTargetSumWays(nums, S));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int S = 3;
    LeetCode494 solution = new LeetCode494();
    Assert.assertEquals(0, solution.findTargetSumWays(nums, S));
  }
}
