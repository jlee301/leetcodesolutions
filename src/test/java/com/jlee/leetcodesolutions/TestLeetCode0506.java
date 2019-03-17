package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0506;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0506 {
  @Test
  public void testProblemCase1() {
    int[] nums = {5, 4, 3, 2, 1};
    LeetCode0506 solution = new LeetCode0506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("Gold Medal", result[0]);
    Assert.assertEquals("Silver Medal", result[1]);
    Assert.assertEquals("Bronze Medal", result[2]);
    Assert.assertEquals("4", result[3]);
    Assert.assertEquals("5", result[4]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,3,4,5};
    LeetCode0506 solution = new LeetCode0506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("5", result[0]);
    Assert.assertEquals("4", result[1]);
    Assert.assertEquals("Bronze Medal", result[2]);
    Assert.assertEquals("Silver Medal", result[3]);
    Assert.assertEquals("Gold Medal", result[4]);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,4,2,5,3};
    LeetCode0506 solution = new LeetCode0506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("5", result[0]);
    Assert.assertEquals("Silver Medal", result[1]);
    Assert.assertEquals("4", result[2]);
    Assert.assertEquals("Gold Medal", result[3]);
    Assert.assertEquals("Bronze Medal", result[4]);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1000,100,10000,50,25};
    LeetCode0506 solution = new LeetCode0506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals("Silver Medal", result[0]);
    Assert.assertEquals("Bronze Medal", result[1]);
    Assert.assertEquals("Gold Medal", result[2]);
    Assert.assertEquals("4", result[3]);
    Assert.assertEquals("5", result[4]);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {};
    LeetCode0506 solution = new LeetCode0506();
    String[] result = solution.findRelativeRanks(nums);
    Assert.assertEquals(0, result.length);
  }
}
