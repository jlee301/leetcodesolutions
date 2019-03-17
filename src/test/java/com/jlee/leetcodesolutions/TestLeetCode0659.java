package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0659;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0659 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,3,3,4,5};
    LeetCode0659 solution = new LeetCode0659();
    Assert.assertTrue(solution.isPossible(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,3,3,4,4,5,5};
    LeetCode0659 solution = new LeetCode0659();
    Assert.assertTrue(solution.isPossible(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,4,5};
    LeetCode0659 solution = new LeetCode0659();
    Assert.assertFalse(solution.isPossible(nums));
  }

  @Test
  public void testNotEnoughToCreate() {
    int[] nums = {1,2};
    LeetCode0659 solution = new LeetCode0659();
    Assert.assertFalse(solution.isPossible(nums));
  }

  @Test
  public void testNotEnoughToCreateToo() {
    int[] nums = {1,3};
    LeetCode0659 solution = new LeetCode0659();
    Assert.assertFalse(solution.isPossible(nums));
  }
}
