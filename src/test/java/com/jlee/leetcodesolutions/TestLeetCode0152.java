package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0152;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0152 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,3,-2,4};
    LeetCode0152 solution = new LeetCode0152();
    Assert.assertEquals(6, solution.maxProduct(nums));
  }

  @Test
  public void testProductBiggerAtEnd() {
    int[] nums = {2,3,-2,4,5};
    LeetCode0152 solution = new LeetCode0152();
    Assert.assertEquals(20, solution.maxProduct(nums));
  }

  @Test
  public void testTwoNegatives() {
    int[] nums = {2,-3,-2,4};
    LeetCode0152 solution = new LeetCode0152();
    Assert.assertEquals(48, solution.maxProduct(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0152 solution = new LeetCode0152();
    Assert.assertEquals(Integer.MIN_VALUE, solution.maxProduct(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0152 solution = new LeetCode0152();
    Assert.assertEquals(Integer.MIN_VALUE, solution.maxProduct(nums));
  }
}
