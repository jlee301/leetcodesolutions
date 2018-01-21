package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode762;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode762 {
  @Test
  public void testProblemCase1() {
    int L = 6, R = 10;
    LeetCode762 solution = new LeetCode762();
    Assert.assertEquals(4, solution.countPrimeSetBits(L, R));
  }

  @Test
  public void testProblemCase2() {
    int L = 10, R = 15;
    LeetCode762 solution = new LeetCode762();
    Assert.assertEquals(5, solution.countPrimeSetBits(L, R));
  }

  @Test
  public void testLLessThan1() {
    int L = 0, R = 1;
    LeetCode762 solution = new LeetCode762();
    Assert.assertEquals(0, solution.countPrimeSetBits(L, R));
  }

  @Test
  public void testRLessThan1() {
    int L = 1, R = 0;
    LeetCode762 solution = new LeetCode762();
    Assert.assertEquals(0, solution.countPrimeSetBits(L, R));
  }

  @Test
  public void testLGreaterThanR() {
    int L = 2, R = 1;
    LeetCode762 solution = new LeetCode762();
    Assert.assertEquals(0, solution.countPrimeSetBits(L, R));
  }
}
