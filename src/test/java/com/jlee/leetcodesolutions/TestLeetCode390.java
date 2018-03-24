package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode390;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode390 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(1, solution.lastRemaining(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(2, solution.lastRemaining(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(4, solution.lastRemaining(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(4, solution.lastRemaining(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN11() {
    int n = 11;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN12() {
    int n = 12;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN13() {
    int n = 13;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN14() {
    int n = 14;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN15() {
    int n = 15;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN16() {
    int n = 16;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN17() {
    int n = 17;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN18() {
    int n = 18;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN19() {
    int n = 19;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(8, solution.lastRemaining(n));
  }

  @Test
  public void testN20() {
    int n = 20;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(6, solution.lastRemaining(n));
  }

  @Test
  public void testN1000000() {
    int n = 1000000;
    LeetCode390 solution = new LeetCode390();
    Assert.assertEquals(481110, solution.lastRemaining(n));
  }
}
