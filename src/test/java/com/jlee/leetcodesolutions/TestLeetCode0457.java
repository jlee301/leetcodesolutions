package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0457;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0457 {
  @Test
  public void testProblemCase1() {
    int[] nums = {2, -1, 1, 2, 2};
    LeetCode0457 solution = new LeetCode0457();
    Assert.assertTrue(solution.circularArrayLoop(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {-1, 2};
    LeetCode0457 solution = new LeetCode0457();
    Assert.assertFalse(solution.circularArrayLoop(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {-2, 1, -1, -2, -2};
    LeetCode0457 solution = new LeetCode0457();
    Assert.assertFalse(solution.circularArrayLoop(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {-1, -2, -3, -4, -5};
    LeetCode0457 solution = new LeetCode0457();
    Assert.assertFalse(solution.circularArrayLoop(nums));
  }
}
