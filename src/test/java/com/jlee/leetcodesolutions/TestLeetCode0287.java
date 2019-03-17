package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0287;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0287 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,4,6,6,6,2,3};
    LeetCode0287 solution = new LeetCode0287();
    Assert.assertEquals(6, solution.findDuplicate(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0287 solution = new LeetCode0287();
    Assert.assertEquals(0, solution.findDuplicate(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0287 solution = new LeetCode0287();
    Assert.assertEquals(0, solution.findDuplicate(nums));
  }
}
