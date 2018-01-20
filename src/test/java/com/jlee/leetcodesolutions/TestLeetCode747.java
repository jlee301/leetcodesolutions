package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode747;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode747 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 6, 1, 0};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(1, solution.dominantIndex(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2, 3, 4};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(-1, solution.dominantIndex(nums));
  }

  @Test
  public void testAllSame() {
    int[] nums = {6, 6, 6, 6};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(0, solution.dominantIndex(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {6};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(0, solution.dominantIndex(nums));
  }

  @Test
  public void testMultipleLargeElement() {
    int[] nums = {1, 2, 3, 6, 6};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(3, solution.dominantIndex(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(-1, solution.dominantIndex(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode747 solution = new LeetCode747();
    Assert.assertEquals(-1, solution.dominantIndex(nums));
  }
}
