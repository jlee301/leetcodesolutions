package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode042;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode042 {
  @Test
  public void testProblemCase1() {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    LeetCode042 solution = new LeetCode042();
    Assert.assertEquals(6, solution.trap(height));
  }
}
