package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0343;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0343 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(1, solution.integerBreak(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(1, solution.integerBreak(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(1, solution.integerBreak(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(2, solution.integerBreak(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(4, solution.integerBreak(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(6, solution.integerBreak(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(9, solution.integerBreak(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(12, solution.integerBreak(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(18, solution.integerBreak(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(27, solution.integerBreak(n));
  }
  
  @Test
  public void testN10() {
    int n = 10;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(36, solution.integerBreak(n));
  }
  
  @Test
  public void testN11() {
    int n = 11;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(54, solution.integerBreak(n));
  }
  
  @Test
  public void testN12() {
    int n = 12;
    LeetCode0343 solution = new LeetCode0343();
    Assert.assertEquals(81, solution.integerBreak(n));
  }
}
