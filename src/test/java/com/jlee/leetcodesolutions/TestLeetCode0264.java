package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0264;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0264 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(1, solution.nthUglyNumber(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(2, solution.nthUglyNumber(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(3, solution.nthUglyNumber(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(4, solution.nthUglyNumber(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(5, solution.nthUglyNumber(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(6, solution.nthUglyNumber(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(8, solution.nthUglyNumber(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(9, solution.nthUglyNumber(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(10, solution.nthUglyNumber(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(12, solution.nthUglyNumber(n));
  }

  @Test
  public void testN1690() {
    int n = 1690;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(2123366400, solution.nthUglyNumber(n));
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode0264 solution = new LeetCode0264();
    Assert.assertEquals(0, solution.nthUglyNumber(n));
  }
}
