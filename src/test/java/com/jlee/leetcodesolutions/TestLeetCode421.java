package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode421;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode421 {
  @Test
  public void testProblemCase() {
    int[] nums = {3, 10, 5, 25, 2, 8};
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(28, solution.findMaximumXOR(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(0, solution.findMaximumXOR(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(0, solution.findMaximumXOR(nums));
  }

  @Test
  public void testProblemCaseImproved() {
    int[] nums = {3, 10, 5, 25, 2, 8};
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(28, solution.findMaximumXORImproved(nums));
  }

  @Test
  public void testEmptyImproved() {
    int[] nums = {};
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(0, solution.findMaximumXORImproved(nums));
  }

  @Test
  public void testNullImproved() {
    int[] nums = null;
    LeetCode421 solution = new LeetCode421();
    Assert.assertEquals(0, solution.findMaximumXORImproved(nums));
  }
}
