package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode795;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode795 {
  @Test
  public void testProblemCase() {
    int[] A = {2, 1, 4, 3};
    int L = 2, R = 3;
    LeetCode795 solution = new LeetCode795();
    Assert.assertEquals(3, solution.numSubarrayBoundedMax(A, L, R));
  }

  @Test
  public void testUnderRange() {
    int[] A = {1, 1, 1, 1};
    int L = 2, R = 3;
    LeetCode795 solution = new LeetCode795();
    Assert.assertEquals(0, solution.numSubarrayBoundedMax(A, L, R));
  }

  @Test
  public void testOverRange() {
    int[] A = {4, 4, 4, 4};
    int L = 2, R = 3;
    LeetCode795 solution = new LeetCode795();
    Assert.assertEquals(0, solution.numSubarrayBoundedMax(A, L, R));
  }

  @Test
  public void testEndsOutOfRange() {
    int[] A = {2, 1, 3, 4};
    int L = 2, R = 3;
    LeetCode795 solution = new LeetCode795();
    Assert.assertEquals(5, solution.numSubarrayBoundedMax(A, L, R));
  }

  @Test
  public void testEndsInRange() {
    int[] A = {1, 1, 2};
    int L = 2, R = 3;
    LeetCode795 solution = new LeetCode795();
    Assert.assertEquals(3, solution.numSubarrayBoundedMax(A, L, R));
  }
}
