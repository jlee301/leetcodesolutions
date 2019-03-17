package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0390;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0390 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(1, solution.lastRemaining(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(4, solution.lastRemaining(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(4, solution.lastRemaining(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN11() {
    int n = 11;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN12() {
    int n = 12;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN13() {
    int n = 13;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN14() {
    int n = 14;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN15() {
    int n = 15;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN16() {
    int n = 16;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN17() {
    int n = 17;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN18() {
    int n = 18;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN19() {
    int n = 19;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN20() {
    int n = 20;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN1000000() {
    int n = 1000000;
    LeetCode0390 solution = new LeetCode0390();
    Assert.assertEquals(481110, solution.lastRemaining(n));
  }
}
