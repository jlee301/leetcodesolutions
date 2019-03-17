package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0303;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0303 {
  @Test
  public void testProblemCase1() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    LeetCode0303 solution = new LeetCode0303(nums);
    Assert.assertEquals(1, solution.sumRange(0, 2));
    Assert.assertEquals(-1, solution.sumRange(2, 5));
    Assert.assertEquals(-3, solution.sumRange(0, 5));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    LeetCode0303 solution = new LeetCode0303(nums);
    Assert.assertEquals(-2, solution.sumRange(0, 0));
    Assert.assertEquals(0, solution.sumRange(1, 1));
    Assert.assertEquals(3, solution.sumRange(2, 2));
    Assert.assertEquals(-5, solution.sumRange(3, 3));
    Assert.assertEquals(2, solution.sumRange(4, 4));
    Assert.assertEquals(-1, solution.sumRange(5, 5));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    LeetCode0303 solution = new LeetCode0303(nums);
    Assert.assertEquals(0, solution.sumRange(5, 0));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {};
    LeetCode0303 solution = new LeetCode0303(nums);
    Assert.assertEquals(0, solution.sumRange(0, 5));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = null;
    LeetCode0303 solution = new LeetCode0303(nums);
    Assert.assertEquals(0, solution.sumRange(0, 5));
  }
}
