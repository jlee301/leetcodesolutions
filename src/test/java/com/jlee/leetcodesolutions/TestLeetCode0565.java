package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0565;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0565 {
  @Test
  public void testProblemCase() {
    int[] nums = {5,4,0,3,1,6,2};
    LeetCode0565 solution = new LeetCode0565();
    Assert.assertEquals(4, solution.arrayNesting(nums));
  }

  @Test
  public void testNumbersAllAscendingButLast() {
    int[] nums = {1,2,3,4,5,6,0};
    LeetCode0565 solution = new LeetCode0565();
    Assert.assertEquals(7, solution.arrayNesting(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0565 solution = new LeetCode0565();
    Assert.assertEquals(0, solution.arrayNesting(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0565 solution = new LeetCode0565();
    Assert.assertEquals(0, solution.arrayNesting(nums));
  }
}
