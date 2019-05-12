package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1043;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1043 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,15,7,9,2,5,10};
    int K = 3;
    LeetCode1043 solution = new LeetCode1043();
    Assert.assertEquals(84, solution.maxSumAfterPartitioning(A, K));
  }
}
