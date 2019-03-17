package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0560;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0560 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,1,1};
    int k = 2;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(2, solution.subarraySum(nums, k));
  }

  @Test
  public void testProblemCaseK1() {
    int[] nums = {1,1,1};
    int k = 1;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(3, solution.subarraySum(nums, k));
  }

  @Test
  public void testProblemCaseK3() {
    int[] nums = {1,1,1};
    int k = 3;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(1, solution.subarraySum(nums, k));
  }

  @Test
  public void testProblemCaseK4() {
    int[] nums = {1,1,1};
    int k = 4;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(0, solution.subarraySum(nums, k));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 2;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(0, solution.subarraySum(nums, k));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 2;
    LeetCode0560 solution = new LeetCode0560();
    Assert.assertEquals(0, solution.subarraySum(nums, k));
  }
}
