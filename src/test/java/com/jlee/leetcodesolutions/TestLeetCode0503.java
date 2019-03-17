package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0503;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0503 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,1};
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {2,-1,2}, solution.nextGreaterElements(nums));
  }

  @Test
  public void testAllDecreasing() {
    int[] nums = {3,2,1};
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {-1,3,3}, solution.nextGreaterElements(nums));
  }

  @Test
  public void testAllSame() {
    int[] nums = {1,1,1};
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {-1,-1,-1}, solution.nextGreaterElements(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {1};
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {-1}, solution.nextGreaterElements(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {}, solution.nextGreaterElements(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0503 solution = new LeetCode0503();
    Assert.assertArrayEquals(new int[] {}, solution.nextGreaterElements(nums));
  }
}
