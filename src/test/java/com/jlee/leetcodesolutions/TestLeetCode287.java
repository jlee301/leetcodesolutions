package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode287;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode287 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,4,6,6,6,2,3};
    LeetCode287 solution = new LeetCode287();
    Assert.assertEquals(6, solution.findDuplicate(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode287 solution = new LeetCode287();
    Assert.assertEquals(0, solution.findDuplicate(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode287 solution = new LeetCode287();
    Assert.assertEquals(0, solution.findDuplicate(nums));
  }
}
