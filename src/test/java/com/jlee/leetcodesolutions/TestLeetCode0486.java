package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0486;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0486 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 5, 2};
    LeetCode0486 solution = new LeetCode0486();
    Assert.assertFalse(solution.PredictTheWinner(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 5, 233, 7};
    LeetCode0486 solution = new LeetCode0486();
    Assert.assertTrue(solution.PredictTheWinner(nums));
  }

  @Test
  public void testZero() {
    int[] nums = {0};
    LeetCode0486 solution = new LeetCode0486();
    Assert.assertTrue(solution.PredictTheWinner(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0486 solution = new LeetCode0486();
    Assert.assertFalse(solution.PredictTheWinner(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0486 solution = new LeetCode0486();
    Assert.assertFalse(solution.PredictTheWinner(nums));
  }
}
