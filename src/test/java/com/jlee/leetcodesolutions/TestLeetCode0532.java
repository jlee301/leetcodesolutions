package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0532;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0532 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(2, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 1;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(4, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(1, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1, 3, -1, -4, 4};
    int k = 3;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(2, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {};
    int k = 1;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(0, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1, 3, 5, 5, 5};
    int k = 2;
    LeetCode0532 solution = new LeetCode0532();
    Assert.assertEquals(2, solution.findPairs(nums, k));
  }
}
