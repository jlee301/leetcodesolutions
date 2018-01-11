package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode594;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode594 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,3,2,2,5,2,3,7};
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(5, solution.findLHS(nums));
  }

  @Test
  public void testNeg() {
    int[] nums = {-1,-2,2,-2,4};
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(3, solution.findLHS(nums));
  }

  @Test
  public void testMultiSameMax() {
    // {1,0,0,1}
    // {1,2,2,1}
    int[] nums = {1,0,2,2,0,1};
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(4, solution.findLHS(nums));
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(0, solution.findLHS(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(0, solution.findLHS(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode594 solution = new LeetCode594();
    Assert.assertEquals(0, solution.findLHS(nums));
  }
}
