package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode137;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode137 {
  @Test
  public void testSingleNumber() {
    int[] nums = {1};
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(1, solution.singleNumber(nums));
  }

  @Test
  public void testSingleNumberBegin() {
    int[] nums = {1,2,2,2};
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(1, solution.singleNumber(nums));
  }

  @Test
  public void testSingleNumberMiddle() {
    int[] nums = {2,2,2,3,4,4,4};
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(3, solution.singleNumber(nums));
  }

  @Test
  public void testSingleNumberEnd() {
    int[] nums = {2,2,2,3};
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(3, solution.singleNumber(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(Integer.MIN_VALUE, solution.singleNumber(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode137 solution = new LeetCode137();
    Assert.assertEquals(Integer.MIN_VALUE, solution.singleNumber(nums));
  }
}
