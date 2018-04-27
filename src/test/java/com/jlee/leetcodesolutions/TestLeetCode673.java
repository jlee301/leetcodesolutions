package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode673;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode673 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3,5,4,7};
    LeetCode673 solution = new LeetCode673();
    Assert.assertEquals(2, solution.findNumberOfLIS(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {2,2,2,2,2};
    LeetCode673 solution = new LeetCode673();
    Assert.assertEquals(5, solution.findNumberOfLIS(nums));
  }
}
