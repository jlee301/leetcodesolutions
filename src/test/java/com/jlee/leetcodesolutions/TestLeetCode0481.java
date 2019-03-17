package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0481;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0481 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(0, solution.magicalString(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(2, solution.magicalString(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(3, solution.magicalString(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(3, solution.magicalString(n));
  }

  @Test
  public void test7() {
    int n = 7;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test8() {
    int n = 8;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test9() {
    int n = 9;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test10() {
    int n = 10;
    LeetCode0481 solution = new LeetCode0481();
    Assert.assertEquals(5, solution.magicalString(n));
  }
}
