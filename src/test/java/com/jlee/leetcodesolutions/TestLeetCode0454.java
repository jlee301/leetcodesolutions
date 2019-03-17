package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0454;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0454 {
  @Test
  public void testProblemCase() {
    int[] A = {1,2};
    int[] B = {-2,-1};
    int[] C = {-1,2};
    int[] D = {0,2};
    LeetCode0454 solution = new LeetCode0454();
    Assert.assertEquals(2, solution.fourSumCount(A, B, C, D));
  }

  @Test
  public void testEmpty() {
    int[] A = {};
    int[] B = {};
    int[] C = {};
    int[] D = {};
    LeetCode0454 solution = new LeetCode0454();
    Assert.assertEquals(0, solution.fourSumCount(A, B, C, D));
  }
}
