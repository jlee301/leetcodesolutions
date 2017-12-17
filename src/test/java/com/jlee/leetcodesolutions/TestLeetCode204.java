package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode204;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode204 {
  @Test
  public void test15() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(15);
    Assert.assertEquals(6, result);
  }

  @Test
  public void test0() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test1() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(1);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test2() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(2);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test3() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(3);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testNeg() {
    LeetCode204 solution = new LeetCode204();
    int result = solution.countPrimes(-1);
    Assert.assertEquals(0, result);
  }
}
