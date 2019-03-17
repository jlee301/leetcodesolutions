package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0992;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0992 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,1,2,3};
    int K = 2;
    LeetCode0992 solution = new LeetCode0992();
    Assert.assertEquals(7, solution.subarraysWithKDistinct(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,2,1,3,4};
    int K = 3;
    LeetCode0992 solution = new LeetCode0992();
    Assert.assertEquals(3, solution.subarraysWithKDistinct(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2,1,2,1,2};
    int K = 2;
    LeetCode0992 solution = new LeetCode0992();
    Assert.assertEquals(10, solution.subarraysWithKDistinct(A, K));
  }
}
