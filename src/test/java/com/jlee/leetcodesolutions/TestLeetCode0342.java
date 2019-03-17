package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0342;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0342 {
  @Test
  public void testProblemCase1() {
    LeetCode0342 solution = new LeetCode0342();
    Assert.assertTrue(solution.isPowerOfFour(1));
    Assert.assertTrue(solution.isPowerOfFour(4));
    Assert.assertTrue(solution.isPowerOfFour(16));
    Assert.assertTrue(solution.isPowerOfFour(256));
    Assert.assertTrue(solution.isPowerOfFour(1024));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0342 solution = new LeetCode0342();
    Assert.assertFalse(solution.isPowerOfFour(2));
    Assert.assertFalse(solution.isPowerOfFour(3));
    Assert.assertFalse(solution.isPowerOfFour(5));
    Assert.assertFalse(solution.isPowerOfFour(6));
    Assert.assertFalse(solution.isPowerOfFour(7));
    Assert.assertFalse(solution.isPowerOfFour(8));
    Assert.assertFalse(solution.isPowerOfFour(9));
    Assert.assertFalse(solution.isPowerOfFour(10));
    Assert.assertFalse(solution.isPowerOfFour(11));
    Assert.assertFalse(solution.isPowerOfFour(12));
    Assert.assertFalse(solution.isPowerOfFour(13));
    Assert.assertFalse(solution.isPowerOfFour(14));
    Assert.assertFalse(solution.isPowerOfFour(15));
    Assert.assertFalse(solution.isPowerOfFour(17));
    Assert.assertFalse(solution.isPowerOfFour(18));
    Assert.assertFalse(solution.isPowerOfFour(19));
    Assert.assertFalse(solution.isPowerOfFour(20));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0342 solution = new LeetCode0342();
    Assert.assertFalse(solution.isPowerOfFour(0));
    Assert.assertFalse(solution.isPowerOfFour(-1));
    Assert.assertFalse(solution.isPowerOfFour(-2));
    Assert.assertFalse(solution.isPowerOfFour(-3));
    Assert.assertFalse(solution.isPowerOfFour(-4));
    Assert.assertFalse(solution.isPowerOfFour(-5));
    Assert.assertFalse(solution.isPowerOfFour(-6));
    Assert.assertFalse(solution.isPowerOfFour(-7));
    Assert.assertFalse(solution.isPowerOfFour(-8));
    Assert.assertFalse(solution.isPowerOfFour(-9));
    Assert.assertFalse(solution.isPowerOfFour(-10));
  }
}
