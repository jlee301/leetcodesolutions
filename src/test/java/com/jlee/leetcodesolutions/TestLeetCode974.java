package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode974;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode974 {
  @Test
  public void testProblemCase1() {
    int[] A = {4,5,0,-2,-3,1};
    int K = 5;
    LeetCode974 solution = new LeetCode974();
    Assert.assertEquals(7, solution.subarraysDivByK(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {-3,-5};
    int K = 5;
    LeetCode974 solution = new LeetCode974();
    Assert.assertEquals(1, solution.subarraysDivByK(A, K));
  }
}
