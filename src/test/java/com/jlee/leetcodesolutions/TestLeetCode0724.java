package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0724;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0724 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(3, solution.pivotIndex(nums));
  }

  @Test
  public void testNeg1() {
    int[] nums = {-1, 1, 1};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(2, solution.pivotIndex(nums));
  }

  @Test
  public void testNeg2() {
    int[] nums = {1, 1, -1};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(0, solution.pivotIndex(nums));
  }

  @Test
  public void testNeg3() {
    int[] nums = {1, -1, 1};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(0, solution.pivotIndex(nums));
  }

  @Test
  public void testMultiplePivots() {
    int[] nums = {0, 0, 0};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(0, solution.pivotIndex(nums));
  }

  @Test
  public void testNoPivot() {
    int[] nums = {1, 2, 3};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(-1, solution.pivotIndex(nums));
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(0, solution.pivotIndex(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(-1, solution.pivotIndex(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0724 solution = new LeetCode0724();
    Assert.assertEquals(-1, solution.pivotIndex(nums));
  }
}
