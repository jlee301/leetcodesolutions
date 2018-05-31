package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode810;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode810 {
  @Test
  public void testProblemCase() {
    // Input: nums = [1, 1, 2]
    // Output: false
    int[] nums = {1,1,2};
    LeetCode810 solution = new LeetCode810();
    Assert.assertFalse(solution.xorGame(nums));
  }

  @Test
  public void testStartsOffZero() {
    int[] nums = {1,2,3};
    LeetCode810 solution = new LeetCode810();
    Assert.assertTrue(solution.xorGame(nums));
  }

  @Test
  public void testEven() {
    int[] nums = {1,2,3,4};
    LeetCode810 solution = new LeetCode810();
    Assert.assertTrue(solution.xorGame(nums));
  }

  @Test
  public void testOdds() {
    int[] nums = {1,2,4};
    LeetCode810 solution = new LeetCode810();
    Assert.assertFalse(solution.xorGame(nums));
  }
}
