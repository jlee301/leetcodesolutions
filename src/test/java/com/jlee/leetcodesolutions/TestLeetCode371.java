package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode371;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode371 {
  @Test
  public void testA1B2() {
    LeetCode371 solution = new LeetCode371();
    int a = 1;
    int b = 2;
    Assert.assertEquals(3, solution.getSum(a, b));
  }

  @Test
  public void testA2B3() {
    LeetCode371 solution = new LeetCode371();
    int a = 2;
    int b = 3;
    Assert.assertEquals(5, solution.getSum(a, b));
  }

  @Test
  public void testA1000B24() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = 24;
    Assert.assertEquals(1024, solution.getSum(a, b));
  }

  @Test
  public void testA1000BNeg24() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = -24;
    Assert.assertEquals(976, solution.getSum(a, b));
  }

  @Test
  public void testA24BNeg1000() {
    LeetCode371 solution = new LeetCode371();
    int a = 24;
    int b = -1000;
    Assert.assertEquals(-976, solution.getSum(a, b));
  }

  @Test
  public void testANeg1000BNeg24() {
    LeetCode371 solution = new LeetCode371();
    int a = -1000;
    int b = -24;
    Assert.assertEquals(-1024, solution.getSum(a, b));
  }

  @Test
  public void testA0B1000() {
    LeetCode371 solution = new LeetCode371();
    int a = 0;
    int b = 1000;
    Assert.assertEquals(1000, solution.getSum(a, b));
  }

  @Test
  public void testA1000B0() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = 0;
    Assert.assertEquals(1000, solution.getSum(a, b));
  }

  @Test
  public void testZeroes() {
    LeetCode371 solution = new LeetCode371();
    int a = 0;
    int b = 0;
    Assert.assertEquals(0, solution.getSum(a, b));
  }
}
