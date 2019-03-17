package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0611;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0611 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,2,3,4};
    LeetCode0611 solution = new LeetCode0611();
    Assert.assertEquals(3, solution.triangleNumber(nums));
  }

  @Test
  public void testWithZeroLengths() {
    int[] nums = {0,0,2,2,3,4};
    LeetCode0611 solution = new LeetCode0611();
    Assert.assertEquals(3, solution.triangleNumber(nums));
  }

  @Test
  public void testAllZeros() {
    int[] nums = {0,0,0,0};
    LeetCode0611 solution = new LeetCode0611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0611 solution = new LeetCode0611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0611 solution = new LeetCode0611();
    Assert.assertEquals(0, solution.triangleNumber(nums));
  }
}
