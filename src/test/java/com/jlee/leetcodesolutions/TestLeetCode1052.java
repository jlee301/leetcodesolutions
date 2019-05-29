package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1052;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1052 {
  @Test
  public void testProblemCase1() {
    int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
    int X = 3;
    LeetCode1052 solution = new LeetCode1052();
    Assert.assertEquals(16, solution.maxSatisfied(customers, grumpy, X));
  }
}
