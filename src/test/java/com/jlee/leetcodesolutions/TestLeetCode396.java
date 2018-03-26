package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode396;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode396 {
  @Test
  public void testProblemCase() {
    int[] A = {4, 3, 2, 6};
    LeetCode396 solution = new LeetCode396();
    Assert.assertEquals(26, solution.maxRotateFunction(A));
  }

  @Test
  public void testEmpty() {
    int[] A = {};
    LeetCode396 solution = new LeetCode396();
    Assert.assertEquals(0, solution.maxRotateFunction(A));
  }

  @Test
  public void testNull() {
    int[] A = null;
    LeetCode396 solution = new LeetCode396();
    Assert.assertEquals(0, solution.maxRotateFunction(A));
  }
}
