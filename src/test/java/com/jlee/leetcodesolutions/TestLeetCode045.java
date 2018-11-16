package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode045;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode045 {
  @Test
  public void testProblemCase1() {
    int[] nums = {2,3,1,1,4};
    LeetCode045 solution = new LeetCode045();
    Assert.assertEquals(2, solution.jump(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {7,4};
    LeetCode045 solution = new LeetCode045();
    Assert.assertEquals(1, solution.jump(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {7};
    LeetCode045 solution = new LeetCode045();
    Assert.assertEquals(0, solution.jump(nums));
  }
}
