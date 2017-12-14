package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode136;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode136 {
  @Test
  public void testSingleNumber() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testOnePair1() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 1, 2, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testOnePair2() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 1, 1, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testOnePair3() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testTwoPair1() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 2, 2, 3, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testTwoPair2() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 2, 2, 1, 3, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testTwoPair3() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 2, 2, 1, 1, 3 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testTwoPair4() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 3, 2, 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testTwoPair5() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 2, 3, 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testTwoPair6() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 1, 2, 3, 1, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testNeg() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 1, 1, -5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(-5, result);
  }

  @Test
  public void testNegPair() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { -5, 1, -5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testAllPairs() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { -5, 1, -5, 1, 2, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testSingleZero() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = { 5, 0, 5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testEmpty() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = {};
    int result = solution.singleNumber(nums);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNull() {
    LeetCode136 solution = new LeetCode136();
    int[] nums = null;
    int result = solution.singleNumber(nums);
    Assert.assertEquals(0, result);
  }
}
