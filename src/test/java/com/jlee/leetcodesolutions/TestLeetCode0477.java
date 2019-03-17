package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0477;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0477 {
  @Test
  public void testProblemCase() {
    int[] nums = {4, 14, 2};
    LeetCode0477 solution = new LeetCode0477();
    Assert.assertEquals(6, solution.totalHammingDistance(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0477 solution = new LeetCode0477();
    Assert.assertEquals(0, solution.totalHammingDistance(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0477 solution = new LeetCode0477();
    Assert.assertEquals(0, solution.totalHammingDistance(nums));
  }
}
