package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0357;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0357 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(1, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(10, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(91, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(739, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(5275, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(32491, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(168571, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(712891, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(2345851, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(5611771, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(8877691, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN11() {
    int n = 11;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(8877691, solution.countNumbersWithUniqueDigits(n));
  }

  @Test
  public void testN12() {
    int n = 12;
    LeetCode0357 solution = new LeetCode0357();
    Assert.assertEquals(8877691, solution.countNumbersWithUniqueDigits(n));
  }
}
