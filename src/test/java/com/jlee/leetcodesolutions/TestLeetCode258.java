package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode258;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode258 {
  @Test
  public void test38() {
    int num = 38;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(2, solution.addDigits(num));
  }

  @Test
  public void test999() {
    int num = 99;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(9, solution.addDigits(num));
  }

  @Test
  public void test8() {
    int num = 8;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(8, solution.addDigits(num));
  }

  @Test
  public void test0() {
    int num = 0;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(0, solution.addDigits(num));
  }

  @Test
  public void testNeg() {
    int num = -10;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(-10, solution.addDigits(num));
  }

  @Test
  public void test38NoLoops() {
    int num = 38;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(2, solution.addDigitsNoLoops(num));
  }

  @Test
  public void test999NoLoops() {
    int num = 99;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(9, solution.addDigitsNoLoops(num));
  }

  @Test
  public void test8NoLoops() {
    int num = 8;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(8, solution.addDigitsNoLoops(num));
  }

  @Test
  public void test0NoLoops() {
    int num = 0;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(0, solution.addDigitsNoLoops(num));
  }

  @Test
  public void testNegNoLoops() {
    int num = -10;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(-10, solution.addDigitsNoLoops(num));
  }
}
