package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0523;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0523 {
  @Test
  public void testProblemCase() {
    int[] nums = {23, 2, 4, 6, 7};
    int k = 6;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertTrue(solution.checkSubarraySum(nums, k));
  }
  
  @Test
  public void testK0() {
    int[] nums = {23, 2, 4, 6, 7};
    int k = 0;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertFalse(solution.checkSubarraySum(nums, k));
  }
  
  @Test
  public void testSum0K0() {
    int[] nums = {0, 0};
    int k = 0;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertTrue(solution.checkSubarraySum(nums, k));
  }
  
  @Test
  public void testSum0K100() {
    int[] nums = {0, 0};
    int k = 100;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertTrue(solution.checkSubarraySum(nums, k));
  }
  
  @Test
  public void testOneEntry() {
    int[] nums = {1};
    int k = 1;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertFalse(solution.checkSubarraySum(nums, k));
  }
  
  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 6;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertFalse(solution.checkSubarraySum(nums, k));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 6;
    LeetCode0523 solution = new LeetCode0523();
    Assert.assertFalse(solution.checkSubarraySum(nums, k));
  }
}
