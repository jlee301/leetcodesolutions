package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode581;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode581 {
  @Test
  public void testProblemCase() {
    int[] nums = {2, 6, 4, 8, 10, 9, 15};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(5, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testOneUnsorted() {
    int[] nums = {2, 3, 4, 5, 6, 7, 1, 8};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(7, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testDescendingOrder() {
    int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(8, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testAscendingOrder() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testMultipleDupes() {
    int[] nums = {1, 1, 3, 2, 3, 2, 4, 4};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(4, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testOnlyOneEntry() {
    int[] nums = {1};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testNeg() {
    int[] nums = {-8, -7, -4, -5, -6, -3, -2, -1};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(3, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode581 solution = new LeetCode581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }
}
