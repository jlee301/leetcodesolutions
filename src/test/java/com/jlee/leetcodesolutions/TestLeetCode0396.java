package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0396;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0396 {
  @Test
  public void testProblemCase() {
    int[] A = {4, 3, 2, 6};
    LeetCode0396 solution = new LeetCode0396();
    Assert.assertEquals(26, solution.maxRotateFunction(A));
  }

  @Test
  public void testEmpty() {
    int[] A = {};
    LeetCode0396 solution = new LeetCode0396();
    Assert.assertEquals(0, solution.maxRotateFunction(A));
  }

  @Test
  public void testNull() {
    int[] A = null;
    LeetCode0396 solution = new LeetCode0396();
    Assert.assertEquals(0, solution.maxRotateFunction(A));
  }
}
