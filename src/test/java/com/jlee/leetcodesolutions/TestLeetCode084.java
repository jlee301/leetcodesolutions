package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode084;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode084 {
  @Test
  public void testProblemCase1() {
    int[] heights = {2,1,5,6,2,3};
    LeetCode084 solution = new LeetCode084();
    Assert.assertEquals(10, solution.largestRectangleArea(heights));
  }

  @Test
  public void testProblemCase2() {
    int[] heights = {};
    LeetCode084 solution = new LeetCode084();
    Assert.assertEquals(0, solution.largestRectangleArea(heights));
  }

  @Test
  public void testProblemCase3() {
    int[] heights = null;
    LeetCode084 solution = new LeetCode084();
    Assert.assertEquals(0, solution.largestRectangleArea(heights));
  }
}
