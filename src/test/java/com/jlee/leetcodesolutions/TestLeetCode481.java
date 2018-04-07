package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode481;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode481 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(0, solution.magicalString(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(1, solution.magicalString(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(2, solution.magicalString(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(3, solution.magicalString(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(3, solution.magicalString(n));
  }

  @Test
  public void test7() {
    int n = 7;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test8() {
    int n = 8;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test9() {
    int n = 9;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(4, solution.magicalString(n));
  }

  @Test
  public void test10() {
    int n = 10;
    LeetCode481 solution = new LeetCode481();
    Assert.assertEquals(5, solution.magicalString(n));
  }
}
