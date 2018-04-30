package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode698;
import org.junit.Assert;
import org.junit.Test;


public class TestLeetCode698 {
  @Test
  public void testProblemCase() {
    int[] nums = {4, 3, 2, 3, 5, 2, 1};
    int k = 4;
    LeetCode698 solution = new LeetCode698();
    Assert.assertTrue(solution.canPartitionKSubsets(nums, k));
  }

  @Test
  public void testNotDivisibleByK() {
    int[] nums = {1, 1, 1, 1, 1};
    int k = 4;
    LeetCode698 solution = new LeetCode698();
    Assert.assertFalse(solution.canPartitionKSubsets(nums, k));
  }

  @Test
  public void testNotEnoughElementsToCreateKSubsets() {
    int[] nums = {0, 100};
    int k = 4;
    LeetCode698 solution = new LeetCode698();
    Assert.assertFalse(solution.canPartitionKSubsets(nums, k));
  }

  @Test
  public void testExtraZeros() {
    int[] nums = {25, 25, 25, 25, 0};
    int k = 4;
    LeetCode698 solution = new LeetCode698();
    Assert.assertTrue(solution.canPartitionKSubsets(nums, k));
  }
}
