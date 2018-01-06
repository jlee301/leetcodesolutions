package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode532;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode532 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(2, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 1;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(4, solution.findPairs(nums, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(1, solution.findPairs(nums, k));
  }

  @Test
  public void testNeg() {
    int[] nums = {1, 3, -1, -4, 4};
    int k = 3;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(2, solution.findPairs(nums, k));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 1;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(0, solution.findPairs(nums, k));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 1;
    LeetCode532 solution = new LeetCode532();
    Assert.assertEquals(0, solution.findPairs(nums, k));
  }
}
