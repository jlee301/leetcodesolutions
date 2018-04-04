package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode462;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode462 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3};
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(2, solution.minMoves2(nums));
  }

  @Test
  public void testMixedArray() {
    int[] nums = {4,1,2,3};
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(4, solution.minMoves2(nums));
  }

  @Test
  public void testNeg() {
    int[] nums = {-4,1,2,3};
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(8, solution.minMoves2(nums));
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(0, solution.minMoves2(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(0, solution.minMoves2(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode462 solution = new LeetCode462();
    Assert.assertEquals(0, solution.minMoves2(nums));
  }
}
