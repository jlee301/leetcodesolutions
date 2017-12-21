package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode326;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode326 {
  @Test
  public void testPowerOfThree() {
    LeetCode326 solution = new LeetCode326();
    Assert.assertTrue(solution.isPowerOfThree(1));
    Assert.assertTrue(solution.isPowerOfThree(3));
    Assert.assertTrue(solution.isPowerOfThree(9));
    Assert.assertTrue(solution.isPowerOfThree(27));
    Assert.assertTrue(solution.isPowerOfThree(81));
  }

  @Test
  public void testNotPowerOfThree() {
    LeetCode326 solution = new LeetCode326();
    Assert.assertFalse(solution.isPowerOfThree(2));
    Assert.assertFalse(solution.isPowerOfThree(4));
    Assert.assertFalse(solution.isPowerOfThree(5));
    Assert.assertFalse(solution.isPowerOfThree(6));
    Assert.assertFalse(solution.isPowerOfThree(7));
    Assert.assertFalse(solution.isPowerOfThree(8));
    Assert.assertFalse(solution.isPowerOfThree(10));
    Assert.assertFalse(solution.isPowerOfThree(11));
    Assert.assertFalse(solution.isPowerOfThree(12));
    Assert.assertFalse(solution.isPowerOfThree(13));
    Assert.assertFalse(solution.isPowerOfThree(14));
    Assert.assertFalse(solution.isPowerOfThree(15));
    Assert.assertFalse(solution.isPowerOfThree(16));
    Assert.assertFalse(solution.isPowerOfThree(17));
    Assert.assertFalse(solution.isPowerOfThree(18));
    Assert.assertFalse(solution.isPowerOfThree(19));
    Assert.assertFalse(solution.isPowerOfThree(20));
  }

  @Test
  public void testEdgeCases() {
    LeetCode326 solution = new LeetCode326();
    Assert.assertFalse(solution.isPowerOfThree(0));
    Assert.assertFalse(solution.isPowerOfThree(-1));
    Assert.assertFalse(solution.isPowerOfThree(-2));
    Assert.assertFalse(solution.isPowerOfThree(-3));
    Assert.assertFalse(solution.isPowerOfThree(-4));
    Assert.assertFalse(solution.isPowerOfThree(-5));
    Assert.assertFalse(solution.isPowerOfThree(-6));
    Assert.assertFalse(solution.isPowerOfThree(-7));
    Assert.assertFalse(solution.isPowerOfThree(-8));
    Assert.assertFalse(solution.isPowerOfThree(-9));
    Assert.assertFalse(solution.isPowerOfThree(-10));
  }
}
