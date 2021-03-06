package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0239;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0239 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    LeetCode0239 solution = new LeetCode0239();
    Assert.assertArrayEquals(new int[] {3,3,5,5,6,7}, solution.maxSlidingWindow(nums, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 1;
    LeetCode0239 solution = new LeetCode0239();
    Assert.assertArrayEquals(new int[] {1,3,-1,-3,5,3,6,7}, solution.maxSlidingWindow(nums, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 8;
    LeetCode0239 solution = new LeetCode0239();
    Assert.assertArrayEquals(new int[] {7}, solution.maxSlidingWindow(nums, k));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {};
    int k = 0;
    LeetCode0239 solution = new LeetCode0239();
    Assert.assertArrayEquals(new int[] {}, solution.maxSlidingWindow(nums, k));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = null;
    int k = 0;
    LeetCode0239 solution = new LeetCode0239();
    Assert.assertArrayEquals(new int[] {}, solution.maxSlidingWindow(nums, k));
  }
}
