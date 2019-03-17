package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0930;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0930 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,0,1,0,1};
    int S = 2;
    LeetCode0930 solution = new LeetCode0930();
    Assert.assertEquals(4, solution.numSubarraysWithSum(A, S));
  }
}
