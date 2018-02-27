package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode179;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode179 {
  @Test
  public void testProblemCase() {
    int[] nums = {3,30,34,5,9};
    LeetCode179 solution = new LeetCode179();
    Assert.assertEquals("9534330", solution.largestNumber(nums));
  }

  @Test
  public void testAllZeroes() {
    int[] nums = {0,0,0,0,0};
    LeetCode179 solution = new LeetCode179();
    Assert.assertEquals("0", solution.largestNumber(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode179 solution = new LeetCode179();
    Assert.assertEquals("", solution.largestNumber(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode179 solution = new LeetCode179();
    Assert.assertEquals("", solution.largestNumber(nums));
  }
}
