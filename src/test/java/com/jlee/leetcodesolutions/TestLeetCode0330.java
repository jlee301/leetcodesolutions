package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0330;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0330 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3};
    int n = 6;
    LeetCode0330 solution = new LeetCode0330();
    Assert.assertEquals(1, solution.minPatches(nums, n));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,5,10};
    int n = 20;
    LeetCode0330 solution = new LeetCode0330();
    Assert.assertEquals(2, solution.minPatches(nums, n));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,2};
    int n = 5;
    LeetCode0330 solution = new LeetCode0330();
    Assert.assertEquals(0, solution.minPatches(nums, n));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1,2,3};
    int n = 100;
    LeetCode0330 solution = new LeetCode0330();
    Assert.assertEquals(4, solution.minPatches(nums, n));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,2,31,33};
    int n = 2147483647;
    LeetCode0330 solution = new LeetCode0330();
    Assert.assertEquals(28, solution.minPatches(nums, n));
  }
}
