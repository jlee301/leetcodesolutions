package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode454;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode454 {
  @Test
  public void testProblemCase() {
    int[] A = {1,2};
    int[] B = {-2,-1};
    int[] C = {-1,2};
    int[] D = {0,2};
    LeetCode454 solution = new LeetCode454();
    Assert.assertEquals(2, solution.fourSumCount(A, B, C, D));
  }

  @Test
  public void testEmpty() {
    int[] A = {};
    int[] B = {};
    int[] C = {};
    int[] D = {};
    LeetCode454 solution = new LeetCode454();
    Assert.assertEquals(0, solution.fourSumCount(A, B, C, D));
  }
}
