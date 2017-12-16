package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode172;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode172 {
  @Test
  public void test1() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(1);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test4() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(4);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test5() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(5);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test9() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(9);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test10() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(10);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test14() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(14);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test15() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(15);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test19() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(19);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test20() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(20);
    Assert.assertEquals(4, result);
  }

  @Test
  public void test24() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(24);
    Assert.assertEquals(4, result);
  }

  @Test
  public void test25() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(25);
    Assert.assertEquals(6, result);
  }

  @Test
  public void test29() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(29);
    Assert.assertEquals(6, result);
  }

  @Test
  public void test30() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(30);
    Assert.assertEquals(7, result);
  }

  @Test
  public void test0() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeg() {
    LeetCode172 solution = new LeetCode172();
    int result = solution.trailingZeroes(-1);
    Assert.assertEquals(0, result);
  }
}
