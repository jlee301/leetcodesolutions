package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0365;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0365 {
  @Test
  public void testProblemCase1() {
    int x = 3, y = 5, z = 4;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertTrue(solution.canMeasureWater(x, y, z));
  }

  @Test
  public void testProblemCase2() {
    int x = 2, y = 6, z = 5;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertFalse(solution.canMeasureWater(x, y, z));
  }

  @Test
  public void testMeasureZero() {
    int x = 2, y = 6, z = 0;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertTrue(solution.canMeasureWater(x, y, z));
  }

  @Test
  public void testAllZero() {
    int x = 0, y = 0, z = 0;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertTrue(solution.canMeasureWater(x, y, z));
  }

  @Test
  public void testZGreaterThanXY() {
    int x = 1, y = 1, z = 12;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertFalse(solution.canMeasureWater(x, y, z));
  }

  @Test
  public void testOneJugZero() {
    int x = 0, y = 6, z = 5;
    LeetCode0365 solution = new LeetCode0365();
    Assert.assertFalse(solution.canMeasureWater(x, y, z));
  }
}
