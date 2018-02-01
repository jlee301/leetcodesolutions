package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode050;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode050 {
  @Test
  public void testProblemCase1() {
    double x = 2.00000;
    int n = 10;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(1024.0, solution.myPow(x, n), 0.0);
  }

  @Test
  public void testProblemCase2() {
    double x = 2.10000;
    int n = 3;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(9.261000000000001, solution.myPow(x, n), 0.0);
  }

  @Test
  public void testNeg() {
    double x = 2.0;
    int n = -2;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(0.25, solution.myPow(x, n), 0.0);
  }

  @Test
  public void testZero() {
    double x = 0.0;
    int n = 1;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(0.0, solution.myPow(x, n), 0.0);
  }

  @Test
  public void testPowerZero() {
    double x = 0.0;
    int n = 0;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(1.0, solution.myPow(x, n), 0.0);
  }

  @Test
  public void testProblemCase1Better() {
    double x = 2.00000;
    int n = 10;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(1024.0, solution.myPowBetter(x, n), 0.0);
  }

  @Test
  public void testProblemCase2Better() {
    double x = 2.10000;
    int n = 3;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(9.261000000000001, solution.myPowBetter(x, n), 0.0);
  }

  @Test
  public void testNegBetter() {
    double x = 2.0;
    int n = -2;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(0.25, solution.myPowBetter(x, n), 0.0);
  }

  @Test
  public void testZeroBetter() {
    double x = 0.0;
    int n = 1;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(0.0, solution.myPowBetter(x, n), 0.0);
  }

  @Test
  public void testPowerZeroBetter() {
    double x = 0.0;
    int n = 0;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(1.0, solution.myPowBetter(x, n), 0.0);
  }

  @Test
  public void testTimeLimitBetter() {
    double x = 0.00001;
    int n = Integer.MAX_VALUE;
    LeetCode050 solution = new LeetCode050();
    Assert.assertEquals(0.0, solution.myPowBetter(x, n), 0.0);
  }
}
