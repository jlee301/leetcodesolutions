package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode509;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode509 {
  @Test
  public void testProblemCase1() {
    int N = 0;
    LeetCode509 solution = new LeetCode509();
    Assert.assertEquals(0, solution.fib(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 1;
    LeetCode509 solution = new LeetCode509();
    Assert.assertEquals(1, solution.fib(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 2;
    LeetCode509 solution = new LeetCode509();
    Assert.assertEquals(1, solution.fib(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 3;
    LeetCode509 solution = new LeetCode509();
    Assert.assertEquals(2, solution.fib(N));
  }
}
