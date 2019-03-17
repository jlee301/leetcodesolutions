package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0260;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0260 {
  @Test
  public void testProblemCase() {
    int[] nums = {1, 2, 1, 3, 2, 5};
    LeetCode0260 solution = new LeetCode0260();
    Assert.assertArrayEquals(new int[] {3,5}, solution.singleNumber(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {1};
    LeetCode0260 solution = new LeetCode0260();
    Assert.assertArrayEquals(new int[] {1,0}, solution.singleNumber(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0260 solution = new LeetCode0260();
    Assert.assertArrayEquals(new int[] {0,0}, solution.singleNumber(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0260 solution = new LeetCode0260();
    Assert.assertArrayEquals(new int[] {0,0}, solution.singleNumber(nums));
  }
}
