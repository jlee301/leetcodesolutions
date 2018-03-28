package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode413;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode413 {
  @Test
  public void testProblemCase1() {
    int[] A = {1, 3, 5, 7, 9};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(6, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {7, 7, 7, 7};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(3, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {3, -1, -5, -9};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(3, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1, 1, 2, 5, 7};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(0, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {1, 2, 3, 4};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(3, solution.numberOfArithmeticSlices(A));
  }


  @Test
  public void testMultipleDiffs() {
    int[] A = {1, 2, 3, 4, 100, 200, 300, 400};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(6, solution.numberOfArithmeticSlices(A));
  }

@Test
  public void testEmpty() {
    int[] A = {};
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(0, solution.numberOfArithmeticSlices(A));
  }

  @Test
  public void testNull() {
    int[] A = null;
    LeetCode413 solution = new LeetCode413();
    Assert.assertEquals(0, solution.numberOfArithmeticSlices(A));
  }
}
