package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode930;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode930 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,0,1,0,1};
    int S = 2;
    LeetCode930 solution = new LeetCode930();
    Assert.assertEquals(4, solution.numSubarraysWithSum(A, S));
  }
}
