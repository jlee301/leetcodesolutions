package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode416;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode416 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 5, 11, 5};
    LeetCode416 solution = new LeetCode416();
    Assert.assertTrue(solution.canPartition(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2, 3, 5};
    LeetCode416 solution = new LeetCode416();
    Assert.assertFalse(solution.canPartition(nums));
  }
  
  @Test
  public void testTLE() {
    int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100 };
    LeetCode416 solution = new LeetCode416();
    Assert.assertFalse(solution.canPartition(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode416 solution = new LeetCode416();
    Assert.assertTrue(solution.canPartition(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode416 solution = new LeetCode416();
    Assert.assertFalse(solution.canPartition(nums));
  }
}
