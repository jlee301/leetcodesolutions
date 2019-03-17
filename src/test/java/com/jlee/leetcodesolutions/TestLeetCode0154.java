package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0154;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0154 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,3,5};
    LeetCode0154 solution = new LeetCode0154();
    Assert.assertEquals(1, solution.findMin(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {2,2,2,0,1};
    LeetCode0154 solution = new LeetCode0154();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {3,3,1,3};
    LeetCode0154 solution = new LeetCode0154();
    Assert.assertEquals(1, solution.findMin(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {2,2,2,2,2};
    LeetCode0154 solution = new LeetCode0154();
    Assert.assertEquals(2, solution.findMin(nums));
  }
}
