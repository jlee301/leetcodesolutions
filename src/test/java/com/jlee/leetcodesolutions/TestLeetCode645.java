package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode645;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode645 {
  @Test
  public void testDupeMid() {
    int[] nums = {1,2,2,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testDupeBeg() {
    int[] nums = {1,1,3,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testDupeEnd() {
    int[] nums = {1,2,4,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(4, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testUnordered() {
    int[] nums = {4,2,2,1};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testNoDupes() {
    int[] nums = {1,2,3,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }

  @Test
  public void testTwoEntry() {
    int[] nums = {1,1};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }
}
