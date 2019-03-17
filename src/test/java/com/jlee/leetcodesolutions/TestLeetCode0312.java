package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0312;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0312 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3,1,5,8};
    LeetCode0312 solution = new LeetCode0312();
    Assert.assertEquals(167, solution.maxCoins(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,0,1,0,5,0,8};
    LeetCode0312 solution = new LeetCode0312();
    Assert.assertEquals(167, solution.maxCoins(nums));
  }
}
