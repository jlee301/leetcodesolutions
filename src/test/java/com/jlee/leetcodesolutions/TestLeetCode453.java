package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode453;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode453 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(3, solution.minMoves(nums));
  }

  @Test
  public void testAscending() {
    int[] nums = {1,7,10};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(15, solution.minMoves(nums));
  }

  @Test
  public void testDescending() {
    int[] nums = {10,7,1};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(15, solution.minMoves(nums));
  }

  @Test
  public void testNegativeNumbers() {
    int[] nums = {-3,-5,-6};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(4, solution.minMoves(nums));
  }

  @Test
  public void testTwoNumbers() {
    int[] nums = {1,5};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(4, solution.minMoves(nums));
  }

  @Test
  public void testSingleNumber() {
    int[] nums = {1};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(0, solution.minMoves(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(0, solution.minMoves(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(0, solution.minMoves(nums));
  }
}
