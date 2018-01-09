package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode506;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode506 {
  @Test
  public void testProblemCase() {
    int[] nums = {5, 4, 3, 2, 1};
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("Gold Medal", result[0]);
    Assert.assertEquals("Silver Medal", result[1]);
    Assert.assertEquals("Bronze Medal", result[2]);
    Assert.assertEquals("4", result[3]);
    Assert.assertEquals("5", result[4]);
  }

  @Test
  public void testAsendingRank() {
    int[] nums = {1,2,3,4,5};
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("5", result[0]);
    Assert.assertEquals("4", result[1]);
    Assert.assertEquals("Bronze Medal", result[2]);
    Assert.assertEquals("Silver Medal", result[3]);
    Assert.assertEquals("Gold Medal", result[4]);
  }

  @Test
  public void testRandomOrder() {
    int[] nums = {1,4,2,5,3};
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("5", result[0]);
    Assert.assertEquals("Silver Medal", result[1]);
    Assert.assertEquals("4", result[2]);
    Assert.assertEquals("Gold Medal", result[3]);
    Assert.assertEquals("Bronze Medal", result[4]);
  }

  @Test
  public void testRandomNumbers() {
    int[] nums = {1000,100,10000,50,25};
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("Silver Medal", result[0]);
    Assert.assertEquals("Bronze Medal", result[1]);
    Assert.assertEquals("Gold Medal", result[2]);
    Assert.assertEquals("4", result[3]);
    Assert.assertEquals("5", result[4]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode506 solution = new LeetCode506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(0, result.length);
  }
}