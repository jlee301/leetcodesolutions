package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode446;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode446 {
  @Test
  public void testProblemCase1() {
    int[] A = {2, 4, 6, 8, 10};
    LeetCode446 solution = new LeetCode446();
    Assert.assertEquals(7, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2, 4, 6, 8, 10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE};
    LeetCode446 solution = new LeetCode446();
    Assert.assertEquals(7, solution.numberOfArithmeticSlices(A));
  }
}
