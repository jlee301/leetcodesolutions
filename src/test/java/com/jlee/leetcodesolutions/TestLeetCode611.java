package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode611;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode611 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,2,3,4};
    LeetCode611 solution = new LeetCode611();
    Assert.assertEquals(3, solution.triangleNumber(nums));
  }

  @Test
  public void testWithZeroLengths() {
    int[] nums = {0,0,2,2,3,4};
    LeetCode611 solution = new LeetCode611();
    Assert.assertEquals(3, solution.triangleNumber(nums));
  }

  @Test
  public void testAllZeros() {
    int[] nums = {0,0,0,0};
    LeetCode611 solution = new LeetCode611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode611 solution = new LeetCode611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode611 solution = new LeetCode611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }
}
