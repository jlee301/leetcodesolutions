package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0719;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0719 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3,1};
    int k = 1;
    LeetCode0719 solution = new LeetCode0719();
    Assert.assertEquals(0, solution.smallestDistancePair(nums, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,3,1};
    int k = 2;
    LeetCode0719 solution = new LeetCode0719();
    Assert.assertEquals(2, solution.smallestDistancePair(nums, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,3,1};
    int k = 3;
    LeetCode0719 solution = new LeetCode0719();
    Assert.assertEquals(2, solution.smallestDistancePair(nums, k));
  }
}
