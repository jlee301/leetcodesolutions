package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0446;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0446 {
  @Test
  public void testProblemCase1() {
    int[] A = {2, 4, 6, 8, 10};
    LeetCode0446 solution = new LeetCode0446();
    Assert.assertEquals(7, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2, 4, 6, 8, 10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE};
    LeetCode0446 solution = new LeetCode0446();
    Assert.assertEquals(7, solution.numberOfArithmeticSlices(A));
  }
}
