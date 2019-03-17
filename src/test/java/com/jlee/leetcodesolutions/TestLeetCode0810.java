package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0810;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0810 {
  @Test
  public void testProblemCase() {
    // Input: nums = [1, 1, 2]
    // Output: false
    int[] nums = {1,1,2};
    LeetCode0810 solution = new LeetCode0810();
    Assert.assertFalse(solution.xorGame(nums));
  }

  @Test
  public void testStartsOffZero() {
    int[] nums = {1,2,3};
    LeetCode0810 solution = new LeetCode0810();
    Assert.assertTrue(solution.xorGame(nums));
  }

  @Test
  public void testEven() {
    int[] nums = {1,2,3,4};
    LeetCode0810 solution = new LeetCode0810();
    Assert.assertTrue(solution.xorGame(nums));
  }

  @Test
  public void testOdds() {
    int[] nums = {1,2,4};
    LeetCode0810 solution = new LeetCode0810();
    Assert.assertFalse(solution.xorGame(nums));
  }
}
