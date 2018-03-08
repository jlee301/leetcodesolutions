package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode279;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode279 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(1, solution.numSquares(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(2, solution.numSquares(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(3, solution.numSquares(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(1, solution.numSquares(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(2, solution.numSquares(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(3, solution.numSquares(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(4, solution.numSquares(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(2, solution.numSquares(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(1, solution.numSquares(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(2, solution.numSquares(n));
  }

  @Test
  public void testN11() {
    int n = 11;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(3, solution.numSquares(n));
  }
  
  @Test
  public void testN12() {
    int n = 12;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(3, solution.numSquares(n));
  }

  @Test
  public void testN13() {
    int n = 13;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(2, solution.numSquares(n));
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(0, solution.numSquares(n));
  }

  @Test
  public void testNNeg() {
    int n = -1;
    LeetCode279 solution = new LeetCode279();
    Assert.assertEquals(0, solution.numSquares(n));
  }
}
