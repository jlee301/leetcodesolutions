package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0045;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0045 {
  @Test
  public void testProblemCase1() {
    int[] nums = {2,3,1,1,4};
    LeetCode0045 solution = new LeetCode0045();
    Assert.assertEquals(2, solution.jump(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {7,4};
    LeetCode0045 solution = new LeetCode0045();
    Assert.assertEquals(1, solution.jump(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {7};
    LeetCode0045 solution = new LeetCode0045();
    Assert.assertEquals(0, solution.jump(nums));
  }
}
