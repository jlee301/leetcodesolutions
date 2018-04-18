package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode576;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode576 {
  @Test
  public void testProblemCase1() {
    int m = 2, n = 2, N = 2, i = 0, j = 0;
    LeetCode576 solution = new LeetCode576();
    Assert.assertEquals(6, solution.findPaths(m, n, N, i, j));
  }

  @Test
  public void testProblemCase2() {
    int m = 1, n = 3, N = 3, i = 0, j = 1;
    LeetCode576 solution = new LeetCode576();
    Assert.assertEquals(12, solution.findPaths(m, n, N, i, j));
  }

  @Test
  public void testMaxConditions() {
    int m = 50, n = 50, N = 50, i = 0, j = 0;
    LeetCode576 solution = new LeetCode576();
    Assert.assertEquals(678188903, solution.findPaths(m, n, N, i, j));
  }

  @Test
  public void testNoSteps() {
    int m = 50, n = 50, N = 0, i = 0, j = 0;
    LeetCode576 solution = new LeetCode576();
    Assert.assertEquals(0, solution.findPaths(m, n, N, i, j));
  }
}
