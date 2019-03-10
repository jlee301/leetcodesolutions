package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1005;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1005 {
  @Test
  public void testProblemCase1() {
    int[] A = {4,2,3};
    int K = 1;
    LeetCode1005 solution = new LeetCode1005();
    Assert.assertEquals(5, solution.largestSumAfterKNegations(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,-1,0,2};
    int K = 3;
    LeetCode1005 solution = new LeetCode1005();
    Assert.assertEquals(6, solution.largestSumAfterKNegations(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2,-3,-1,5,-4};
    int K = 2;
    LeetCode1005 solution = new LeetCode1005();
    Assert.assertEquals(13, solution.largestSumAfterKNegations(A, K));
  }
}
