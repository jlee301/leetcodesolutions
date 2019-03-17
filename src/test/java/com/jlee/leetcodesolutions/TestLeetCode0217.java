package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0217;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0217 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 2, 3, 4};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 1, 2, 3};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1, 2, 2, 3};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1, 2, 3, 3};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1, 2, 1, 2};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1, 1, 1, 1};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {1};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {-1, 0, 1, -1, 2};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testProblemCase9() {
    int[] nums = {};
    LeetCode0217 solution = new LeetCode0217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }
}
