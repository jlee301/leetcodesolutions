package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode231;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode231 {
  @Test
  public void testNonPowersOfTwo() {
    LeetCode231 solution = new LeetCode231();
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
  }

  @Test
  public void testPowersOfTwo() {
    LeetCode231 solution = new LeetCode231();
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

  @Test
  public void testNeg() {
    LeetCode231 solution = new LeetCode231();
    Assert.assertFalse(solution.isPowerOfTwo(-1));
  }
  
  @Test
  public void testNonPowersOfTwoBit() {
    LeetCode231 solution = new LeetCode231();
    Assert.assertFalse(solution.isPowerOfTwoBit(0));
    Assert.assertFalse(solution.isPowerOfTwoBit(3));
    Assert.assertFalse(solution.isPowerOfTwoBit(5));
    Assert.assertFalse(solution.isPowerOfTwoBit(6));
    Assert.assertFalse(solution.isPowerOfTwoBit(7));
    Assert.assertFalse(solution.isPowerOfTwoBit(9));
    Assert.assertFalse(solution.isPowerOfTwoBit(10));
    Assert.assertFalse(solution.isPowerOfTwoBit(11));
    Assert.assertFalse(solution.isPowerOfTwoBit(12));
    Assert.assertFalse(solution.isPowerOfTwoBit(13));
    Assert.assertFalse(solution.isPowerOfTwoBit(14));
    Assert.assertFalse(solution.isPowerOfTwoBit(15));
  }

  @Test
  public void testPowersOfTwoBit() {
    LeetCode231 solution = new LeetCode231();
    Assert.assertTrue(solution.isPowerOfTwoBit(1));
    Assert.assertTrue(solution.isPowerOfTwoBit(2));
    Assert.assertTrue(solution.isPowerOfTwoBit(4));
    Assert.assertTrue(solution.isPowerOfTwoBit(8));
    Assert.assertTrue(solution.isPowerOfTwoBit(16));
    Assert.assertTrue(solution.isPowerOfTwoBit(32));
    Assert.assertTrue(solution.isPowerOfTwoBit(64));
    Assert.assertTrue(solution.isPowerOfTwoBit(128));
    Assert.assertTrue(solution.isPowerOfTwoBit(256));
    Assert.assertTrue(solution.isPowerOfTwoBit(512));
    Assert.assertTrue(solution.isPowerOfTwoBit(1024));
    Assert.assertTrue(solution.isPowerOfTwoBit(2048));
  }

  @Test
  public void testNegBit() {
    LeetCode231 solution = new LeetCode231();
    Assert.assertFalse(solution.isPowerOfTwo(-1));
  }
}
