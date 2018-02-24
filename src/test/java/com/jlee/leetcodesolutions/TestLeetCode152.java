package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode152;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode152 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,3,-2,4};
    LeetCode152 solution = new LeetCode152();
    Assert.assertEquals(6, solution.maxProduct(nums));
  }

  @Test
  public void testProductBiggerAtEnd() {
    int[] nums = {2,3,-2,4,5};
    LeetCode152 solution = new LeetCode152();
    Assert.assertEquals(20, solution.maxProduct(nums));
  }

  @Test
  public void testTwoNegatives() {
    int[] nums = {2,-3,-2,4};
    LeetCode152 solution = new LeetCode152();
    Assert.assertEquals(48, solution.maxProduct(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode152 solution = new LeetCode152();
    Assert.assertEquals(Integer.MIN_VALUE, solution.maxProduct(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode152 solution = new LeetCode152();
    Assert.assertEquals(Integer.MIN_VALUE, solution.maxProduct(nums));
  }
}
