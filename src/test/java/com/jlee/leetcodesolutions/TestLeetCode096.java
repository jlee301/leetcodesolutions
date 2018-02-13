package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode096;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode096 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(1, solution.numTrees(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(1, solution.numTrees(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(2, solution.numTrees(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(5, solution.numTrees(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(14, solution.numTrees(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(42, solution.numTrees(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(132, solution.numTrees(n));
  }

  @Test
  public void testNNeg() {
    int n = -1;
    LeetCode096 solution = new LeetCode096();
    Assert.assertEquals(1, solution.numTrees(n));
  }
}
