package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode029;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode029 {
  @Test
  public void testSimpleDivide() {
    int dividend = 14;
    int divisor = 2;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(7, solution.divide(dividend, divisor));
  }

  @Test
  public void testNegDividend() {
    int dividend = -14;
    int divisor = 2;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(-7, solution.divide(dividend, divisor));
  }

  @Test
  public void testNegDivisor() {
    int dividend = 14;
    int divisor = -2;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(-7, solution.divide(dividend, divisor));
  }

  @Test
  public void testBothNeg() {
    int dividend = -14;
    int divisor = -2;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(7, solution.divide(dividend, divisor));
  }

  @Test
  public void testMaxIntegerReturn() {
    int dividend = Integer.MIN_VALUE;
    int divisor = -1;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(Integer.MAX_VALUE, solution.divide(dividend, divisor));
  }

  @Test
  public void testMinIntegerDivide() {
    int dividend = Integer.MIN_VALUE;
    int divisor = Integer.MIN_VALUE;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(1, solution.divide(dividend, divisor));
  }

  @Test
  public void testMaxIntegerDivide() {
    int dividend = Integer.MAX_VALUE;
    int divisor = Integer.MAX_VALUE;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(1, solution.divide(dividend, divisor));
  }

  @Test
  public void testDividendZero() {
    int dividend = 0;
    int divisor = 1;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(0, solution.divide(dividend, divisor));
  }

  @Test
  public void testDivisorZero() {
    int dividend = 1;
    int divisor = 0;
    LeetCode029 solution = new LeetCode029();
    Assert.assertEquals(0, solution.divide(dividend, divisor));
  }
}
