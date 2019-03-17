package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0231;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0231 {
  @Test
  public void testProblemCase1() {
    LeetCode0231 solution = new LeetCode0231();
    Assert.assertFalse(solution.isPowerOfTwo(0));
    Assert.assertFalse(solution.isPowerOfTwo(3));
    Assert.assertFalse(solution.isPowerOfTwo(5));
    Assert.assertFalse(solution.isPowerOfTwo(6));
    Assert.assertFalse(solution.isPowerOfTwo(7));
    Assert.assertFalse(solution.isPowerOfTwo(9));
    Assert.assertFalse(solution.isPowerOfTwo(10));
    Assert.assertFalse(solution.isPowerOfTwo(11));
    Assert.assertFalse(solution.isPowerOfTwo(12));
    Assert.assertFalse(solution.isPowerOfTwo(13));
    Assert.assertFalse(solution.isPowerOfTwo(14));
    Assert.assertFalse(solution.isPowerOfTwo(15));
    Assert.assertFalse(solution.isPowerOfTwo(Integer.MAX_VALUE));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0231 solution = new LeetCode0231();
    Assert.assertTrue(solution.isPowerOfTwo(1));
    Assert.assertTrue(solution.isPowerOfTwo(2));
    Assert.assertTrue(solution.isPowerOfTwo(4));
    Assert.assertTrue(solution.isPowerOfTwo(8));
    Assert.assertTrue(solution.isPowerOfTwo(16));
    Assert.assertTrue(solution.isPowerOfTwo(32));
    Assert.assertTrue(solution.isPowerOfTwo(64));
    Assert.assertTrue(solution.isPowerOfTwo(128));
    Assert.assertTrue(solution.isPowerOfTwo(256));
    Assert.assertTrue(solution.isPowerOfTwo(512));
    Assert.assertTrue(solution.isPowerOfTwo(1024));
    Assert.assertTrue(solution.isPowerOfTwo(2048));
  }
}
