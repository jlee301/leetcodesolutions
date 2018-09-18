package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode327;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode327 {
  @Test
  public void testProblemCase1() {
    int[] nums = {-2,5,-1};
    int lower = -2, upper = 2;
    LeetCode327 solution = new LeetCode327();
    Assert.assertEquals(3, solution.countRangeSum(nums, lower, upper));
  }
}
