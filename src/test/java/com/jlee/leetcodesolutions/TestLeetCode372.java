package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode372;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode372 {
  @Test
  public void testProblemCase1() {
    int a = 2;
    int[] b = {3};
    LeetCode372 solution = new LeetCode372();
    Assert.assertEquals(8, solution.superPow(a, b));
  }

  @Test
  public void testProblemCase2() {
    int a = 2;
    int[] b = {1,0};
    LeetCode372 solution = new LeetCode372();
    Assert.assertEquals(1024, solution.superPow(a, b));
  }

  @Test
  public void testMaxInteger() {
    int a = Integer.MAX_VALUE;
    int[] b = {2,0,0};
    LeetCode372 solution = new LeetCode372();
    Assert.assertEquals(1198, solution.superPow(a, b));
  }

  @Test
  public void testEmpty() {
    int a = 2;
    int[] b = {};
    LeetCode372 solution = new LeetCode372();
    Assert.assertEquals(1, solution.superPow(a, b));
  }

  @Test
  public void testNull() {
    int a = 2;
    int[] b = null;
    LeetCode372 solution = new LeetCode372();
    Assert.assertEquals(1, solution.superPow(a, b));
  }
}
