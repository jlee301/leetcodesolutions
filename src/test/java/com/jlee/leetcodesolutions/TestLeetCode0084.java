package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0084;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0084 {
  @Test
  public void testProblemCase1() {
    int[] heights = {2,1,5,6,2,3};
    LeetCode0084 solution = new LeetCode0084();
    Assert.assertEquals(10, solution.largestRectangleArea(heights));
  }

  @Test
  public void testProblemCase2() {
    int[] heights = {};
    LeetCode0084 solution = new LeetCode0084();
    Assert.assertEquals(0, solution.largestRectangleArea(heights));
  }

  @Test
  public void testProblemCase3() {
    int[] heights = null;
    LeetCode0084 solution = new LeetCode0084();
    Assert.assertEquals(0, solution.largestRectangleArea(heights));
  }
}
