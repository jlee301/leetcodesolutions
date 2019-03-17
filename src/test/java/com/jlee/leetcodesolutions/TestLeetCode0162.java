package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0162;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0162 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3,1};
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(2, solution.findPeakElement(nums));
  }
  
  @Test
  public void testMultiplePeaks() {
    int[] nums = {1,2,3,1,2};
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(2, solution.findPeakElement(nums));
  }
  
  @Test
  public void testTwoAscending() {
    int[] nums = {1,2};
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(1, solution.findPeakElement(nums));
  }

  @Test
  public void testTwoDescending() {
    int[] nums = {2,1};
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(0, solution.findPeakElement(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(-1, solution.findPeakElement(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0162 solution = new LeetCode0162();
    Assert.assertEquals(-1, solution.findPeakElement(nums));
  }
}
