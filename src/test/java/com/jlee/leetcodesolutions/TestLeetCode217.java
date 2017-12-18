package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode217;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode217 {
  @Test
  public void testNoDuplicates() {
    int[] nums = {1, 2, 3, 4};
    LeetCode217 solution = new LeetCode217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  public void testBegDuplicate() {
    int[] nums = {1, 1, 2, 3};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testMidDuplicate() {
    int[] nums = {1, 2, 2, 3};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testEndDuplicate() {
    int[] nums = {1, 2, 3, 3};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testMultipleDuplicate() {
    int[] nums = {1, 2, 1, 2};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testAllDuplicate() {
    int[] nums = {1, 1, 1, 1};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode217 solution = new LeetCode217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  public void testNegDuplicate() {
    int[] nums = {-1, 0, 1, -1, 2};
    LeetCode217 solution = new LeetCode217();
    Assert.assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode217 solution = new LeetCode217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode217 solution = new LeetCode217();
    Assert.assertFalse(solution.containsDuplicate(nums));
  }
}
