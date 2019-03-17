package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0946;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0946 {
  @Test
  public void testProblemCase1() {
    int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
    LeetCode0946 solution = new LeetCode0946();
    Assert.assertTrue(solution.validateStackSequences(pushed, popped));
  }

  @Test
  public void testProblemCase2() {
    int[] pushed = {1,2,3,4,5}, popped = {4,3,5,1,2};
    LeetCode0946 solution = new LeetCode0946();
    Assert.assertFalse(solution.validateStackSequences(pushed, popped));
  }

  @Test
  public void testProblemCase3() {
    int[] pushed = {1,2,3,4,5}, popped = {3,5,4,2,1};
    LeetCode0946 solution = new LeetCode0946();
    Assert.assertTrue(solution.validateStackSequences(pushed, popped));
  }
}
