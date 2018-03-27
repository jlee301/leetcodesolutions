package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode397;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode397 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(0, solution.integerReplacement(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(1, solution.integerReplacement(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(2, solution.integerReplacement(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(2, solution.integerReplacement(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(3, solution.integerReplacement(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(3, solution.integerReplacement(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(4, solution.integerReplacement(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(3, solution.integerReplacement(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(4, solution.integerReplacement(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(4, solution.integerReplacement(n));
  }

  @Test
  public void testNMaxInteger() {
    int n = Integer.MAX_VALUE;
    LeetCode397 solution = new LeetCode397();
    Assert.assertEquals(32, solution.integerReplacement(n));
  }
}
