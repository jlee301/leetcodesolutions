package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0456;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0456 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 2, 3, 4};
    LeetCode0456 solution = new LeetCode0456();
    Assert.assertFalse(solution.find132pattern(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3, 1, 4, 2};
    LeetCode0456 solution = new LeetCode0456();
    Assert.assertTrue(solution.find132pattern(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {-1, 3, 2, 0};
    LeetCode0456 solution = new LeetCode0456();
    Assert.assertTrue(solution.find132pattern(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0456 solution = new LeetCode0456();
    Assert.assertFalse(solution.find132pattern(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0456 solution = new LeetCode0456();
    Assert.assertFalse(solution.find132pattern(nums));
  }
}
