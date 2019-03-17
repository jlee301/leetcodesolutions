package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0954;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0954 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,1,3,6};
    LeetCode0954 solution = new LeetCode0954();
    Assert.assertFalse(solution.canReorderDoubled(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2,1,2,6};
    LeetCode0954 solution = new LeetCode0954();
    Assert.assertFalse(solution.canReorderDoubled(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {4,-2,2,-4};
    LeetCode0954 solution = new LeetCode0954();
    Assert.assertTrue(solution.canReorderDoubled(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,2,4,16,8,4};
    LeetCode0954 solution = new LeetCode0954();
    Assert.assertFalse(solution.canReorderDoubled(A));
  }
}
