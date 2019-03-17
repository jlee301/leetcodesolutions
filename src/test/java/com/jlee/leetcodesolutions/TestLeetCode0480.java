package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0480;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0480 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    LeetCode0480 solution = new LeetCode0480();
    Assert.assertArrayEquals(new double[] {1,-1,-1,3,5,6}, solution.medianSlidingWindow(nums, k), 0.0);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {2,3,4};
    int k = 2;
    LeetCode0480 solution = new LeetCode0480();
    Assert.assertArrayEquals(new double[] {2.5,3.5}, solution.medianSlidingWindow(nums, k), 0.0);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {2,4,3};
    int k = 2;
    LeetCode0480 solution = new LeetCode0480();
    Assert.assertArrayEquals(new double[] {3.0,3.5}, solution.medianSlidingWindow(nums, k), 0.0);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {2147483647,2147483647};
    int k = 2;
    LeetCode0480 solution = new LeetCode0480();
    Assert.assertArrayEquals(new double[] {2147483647.0}, solution.medianSlidingWindow(nums, k), 0.0);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = { -2147483648, -2147483648, 2147483647, -2147483648, 1, 3, -2147483648, -100, 8, 17, 22, -2147483648,
        -2147483648, 2147483647, 2147483647, 2147483647, 2147483647, -2147483648, 2147483647, -2147483648 };
    int k = 6;
    LeetCode0480 solution = new LeetCode0480();
    Assert.assertArrayEquals(new double[] { -1073741823.5, -1073741823.5, -49.5, -49.5, 2.0, 5.5, -46.0, -46.0, 12.5,
        19.5, 1073741834.5, 2147483647.0, 2147483647.0, 2147483647.0, 2147483647.0 },
        solution.medianSlidingWindow(nums, k), 0.0);
  }
}
