package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0238;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0238 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3,4};
    LeetCode0238 solution = new LeetCode0238();
    Assert.assertArrayEquals(new int[] {24,12,8,6}, solution.productExceptSelf(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0238 solution = new LeetCode0238();
    Assert.assertArrayEquals(new int[] {}, solution.productExceptSelf(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0238 solution = new LeetCode0238();
    Assert.assertArrayEquals(new int[] {}, solution.productExceptSelf(nums));
  }
}
