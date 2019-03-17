package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0908;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0908 {
  @Test
  public void testProblemCase1() {
    int[] A = {1};
    int K = 0;
    LeetCode0908 solution = new LeetCode0908();
    Assert.assertEquals(0, solution.smallestRangeI(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {0,10};
    int K = 2;
    LeetCode0908 solution = new LeetCode0908();
    Assert.assertEquals(6, solution.smallestRangeI(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,3,6};
    int K = 3;
    LeetCode0908 solution = new LeetCode0908();
    Assert.assertEquals(0, solution.smallestRangeI(A, K));
  }
}
