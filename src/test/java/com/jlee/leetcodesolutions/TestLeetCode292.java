package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode292;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode292 {
  @Test
  public void testNimWins() {
    LeetCode292 solution = new LeetCode292();
    Assert.assertTrue(solution.canWinNim(1));
    Assert.assertTrue(solution.canWinNim(2));
    Assert.assertTrue(solution.canWinNim(3));
    Assert.assertTrue(solution.canWinNim(5));
    Assert.assertTrue(solution.canWinNim(6));
    Assert.assertTrue(solution.canWinNim(7));
    Assert.assertTrue(solution.canWinNim(9));
    Assert.assertTrue(solution.canWinNim(10));
    Assert.assertTrue(solution.canWinNim(11));
    Assert.assertTrue(solution.canWinNim(13));
    Assert.assertTrue(solution.canWinNim(14));
    Assert.assertTrue(solution.canWinNim(15));
    Assert.assertTrue(solution.canWinNim(17));
    Assert.assertTrue(solution.canWinNim(18));
    Assert.assertTrue(solution.canWinNim(19));
  }

  @Test
  public void testNimLose() {
    LeetCode292 solution = new LeetCode292();
    Assert.assertFalse(solution.canWinNim(4));
    Assert.assertFalse(solution.canWinNim(8));
    Assert.assertFalse(solution.canWinNim(12));
    Assert.assertFalse(solution.canWinNim(16));
    Assert.assertFalse(solution.canWinNim(20));
    Assert.assertFalse(solution.canWinNim(24));
    Assert.assertFalse(solution.canWinNim(28));
    Assert.assertFalse(solution.canWinNim(32));
    Assert.assertFalse(solution.canWinNim(36));
    Assert.assertFalse(solution.canWinNim(40));
  }

  @Test
  public void testNeg() {
    LeetCode292 solution = new LeetCode292();
    Assert.assertFalse(solution.canWinNim(0));
    Assert.assertFalse(solution.canWinNim(-1));
    Assert.assertFalse(solution.canWinNim(-2));
    Assert.assertFalse(solution.canWinNim(-3));
    Assert.assertFalse(solution.canWinNim(-4));
    Assert.assertFalse(solution.canWinNim(-5));
    Assert.assertFalse(solution.canWinNim(-6));
    Assert.assertFalse(solution.canWinNim(-7));
    Assert.assertFalse(solution.canWinNim(-8));
    Assert.assertFalse(solution.canWinNim(-9));
    Assert.assertFalse(solution.canWinNim(-10));
  }
}
