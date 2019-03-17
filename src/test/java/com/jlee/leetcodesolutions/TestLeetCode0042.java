package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0042;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0042 {
  @Test
  public void testProblemCase1() {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    LeetCode0042 solution = new LeetCode0042();
    Assert.assertEquals(6, solution.trap(height));
  }
}
