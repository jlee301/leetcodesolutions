package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode525;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode525 {
  @Test
  public void testProblemCase1() {
    int[] nums = {0,1};
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(2, solution.findMaxLength(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {0,1,0};
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(2, solution.findMaxLength(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {0,1,0,0,1,1,0};
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(6, solution.findMaxLength(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {0,0,1,0,0,0,1,1};
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(6, solution.findMaxLength(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(0, solution.findMaxLength(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode525 solution = new LeetCode525();
    Assert.assertEquals(0, solution.findMaxLength(nums));
  }
}
