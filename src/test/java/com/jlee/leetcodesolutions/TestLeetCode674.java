package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode674;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode674 {
  @Test
  public void testOne() {
    int[] nums = {1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testAllAscending() {
    int[] nums = {1,2,3,4};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(4, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testAllDescending() {
    int[] nums = {4,3,2,1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testTwoIncreasingFirstLonger() {
    int[] nums = {3,4,5,1,2};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(3, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testTwoIncreasingSecondLonger() {
    int[] nums = {4,5,1,2,3};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(3, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testTwoIncreasingBothSame() {
    int[] nums = {4,5,1,2};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(2, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testFourIncreasing() {
    int[] nums = {8,9,10,3,4,2,1,2,3,4};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(4, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testThreeIncreasingSubarrayNotSubsequence() {
    int[] nums = {8,9,10,3,4,2,11,12,13,14};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(5, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testAllSame() {
    int[] nums = {1,1,1,1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(0, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(0, solution.findLengthOfLCIS(nums));
  }
}
