package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode367;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode367 {
  @Test
  public void testProblemCase1() {
    LeetCode367 solution = new LeetCode367();
    Assert.assertTrue(solution.isPerfectSquare(1));
    Assert.assertTrue(solution.isPerfectSquare(4));
    Assert.assertTrue(solution.isPerfectSquare(9));
    Assert.assertTrue(solution.isPerfectSquare(16));
    Assert.assertTrue(solution.isPerfectSquare(25));
    Assert.assertTrue(solution.isPerfectSquare(36));
    Assert.assertTrue(solution.isPerfectSquare(49));
    Assert.assertTrue(solution.isPerfectSquare(64));
    Assert.assertTrue(solution.isPerfectSquare(81));
    Assert.assertTrue(solution.isPerfectSquare(100));
    Assert.assertTrue(solution.isPerfectSquare(121));
  }

  @Test
  public void testProblemCase2() {
    LeetCode367 solution = new LeetCode367();
    Assert.assertFalse(solution.isPerfectSquare(2));
    Assert.assertFalse(solution.isPerfectSquare(3));
    Assert.assertFalse(solution.isPerfectSquare(5));
    Assert.assertFalse(solution.isPerfectSquare(6));
    Assert.assertFalse(solution.isPerfectSquare(7));
    Assert.assertFalse(solution.isPerfectSquare(8));
    Assert.assertFalse(solution.isPerfectSquare(10));
    Assert.assertFalse(solution.isPerfectSquare(11));
    Assert.assertFalse(solution.isPerfectSquare(12));
    Assert.assertFalse(solution.isPerfectSquare(13));
    Assert.assertFalse(solution.isPerfectSquare(14));
    Assert.assertFalse(solution.isPerfectSquare(15));
    Assert.assertFalse(solution.isPerfectSquare(17));
    Assert.assertFalse(solution.isPerfectSquare(18));
    Assert.assertFalse(solution.isPerfectSquare(19));
    Assert.assertFalse(solution.isPerfectSquare(20));
  }
}
