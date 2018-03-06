package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode238;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode238 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3,4};
    LeetCode238 solution = new LeetCode238();
    Assert.assertArrayEquals(new int[] {24,12,8,6}, solution.productExceptSelf(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode238 solution = new LeetCode238();
    Assert.assertArrayEquals(new int[] {}, solution.productExceptSelf(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode238 solution = new LeetCode238();
    Assert.assertArrayEquals(new int[] {}, solution.productExceptSelf(nums));
  }
}
